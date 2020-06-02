package com.ibm.function;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Wrapper class for holding credential information for connection to a cloud service.<br/>
 * 
 * JSON object looks like below: <br/>
 * { __bx_creds:", <br/>
 * { 'cloud-object-storage':", <br/>
 * { {@link CosCredentials} } <br/>
 */
public class BluemixCredentials {

	@JsonProperty("cloud-object-storage")
	CosCredentials cosCredentials;

	public CosCredentials getCosCredentials() {
		return cosCredentials;
	}

	public void setCosCredentials(CosCredentials cosCredentials) {
		this.cosCredentials = cosCredentials;
	}

	@Override
	public String toString() {
		return "Credentials [cosCredentials=" + cosCredentials.toString() + "]";
	}
	
	
}
