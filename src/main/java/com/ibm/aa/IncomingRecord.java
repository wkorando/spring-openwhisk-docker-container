package com.ibm.aa;

import java.io.Serializable;

public class IncomingRecord implements Serializable {
	private String message;

	public IncomingRecord() {
	}

	public IncomingRecord(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
