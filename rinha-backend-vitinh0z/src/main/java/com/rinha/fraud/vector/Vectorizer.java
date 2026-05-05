package com.rinha.fraud.vector;

import com.rinha.fraud.model.FraudRequest;
import org.springframework.stereotype.Component;

@Component
public class Vectorizer {

    public float[] vectorize(FraudRequest request) {
        // TODO: Return float[] with 14 positions. Pure computation.
        return new float[14];
    }
}
