package ma.emsi.pfa.servicesImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ma.emsi.pfa.dto.ParticipentDto;
import ma.emsi.pfa.entities.ParticipentEntity;
import ma.emsi.pfa.repositories.ParticipentRepository;
import ma.emsi.pfa.services.ParticipentService;
import ma.emsi.pfa.shared.Utils;

@Service
@Primary
public class ParticipentServiceImpl implements ParticipentService{
	
	@Autowired
	ParticipentRepository participentRepository;

	
	
	@Autowired
	Utils util;

	@Override
	public ParticipentDto createParticipent(ParticipentDto participent) {
		
		ParticipentEntity checkParticipentname = participentRepository.findBynom(participent.getNom());
		ParticipentEntity checkParticipentpname = participentRepository.findByprenom(participent.getPrenom());
		
		if(checkParticipentname != null && checkParticipentpname != null ) throw new RuntimeException("Participent already existe !!");
		ModelMapper modelMapper = new ModelMapper();
		ParticipentEntity participentEntity = modelMapper.map(participent, ParticipentEntity.class);
		participentEntity.setParticipentId(util.generateId(20));
		ParticipentEntity newParticipent = participentRepository.save(participentEntity);
		ParticipentDto participentDto = modelMapper.map(newParticipent, ParticipentDto.class);		
		return participentDto;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}



	

}
