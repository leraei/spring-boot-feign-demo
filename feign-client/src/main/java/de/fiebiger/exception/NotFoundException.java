package de.fiebiger.exception;

/**
 * Created by tfiebige on 27.03.16.
 */
public class NotFoundException extends Exception {

	private int httpStatusCode;

	public NotFoundException(int httpStatusCode, String message) {
		super(message);
		this.httpStatusCode = httpStatusCode;
	}


	public int getHttpStatusCode() {
		return httpStatusCode;
	}


	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}
}
