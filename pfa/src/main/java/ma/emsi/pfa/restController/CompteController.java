package ma.emsi.pfa.restController;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.pfa.dto.CompteDto;
import ma.emsi.pfa.requests.CompteRequest;
import ma.emsi.pfa.responses.CompteResponse;
import ma.emsi.pfa.services.CompteService;



@RequestMapping("/comptes")
@RestController
public class CompteController {
	
	@Autowired
	CompteService compteService;
	
	@GetMapping (
			path = "/{id}",
			produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }
			)
	public ResponseEntity<CompteResponse> getCompteById(@PathVariable String id) {
		CompteDto compteDto = CompteService.getUserByUserId(id);
		CompteResponse compteResponse = new CompteResponse();
		BeanUtils.copyProperties(compteDto, compteResponse);
		return new ResponseEntity<>(compteResponse, HttpStatus.OK);
	}
	
	@PostMapping(
			produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
			consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }
			)
	public ResponseEntity<CompteResponse> createCompte(@RequestBody CompteRequest compteRequest) {
		
		ModelMapper modelMapper = new ModelMapper();
		CompteDto compteDto = modelMapper.map(compteRequest, CompteDto.class);
		CompteDto crateCompte = compteService.createCompte(compteDto);
		CompteResponse compteResponse = modelMapper.map(crateCompte, CompteResponse.class);
		return new ResponseEntity<>(compteResponse, HttpStatus.CREATED);
	}
	
	@PutMapping(
			produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
			consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }
			)
	public String updateCompte() {
		return "update";
	}
	
	@DeleteMapping
	public String deleteCompte() {
		return "delete";
	}

}
