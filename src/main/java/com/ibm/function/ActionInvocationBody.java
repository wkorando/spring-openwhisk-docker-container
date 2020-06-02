package com.ibm.function;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model object translating body sent in call to {@code POST: /}<br/>
 * "bucket": "bucket_name" <br/>
 * "endpoint": "s3.private.us-east.cloud-object-storage.appdomain.cloud"<br/>
 * "key": "sample.txt", <br/>
 * "notification": { see: {@link CosTriggerNotifcation} }<br/>
 * "__bx_creds" : { see: {@link BluemixCredentials} }<br/>
 * 
 * @author William.Korando@ibm.com
 *
 */
public class ActionInvocationBody implements Serializable {

	private static final long serialVersionUID = 4380164869741710688L;
	/**
	 * Name of bucket where new object was added.
	 */
	private String bucket;
	/**
	 * Endpoint where bucket is located.
	 */
	private String endpoint;
	/**
	 * Unique key to look up added object.
	 */
	private String key;
	private CosTriggerNotifcation notification;
	@JsonProperty("__bx_creds")
	private BluemixCredentials credentials;

	public ActionInvocationBody() {
	}

	public BluemixCredentials getCredentials() {
		return credentials;
	}

	public void setCredentials(BluemixCredentials credentials) {
		this.credentials = credentials;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public CosTriggerNotifcation getNotification() {
		return notification;
	}

	public void setNotification(CosTriggerNotifcation notification) {
		this.notification = notification;
	}

	@Override
	public String toString() {
		return "CosTriggerMessage [bucket=" + bucket + ", endpoint=" + endpoint + ", key=" + key + ", notification="
				+ notification.toString() + ", credentials=" + credentials.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bucket == null) ? 0 : bucket.hashCode());
		result = prime * result + ((endpoint == null) ? 0 : endpoint.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((notification == null) ? 0 : notification.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActionInvocationBody other = (ActionInvocationBody) obj;
		if (bucket == null) {
			if (other.bucket != null)
				return false;
		} else if (!bucket.equals(other.bucket))
			return false;
		if (endpoint == null) {
			if (other.endpoint != null)
				return false;
		} else if (!endpoint.equals(other.endpoint))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (notification == null) {
			if (other.notification != null)
				return false;
		} else if (!notification.equals(other.notification))
			return false;
		return true;
	}

}
