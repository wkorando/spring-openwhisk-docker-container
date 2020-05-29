package com.ibm.function;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * { __bx_creds:",
        "2020-05-29T16:08:47.626186Z    stdout: { 'cloud-object-storage':",
        "2020-05-29T16:08:47.626189Z    stdout: { apikey: 'Eq2Xes-n_kHOgDe9asXfuwJ7sZGDUGka7FEtUu2iGxxY',",
        "2020-05-29T16:08:47.626193Z    stdout: credentials: 'creds_aa-cos',",
        "2020-05-29T16:08:47.626196Z    stdout: endpoints:",
        "2020-05-29T16:08:47.626199Z    stdout: 'https://control.cloud-object-storage.cloud.ibm.com/v2/endpoints',",
        "2020-05-29T16:08:47.626202Z    stdout: iam_apikey_description:",
        "2020-05-29T16:08:47.626205Z    stdout: 'Auto-generated for key 6466cdd4-28b9-466c-b9ae-6c52cf6a5f16',",
        "2020-05-29T16:08:47.626209Z    stdout: iam_apikey_name: 'creds_aa-cos',",
        "2020-05-29T16:08:47.626213Z    stdout: iam_role_crn: 'crn:v1:bluemix:public:iam::::serviceRole:Manager',",
        "2020-05-29T16:08:47.626216Z    stdout: iam_serviceid_crn:",
        "2020-05-29T16:08:47.626219Z    stdout: 'crn:v1:bluemix:public:iam-identity::a/4b4c36db94004c51b937b0343f8960f0::serviceid:ServiceId-5707d9ed-6a86-4e72-a840-637feb3e14ff',",
        "2020-05-29T16:08:47.626222Z    stdout: instance: 'aa-cos',",
        "2020-05-29T16:08:47.626226Z    stdout: resource_instance_id:",
        "2020-05-29T16:08:47.626229Z    stdout: 'crn:v1:bluemix:public:cloud-object-storage:global:a/4b4c36db94004c51b937b0343f8960f0:abc271f5-41ab-467e-bf1c-869d85ad811e::' } }
 */
public class Credentials {

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
