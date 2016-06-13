package de.fiebiger.v1.request;

/**
 * Created by tfiebige on 22.03.16.
 */
public class UserRequest {
	private String email;
	private String password;
	private String optionalParameter;



	public UserRequest(String email, String password) {
		this.email = email;
		this.password = password;
	}


	public String getOptionalParameter() {
		return optionalParameter;
	}


	public void setOptionalParameter(String optionalParameter) {
		this.optionalParameter = optionalParameter;
	}


	public UserRequest() {
	}

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

}
