package com.rinha.fraud.repository;

import com.rinha.fraud.config.VectorIndex;
import org.springframework.stereotype.Repository;

@Repository
public class VectorRepository {

    private final VectorIndex vectorIndex;

    public VectorRepository(VectorIndex vectorIndex) {
        this.vectorIndex = vectorIndex;
    }

    public double findFraudScore(float[] query) {
        // TODO: Return double with fraud score
        return 0.0;
    }
}
