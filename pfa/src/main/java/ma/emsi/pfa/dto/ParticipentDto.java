package ma.emsi.pfa.dto;

import java.io.Serializable;

public class ParticipentDto implements Serializable{

	
	private static final long serialVersionUID = 4906833334461273169L;
	private Long id;
	private String participentId;
	private String nom;
	private String prenom;
	private String telephone;
	private String adresse;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getParticipentId() {
		return participentId;
	}
	public void setParticipentId(String participentId) {
		this.participentId = participentId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	

}
