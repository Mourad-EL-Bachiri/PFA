package ma.emsi.pfa.servicesImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.pfa.dto.CompteDto;
import ma.emsi.pfa.dto.UserDto;
import ma.emsi.pfa.entities.CompteEntity;
import ma.emsi.pfa.repositories.CompteReporitory;
import ma.emsi.pfa.services.CompteService;
import ma.emsi.pfa.shared.Utils;

@Service
public class CompteServiceImpl implements CompteService {
	
	@Autowired 
	CompteReporitory compteReporitory;
	
	@Autowired
	Utils util;
	
	

	@Override
	public CompteDto createCompte(CompteDto compte) {
		
		CompteEntity checkCompte = compteReporitory.findBytitre(compte.getTitre());
		if(checkCompte != null ) throw new RuntimeException("Compte already existe !!");
		ModelMapper modelMapper = new ModelMapper();
		CompteEntity compteEntity = modelMapper.map(compte, CompteEntity.class);
		compteEntity.setCompteId(util.generateId(20));
		CompteEntity newCompte = compteReporitory.save(compteEntity);
		CompteDto compteDto = modelMapper.map(newCompte, CompteDto.class);		
		return compteDto;
	}

	
	@Override
	public CompteDto getCompteById(CompteDto compteDto) {
		CompteEntity userEntity = compteReporitory.findByUserId(compteId);
		if(userEntity == null) throw new RuntimeException("Ce compte n'existe pas");
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userEntity, userDto);
		return userDto;
	}

}
