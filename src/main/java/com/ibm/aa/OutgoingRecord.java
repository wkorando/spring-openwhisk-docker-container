package com.ibm.aa;

import java.io.Serializable;

public class OutgoingRecord implements Serializable {
	private String message;

	public OutgoingRecord(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
