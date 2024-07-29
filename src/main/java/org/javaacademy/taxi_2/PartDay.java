package org.javaacademy.taxi_2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PartDay {

    DAY("day"), NIGHT("night");
    private String name;
}
