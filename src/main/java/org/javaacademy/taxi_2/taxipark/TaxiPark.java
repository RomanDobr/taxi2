package org.javaacademy.taxi_2.taxipark;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
public abstract class TaxiPark {

    @Value(value = "${taxi.name}")
    protected String name;
    @Value(value = "${rate.day}")
    protected String rateDay;
    @Value(value = "${rate.night}")
    protected String rateNight;
    protected BigDecimal incom = BigDecimal.ZERO;
    protected List<Car> cars =new LinkedList<>();
    protected Integer countCarToOrder = 0;

    void takeOrder(Order order) {
        Car car = cars.get(countCarToOrder);

        String partDay = order.getPartDay().getName().equals("day") ? rateDay : rateNight;

        car.takeOrder(order, partDay);
        countCarToOrder++;
        if (countCarToOrder > cars.size()) {
            countCarToOrder = 0;
        }
    }

    void printTaxiPark() {
        System.out.println(name);
        cars.forEach(car -> {
            incom = incom.add(car.getSumTaxiPark());
        });
        System.out.println(incom.toString());
        cars.forEach(car -> System.out.printf("Машина: %s заработал %s\n", car.getNumber(), car.getSumCarMoney()));
    }

    abstract protected void init(ConfigurableApplicationContext context);
}
