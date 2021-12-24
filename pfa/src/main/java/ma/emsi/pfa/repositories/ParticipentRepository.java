package ma.emsi.pfa.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ma.emsi.pfa.entities.ParticipentEntity;
import ma.emsi.pfa.entities.UserEntity;

@Repository
public interface ParticipentRepository extends PagingAndSortingRepository<ParticipentEntity, Long> {
	
	ParticipentEntity findByParticipentId(String participentId);
	ParticipentEntity findBynom(String nom);
	ParticipentEntity findByprenom(String prenom);
	UserEntity findByEmail(String email);
	
 
}
