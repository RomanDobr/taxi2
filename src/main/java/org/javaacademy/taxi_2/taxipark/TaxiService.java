package org.javaacademy.taxi_2.taxipark;

import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.javaacademy.taxi_2.taxipark.TaxiPark;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
public class TaxiService {
    private final TaxiPark park;
    public void init(ConfigurableApplicationContext context) {
        park.init(context);
    }

    @PreDestroy
    public void print() {
        park.printTaxiPark();
    }
}
