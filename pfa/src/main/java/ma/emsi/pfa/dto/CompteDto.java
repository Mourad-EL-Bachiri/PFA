package ma.emsi.pfa.dto;

import java.io.Serializable;
import java.util.Date;


public class CompteDto implements Serializable {

	
	private static final long serialVersionUID = 7037153024731331405L;
	private Long id;
	private String compteId;
	private String titre;
	private String devise;
	private String description;
	private Double budjetPrevisionnel;
	private Date dateCreation;
	private String type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Double getBudjetPrevisionnel() {
		return budjetPrevisionnel;
	}
	public void setBudjetPrevisionnel(Double budjetPrevisionnel) {
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
