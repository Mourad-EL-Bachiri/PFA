package ma.emsi.pfa.restController;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ma.emsi.pfa.dto.ParticipentDto;
import ma.emsi.pfa.requests.ParticipentRequest;
import ma.emsi.pfa.responses.ParticipentResponse;
import ma.emsi.pfa.services.ParticipentService;

@RequestMapping("/participents")
@RestController
public class ParticipentController {
	
	@Autowired
	ParticipentService participentService;
	
	@PostMapping
	public ResponseEntity<ParticipentResponse> createParticipent(@RequestBody ParticipentRequest participentRequest) {
		
		ModelMapper modelMapper = new ModelMapper();
		ParticipentDto participentDto = modelMapper.map(participentRequest, ParticipentDto.class);
		ParticipentDto crateParticipent = participentService.createParticipent(participentDto);
		ParticipentResponse participentResponse = modelMapper.map(crateParticipent, ParticipentResponse.class);
		return new ResponseEntity<>(participentResponse, HttpStatus.CREATED);
	}

}
