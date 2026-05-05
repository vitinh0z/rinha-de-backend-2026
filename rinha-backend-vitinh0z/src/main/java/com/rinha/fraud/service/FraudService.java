package com.rinha.fraud.service;

import com.rinha.fraud.model.FraudRequest;
import com.rinha.fraud.model.FraudResponse;
import com.rinha.fraud.repository.VectorRepository;
import com.rinha.fraud.vector.Vectorizer;
import org.springframework.stereotype.Service;

@Service
public class FraudService {

    private final Vectorizer vectorizer;
    private final VectorRepository vectorRepository;

    public FraudService(Vectorizer vectorizer, VectorRepository vectorRepository) {
        this.vectorizer = vectorizer;
        this.vectorRepository = vectorRepository;
    }

    public FraudResponse evaluate(FraudRequest request) {
        // TODO: Implement evaluate logic
        return null;
    }
}
