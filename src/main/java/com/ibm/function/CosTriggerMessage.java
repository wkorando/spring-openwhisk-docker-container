package com.ibm.function;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * "bucket": "bucket_name", "endpoint":
 * "s3.private.us-east.cloud-object-storage.appdomain.cloud", "key":
 * "sample.txt", "notification": { "bucket_name": "bucket_name", "content_type":
 * "application/octet-stream", "event_type": "Object:Write", "format": "2.0",
 * "object_etag": "a2b2d66938b1f023dec6394f12b782b5", "object_length": "5",
 * "object_name": "sample.txt", "request_id":
 * "216c7ddb-218c-4fb7-84d2-293f286b62e6", "request_time":
 * "2019-09-04T14:40:35.294Z" }
 * 
 * @author William.Korando@ibm.com
 *
 */
public class CosTriggerMessage implements Serializable {

	private static final long serialVersionUID = 4380164869741710688L;
	private String bucket;
	private String endpoint;
	private String key;
	private CosTriggerNotifcation notification;
	@JsonProperty("__bx_creds")
	private Credentials credentials;

	public CosTriggerMessage() {
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
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
		CosTriggerMessage other = (CosTriggerMessage) obj;
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
