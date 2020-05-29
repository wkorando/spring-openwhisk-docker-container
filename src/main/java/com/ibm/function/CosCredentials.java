package com.ibm.function;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "2020-05-29T16:08:47.626189Z stdout: { apikey:
 * 'Eq2Xes-n_kHOgDe9asXfuwJ7sZGDUGka7FEtUu2iGxxY',",
 * "2020-05-29T16:08:47.626193Z stdout: credentials: 'creds_aa-cos',",
 * "2020-05-29T16:08:47.626196Z stdout: endpoints:",
 * "2020-05-29T16:08:47.626199Z stdout:
 * 'https://control.cloud-object-storage.cloud.ibm.com/v2/endpoints',",
 * "2020-05-29T16:08:47.626202Z stdout: iam_apikey_description:",
 * "2020-05-29T16:08:47.626205Z stdout: 'Auto-generated for key
 * 6466cdd4-28b9-466c-b9ae-6c52cf6a5f16',", "2020-05-29T16:08:47.626209Z stdout:
 * iam_apikey_name: 'creds_aa-cos',", "2020-05-29T16:08:47.626213Z stdout:
 * iam_role_crn: 'crn:v1:bluemix:public:iam::::serviceRole:Manager',",
 * "2020-05-29T16:08:47.626216Z stdout: iam_serviceid_crn:",
 * "2020-05-29T16:08:47.626219Z stdout:
 * 'crn:v1:bluemix:public:iam-identity::a/4b4c36db94004c51b937b0343f8960f0::serviceid:ServiceId-5707d9ed-6a86-4e72-a840-637feb3e14ff',",
 * "2020-05-29T16:08:47.626222Z stdout: instance: 'aa-cos',",
 * "2020-05-29T16:08:47.626226Z stdout: resource_instance_id:",
 * "2020-05-29T16:08:47.626229Z stdout:
 * 'crn:v1:bluemix:public:cloud-object-storage:global:a/4b4c36db94004c51b937b0343f8960f0:abc271f5-41ab-467e-bf1c-869d85ad811e::'
 * } }
 * 
 * @author William.Korando@ibm.com
 *
 */
public class CosCredentials {

	private String apikey;
	private String credentials;
	private String endpoints;
	@JsonProperty("iam_apikey_description")
	private String iamApiKeyDescription;
	@JsonProperty("iam_apikey_name")
	private String iamApikeyName;
	@JsonProperty("iam_role_crn")
	private String iamRoleCrn;
	@JsonProperty("iam_serviceid_crn")
	private String iamServiceIdCrn;
	private String instance;
	@JsonProperty("resource_instance_id")
	private String resourceInstanceId;

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	public String getIamApiKeyDescription() {
		return iamApiKeyDescription;
	}

	public void setIamApiKeyDescription(String iamApiKeyDescription) {
		this.iamApiKeyDescription = iamApiKeyDescription;
	}

	public String getIamApikeyName() {
		return iamApikeyName;
	}

	public void setIamApikeyName(String iamApikeyName) {
		this.iamApikeyName = iamApikeyName;
	}

	public void setIamServiceIdCrn(String iamServiceIdCrn) {
		this.iamServiceIdCrn = iamServiceIdCrn;
	}

	public String getCredentials() {
		return credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

	public String getEndpoints() {
		return endpoints;
	}

	public void setEndpoints(String endpoints) {
		this.endpoints = endpoints;
	}

	public String getIamApikey_description() {
		return iamApiKeyDescription;
	}

	public void setIamApikey_description(String iamApikey_description) {
		this.iamApiKeyDescription = iamApikey_description;
	}

	public String getIamApikey_name() {
		return iamApikeyName;
	}

	public void setIamApikey_name(String iamApikey_name) {
		this.iamApikeyName = iamApikey_name;
	}

	public String getIamRoleCrn() {
		return iamRoleCrn;
	}

	public void setIamRoleCrn(String iamRoleCrn) {
		this.iamRoleCrn = iamRoleCrn;
	}

	public String getIamServiceIdCrn() {
		return iamServiceIdCrn;
	}

	public void setIamServiceidCrn(String iamServiceidCrn) {
		this.iamServiceIdCrn = iamServiceidCrn;
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public String getResourceInstanceId() {
		return resourceInstanceId;
	}

	public void setResourceInstanceId(String resourceInstanceId) {
		this.resourceInstanceId = resourceInstanceId;
	}

	@Override
	public String toString() {
		return "CosCredentials [apikey=" + apikey + ", credentials=" + credentials + ", endpoints=" + endpoints
				+ ", iamApiKeyDescription=" + iamApiKeyDescription + ", iamApikeyName=" + iamApikeyName
				+ ", iamRoleCrn=" + iamRoleCrn + ", iamServiceIdCrn=" + iamServiceIdCrn + ", instance=" + instance
				+ ", resourceInstanceId=" + resourceInstanceId + "]";
	}

}
