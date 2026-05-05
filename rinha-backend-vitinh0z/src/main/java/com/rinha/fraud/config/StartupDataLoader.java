package com.rinha.fraud.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupDataLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // TODO: Load normalization.json and mcc_risk.json from resources into memory Maps
    }
}
