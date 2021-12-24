package ma.emsi.pfa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "comptes")
public class CompteEntity implements Serializable {
	
	
	private static final long serialVersionUID = -3159216755793393410L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String compteId;
	
	@Column(nullable = false , unique = true)
	private String titre;
	
	@Column(nullable = false)
	private String devise;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private Double budjetPrevisionnel;
	
	@Column(nullable = false)
	private Date dateCreation;
	
	@Column(nullable = false)
	private String type;

	public CompteEntity(Long id, String compteId, String titre, String devise, String description,
			Double budjetPrevisionnel, Date dateCreation, String type) {
		super();
		this.id = id;
		this.compteId = compteId;
		this.titre = titre;
		this.devise = devise;
		this.description = description;
		this.budjetPrevisionnel = budjetPrevisionnel;
		this.dateCreation = dateCreation;
		this.type = type;
	}

	public CompteEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

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
