package ma.emsi.pfa.dto;

import java.io.Serializable;

public class UserDto extends ParticipentDto implements Serializable {

	
	
	private static final long serialVersionUID = -3108435375459587976L;
	private String email;
	private String password;
	private String encryptedPassword;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	
	

}
