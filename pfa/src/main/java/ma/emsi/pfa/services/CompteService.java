package ma.emsi.pfa.services;

import ma.emsi.pfa.dto.CompteDto;

public interface CompteService {
	
	CompteDto createCompte(CompteDto compteDto);
	CompteDto getByCompteId(CompteDto compteDto );

}
