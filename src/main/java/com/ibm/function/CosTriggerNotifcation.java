package com.ibm.function;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * "bucket_name": "bucket_name", <br/>
 * "content_type": "application/octet-stream",<br/>
 * "event_type": "Object:Write", <br/>
 * "format": "2.0", <br/>
 * "object_etag": "a2b2d66938b1f023dec6394f12b782b5", <br/>
 * "object_length": "5", <br/>
 * "object_name": "sample.txt", <br/>
 * "request_id": "216c7ddb-218c-4fb7-84d2-293f286b62e6",<br/>
 * "request_time": "2019-09-04T14:40:35.294Z"<br/>
 * 
 * @author William.Korando@ibm.com
 *
 */
public class CosTriggerNotifcation implements Serializable {

	private static final long serialVersionUID = -8749291270058258545L;
	@JsonValue
	private String bucketName;
	private String contentType;
	private String eventType;
	private String format;
	private String objectEtag;
	private String objectName;
	private String requestId;
	private String requestTime;

	public CosTriggerNotifcation() {
	}

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getObjectEtag() {
		return objectEtag;
	}

	public void setObjectEtag(String objectEtag) {
		this.objectEtag = objectEtag;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	@Override
	public String toString() {
		return "CosTriggerNotifcation [bucketName=" + bucketName + ", contentType=" + contentType + ", eventType="
				+ eventType + ", format=" + format + ", objectEtag=" + objectEtag + ", objectName=" + objectName
				+ ", requestId=" + requestId + ", requestTime=" + requestTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bucketName == null) ? 0 : bucketName.hashCode());
		result = prime * result + ((contentType == null) ? 0 : contentType.hashCode());
		result = prime * result + ((eventType == null) ? 0 : eventType.hashCode());
		result = prime * result + ((format == null) ? 0 : format.hashCode());
		result = prime * result + ((objectEtag == null) ? 0 : objectEtag.hashCode());
		result = prime * result + ((objectName == null) ? 0 : objectName.hashCode());
		result = prime * result + ((requestId == null) ? 0 : requestId.hashCode());
		result = prime * result + ((requestTime == null) ? 0 : requestTime.hashCode());
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
		CosTriggerNotifcation other = (CosTriggerNotifcation) obj;
		if (bucketName == null) {
			if (other.bucketName != null)
				return false;
		} else if (!bucketName.equals(other.bucketName))
			return false;
		if (contentType == null) {
			if (other.contentType != null)
				return false;
		} else if (!contentType.equals(other.contentType))
			return false;
		if (eventType == null) {
			if (other.eventType != null)
				return false;
		} else if (!eventType.equals(other.eventType))
			return false;
		if (format == null) {
			if (other.format != null)
				return false;
		} else if (!format.equals(other.format))
			return false;
		if (objectEtag == null) {
			if (other.objectEtag != null)
				return false;
		} else if (!objectEtag.equals(other.objectEtag))
			return false;
		if (objectName == null) {
			if (other.objectName != null)
				return false;
		} else if (!objectName.equals(other.objectName))
			return false;
		if (requestId == null) {
			if (other.requestId != null)
				return false;
		} else if (!requestId.equals(other.requestId))
			return false;
		if (requestTime == null) {
			if (other.requestTime != null)
				return false;
		} else if (!requestTime.equals(other.requestTime))
			return false;
		return true;
	}

}
