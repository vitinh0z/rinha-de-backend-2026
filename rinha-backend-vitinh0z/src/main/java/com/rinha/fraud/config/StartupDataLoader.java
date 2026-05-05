package com.rinha.fraud.config;

import lombok.Getter;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class StartupDataLoader implements ApplicationRunner {

    @Getter
    private Map<String, Double> normalizationMap;

    @Getter
    private Map<String, Double> mccRiskMap;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // TODO: Load normalization.json and mcc_risk.json from resources into memory Maps
    }
}
