package com.rinha.fraud.controller;

import com.rinha.fraud.model.FraudRequest;
import com.rinha.fraud.model.FraudResponse;
import com.rinha.fraud.service.FraudService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FraudController {

    private final FraudService fraudService;

    public FraudController(FraudService fraudService) {
        this.fraudService = fraudService;
    }

    @GetMapping("/ready")
    public ResponseEntity<Void> ready() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/fraud-score")
    public ResponseEntity<FraudResponse> fraudScore(@RequestBody FraudRequest request) {
        return ResponseEntity.ok(fraudService.evaluate(request));
    }
}
