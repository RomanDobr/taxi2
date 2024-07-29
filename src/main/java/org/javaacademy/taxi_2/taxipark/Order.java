package org.javaacademy.taxi_2.taxipark;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.javaacademy.taxi_2.Client;
import org.javaacademy.taxi_2.PartDay;

@Data
@AllArgsConstructor
public class Order {
    private final Client client;
    private final PartDay partDay;
}
