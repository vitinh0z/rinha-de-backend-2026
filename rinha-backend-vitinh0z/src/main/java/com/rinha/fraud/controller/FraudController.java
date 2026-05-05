package com.rinha.fraud.controller;

import com.rinha.fraud.model.FraudRequest;
import com.rinha.fraud.model.FraudResponse;
import com.rinha.fraud.repository.VectorRepository;
import com.rinha.fraud.vector.Vectorizer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FraudController {

    private final Vectorizer vectorizer;
    private final VectorRepository vectorRepository;

    public FraudController(Vectorizer vectorizer, VectorRepository vectorRepository) {
        this.vectorizer = vectorizer;
        this.vectorRepository = vectorRepository;
    }

    @GetMapping("/ready")
    public ResponseEntity<Void> ready() {
        // TODO: Return 200 OK
        return null;
    }

    @PostMapping("/fraud-score")
    public ResponseEntity<FraudResponse> fraudScore(@RequestBody FraudRequest request) {
        // TODO: Call vectorizer and vectorRepository directly
        return null;
    }
}
