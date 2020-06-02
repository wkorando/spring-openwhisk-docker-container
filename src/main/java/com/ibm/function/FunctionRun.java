package com.ibm.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cloud.objectstorage.services.s3.AmazonS3;
import com.ibm.cloud.objectstorage.services.s3.model.S3Object;

/**
 * REST API for
 * 
 * @author William.Korando@ibm.com
 *
 */
@RestController
public class FunctionRun {

	private CosConfiguration cosConfiguration;
	private final static String COMMA = ",";

	public FunctionRun(CosConfiguration cosConfiguration) {
		this.cosConfiguration = cosConfiguration;
	}

	/**
	 * 
	 * @param record
	 * @return
	 */
	@PostMapping
	public ResponseEntity<?> root(@RequestBody ActionInvocationBody record) {
		System.out.println("RequestBody: " + record.toString());
		cosConfiguration.createClient(record.getCredentials().getCosCredentials(), record.getEndpoint());
		readFromBucket(record);
		return ResponseEntity.ok().build();
	}

	private void readFromBucket(ActionInvocationBody record) {
		List<IncomingRecord> inputList = new ArrayList<IncomingRecord>();
		AmazonS3 clientConn = cosConfiguration.getClient();
		S3Object s3Object = clientConn.getObject(record.getBucket(), record.getKey());
		BufferedReader reader = new BufferedReader(new InputStreamReader(s3Object.getObjectContent()));
		inputList = reader.lines().skip(1).map(mapToItem).collect(Collectors.toList());
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Error occurred while attempting to close stream");
		}
		System.out.println("S3 metadata: " + s3Object.getObjectMetadata());
	}

	private Function<String, IncomingRecord> mapToItem = (line) -> {
		String[] p = line.split(COMMA);// a CSV has comma separated lines
		IncomingRecord record = new IncomingRecord();
		record.setId(Integer.valueOf(p[0]));
		record.setFirstName(p[1]);
		record.setLastName(p[2]);
		record.setEmail(p[3]);
		record.setGender(p[4]);
		record.setIpAddress(p[5]);
		System.out.println(record.toString());
		return record;
	};

	@GetMapping("/health_check")
	public ResponseEntity<?> healthCheck() {
		System.out.println("/health_check");
		return ResponseEntity.ok().build();
	}
}