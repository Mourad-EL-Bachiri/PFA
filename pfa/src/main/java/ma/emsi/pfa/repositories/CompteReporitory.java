package ma.emsi.pfa.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.pfa.entities.CompteEntity;

@Repository
public interface CompteReporitory extends PagingAndSortingRepository<CompteEntity, Long> {
	
	CompteEntity findBytitre(String titre);
	CompteEntity findByCompteId(String compteId);

}
