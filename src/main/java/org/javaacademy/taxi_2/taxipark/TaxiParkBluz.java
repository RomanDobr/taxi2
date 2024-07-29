package org.javaacademy.taxi_2.taxipark;

import lombok.Data;
import org.javaacademy.taxi_2.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile(value = "bluz")
@Data
public class TaxiParkBluz extends TaxiPark {
    @Override
    public void init(ConfigurableApplicationContext context) {
        TaxiParkBluz bluz = context.getBean(TaxiParkBluz.class);
        Car carBluz1 = context.getBean("carBluz1", Car.class);
        Car carBluz2 = context.getBean("carBluz2", Car.class);

        bluz.setCars(List.of(carBluz1, carBluz2));
        Client client3 = new Client(Address.Berezovay_rocha);
        Client client4 = new Client(Address.Others);
        bluz.takeOrder(new Order(client3, PartDay.NIGHT));
        bluz.takeOrder(new Order(client4, PartDay.NIGHT));
        //bluz.printTaxiPark();
    }
}
