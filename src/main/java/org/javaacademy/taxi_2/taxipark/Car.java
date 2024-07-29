package org.javaacademy.taxi_2.taxipark;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.javaacademy.taxi_2.Address;
import org.javaacademy.taxi_2.taxipark.Order;

import java.math.BigDecimal;
import java.util.Arrays;

@RequiredArgsConstructor
@ToString
@Getter
@Setter
public class Car {
    protected final String number;
    protected BigDecimal sumCarMoney = BigDecimal.ZERO;
    private BigDecimal sumTaxiPark = BigDecimal.ZERO;

    void takeOrder(Order order, String partDay) {
        Integer length = order.getClient().getAddress().getLength();

        boolean present = Arrays
                .stream(Address.values())
                .anyMatch(address -> address.getName().equalsIgnoreCase(order.getClient().getAddress().getName()));

        if (!present) {
            System.out.println("Ошибка");
            return;
        }

        double result = length * Integer.parseInt(partDay) * 0.5;

        sumTaxiPark = sumTaxiPark.add(BigDecimal.valueOf(result));
        sumCarMoney = sumCarMoney.add(BigDecimal.valueOf(result));
    }
}
