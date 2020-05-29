package com.ibm.function;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cloud.objectstorage.services.s3.AmazonS3;
import com.ibm.cloud.objectstorage.services.s3.model.S3Object;

@RestController
public class FunctionRun {

	private CosConfiguration cosConfiguration;

	public FunctionRun(CosConfiguration cosConfiguration) {
		this.cosConfiguration = cosConfiguration;
	}

	@PostMapping
	public ResponseEntity<OutgoingRecord> root(@RequestBody CosTriggerMessage record) {
		System.out.println("RequestBody: " + record.toString());
		cosConfiguration.createClient(record.getCredentials().getCosCredentials(), record.getEndpoint());
		readFromBucket(record);
		return ResponseEntity.ok().build();
	}

	private void readFromBucket(CosTriggerMessage record) {
		AmazonS3 clientConn = cosConfiguration.getClient();
		S3Object s3Object = clientConn.getObject(record.getBucket(), record.getKey());
		System.out.println("S3 metadata: " + s3Object.getObjectMetadata());
	}

	@GetMapping("/health_check")
	public ResponseEntity<?> healthCheck() {
		System.out.println("/health_check");
		return ResponseEntity.ok().build();
	}
}