package org.javaacademy.taxi_2.config;

import org.javaacademy.taxi_2.taxipark.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "luna")
@ComponentScan(basePackages = "org.javaacademy")
public class TaxiLunaConfiguration {
    @Bean
    Car carLuna1() {
        return new Car("У100ХМ116");
    }
    @Bean
    Car carLuna2() {
        return new Car("У101ХМ116");
    }
    @Bean
    Car carLuna3() {
        return new Car("У102ХМ116");
    }
}
