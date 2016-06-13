package de.fiebiger.v1.response;

import java.util.UUID;



/**
 * Created by tfiebige on 22.03.16.
 */
public class UserResponse {
	private String id;
	private String emailAddress;
	private String password;
	private String additionalField;


	public UserResponse() {
	}


	public UserResponse(String emailAddress, String password) {
		this.emailAddress = emailAddress;
		this.password = password;

		this.id = UUID.randomUUID().toString();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAdditionalField() {
		return additionalField;
	}


	public void setAdditionalField(String additionalField) {
		this.additionalField = additionalField;
	}


	@Override public String toString() {
		return "UserResponse{" +
				"id='" + id + '\'' +
				", emailAddress='" + emailAddress + '\'' +
				", password='" + password + '\'' +
				", additionalField='" + additionalField + '\'' +
				'}';
	}
}
