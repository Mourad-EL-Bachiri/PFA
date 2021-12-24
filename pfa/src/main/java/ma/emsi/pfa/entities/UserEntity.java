package ma.emsi.pfa.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity(name = "users")
@DiscriminatorValue("User") 
public class UserEntity extends ParticipentEntity {
	
	private String email;
	private String encryptedPassword;
	public UserEntity(String email, String encryptedPassword) {
		super();
		this.email = email;
		this.encryptedPassword = encryptedPassword;
	}
	public UserEntity() {
		super();
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	
	

	
	

}
