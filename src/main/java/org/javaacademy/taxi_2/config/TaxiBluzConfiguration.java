package org.javaacademy.taxi_2.config;

import org.javaacademy.taxi_2.taxipark.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "bluz")
@ComponentScan(basePackages = "org.javaacademy")
public class TaxiBluzConfiguration {
    @Bean
    Car carBluz1() {
        return new Car("У200ХМ116");
    }
    @Bean
    Car carBluz2() {
        return new Car("У201ХМ116");
    }
}
