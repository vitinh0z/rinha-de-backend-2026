package com.rinha.fraud.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FraudResponse {
    private boolean approved;
    private double fraudScore;
}
