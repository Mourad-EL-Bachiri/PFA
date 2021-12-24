package ma.emsi.pfa.responses;

public class ParticipentResponse {
	
	private String participentId;
	private String nom;
	private String prenom;
	private String telephone;
	private String adresse;
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
