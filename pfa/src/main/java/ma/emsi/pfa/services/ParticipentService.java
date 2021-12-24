package ma.emsi.pfa.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import ma.emsi.pfa.dto.ParticipentDto;

public interface ParticipentService extends UserDetailsService {
	
	ParticipentDto createParticipent(ParticipentDto participentDto);

}
