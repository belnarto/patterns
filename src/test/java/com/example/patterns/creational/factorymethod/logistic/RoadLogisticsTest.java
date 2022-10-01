package com.example.patterns.creational.factorymethod.logistic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("road")
@ExtendWith(OutputCaptureExtension.class)
class RoadLogisticsTest {

    @Autowired
    Logistics logistics;

    @Test
    void planRoadDelivery(CapturedOutput output) {
        logistics.planDelivery();
        assertThat(output).contains("Delivered by truck");
    }

}