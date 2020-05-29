package com.ibm.function;

import org.springframework.stereotype.Service;

import com.ibm.cloud.objectstorage.ClientConfiguration;
import com.ibm.cloud.objectstorage.auth.AWSCredentials;
import com.ibm.cloud.objectstorage.auth.AWSStaticCredentialsProvider;
import com.ibm.cloud.objectstorage.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.ibm.cloud.objectstorage.oauth.BasicIBMOAuthCredentials;
import com.ibm.cloud.objectstorage.services.s3.AmazonS3;
import com.ibm.cloud.objectstorage.services.s3.AmazonS3ClientBuilder;

@Service
public class CosConfiguration {
	private AmazonS3 amazonS3;

	public void createClient(CosCredentials cosCredentials, String endpoint) {
		if(amazonS3 != null) {
			return;
		}
		String apiKey = cosCredentials.getApikey();
		String serviceInstanceId = cosCredentials.getIamServiceIdCrn();
		String endpointUrl = "https://" + endpoint;
		String location = "us";
		buildClient(apiKey, serviceInstanceId, endpointUrl, location);
	}

	private void buildClient(String apiKey, String serviceInstanceId, String endpointUrl, String location) {
		AWSCredentials credentials = new BasicIBMOAuthCredentials(apiKey, serviceInstanceId);
		ClientConfiguration clientConfig = new ClientConfiguration().withRequestTimeout(5000).withTcpKeepAlive(true);

		amazonS3 = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials))
						.withEndpointConfiguration(new EndpointConfiguration(endpointUrl, location))
						.withPathStyleAccessEnabled(true).withClientConfiguration(clientConfig).build();
		 
	}
	
	public AmazonS3 getClient() {
		return amazonS3;
	}

}
