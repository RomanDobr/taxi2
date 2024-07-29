package org.javaacademy.taxi_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public enum Address {
    Berezovay_rocha("Березовая роща", 10),
    Kandikuly("Кандикюля", 4),
    Stroitel("Строитель", 12),
    Others("Остальное", 0);

    private String name;
    private Integer length;
}
