package com.ibm.aa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;

@RestController
public class GreetingResource {
    	
    @PostMapping
    public ResponseEntity<OutgoingRecord> root(@RequestBody IncomingRecord record) {
        System.out.println("RequestBody: " + record.getMessage());
        OutgoingRecord msg = new OutgoingRecord(record.getMessage());
        return ResponseEntity.ok(msg);
    }

    @GetMapping("/health_check")
    public ResponseEntity<?> healthCheck() {
        System.out.println("/health_check");
        return ResponseEntity.ok().build();
    }
}