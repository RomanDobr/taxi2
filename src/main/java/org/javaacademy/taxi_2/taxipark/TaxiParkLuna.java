package org.javaacademy.taxi_2.taxipark;

import org.javaacademy.taxi_2.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile(value = "luna")
public class TaxiParkLuna extends TaxiPark {
    @Override
    public void init(ConfigurableApplicationContext context) {
        TaxiParkLuna luna = context.getBean(TaxiParkLuna.class);
        Car carLuna1 = context.getBean("carLuna1", Car.class);
        Car carLuna2 = context.getBean("carLuna2", Car.class);
        Car carLuna3 = context.getBean("carLuna3", Car.class);
        luna.setCars(List.of(carLuna1, carLuna2, carLuna3));
        Client client1 = new Client(Address.Kandikuly);
        Client client2 = new Client(Address.Stroitel);
        luna.takeOrder(new Order(client1, PartDay.DAY));
        luna.takeOrder(new Order(client2, PartDay.DAY));
        luna.takeOrder(new Order(client2, PartDay.DAY));
        //luna.printTaxiPark();
    }
}
