package ma.emsi.pfa.responses;

import java.util.Date;

public class CompteResponse {
	
	private String compteId;
	private String titre;
	private String devise;
	private String description;
	private String budjetPrevisionnel;
    private Date dateCreation;
    private String type;
    
    
	public String getCompteId() {
		return compteId;
	}
	public void setCompteId(String compteId) {
		this.compteId = compteId;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDevise() {
		return devise;
	}
	public void setDevise(String devise) {
		this.devise = devise;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBudjetPrevisionnel() {
		return budjetPrevisionnel;
	}
	public void setBudjetPrevisionnel(String budjetPrevisionnel) {
		this.budjetPrevisionnel = budjetPrevisionnel;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    
    

}
