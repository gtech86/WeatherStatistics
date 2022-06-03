package pl.grabowski.weatherstatistics.Controller.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class WeatherMessage {
    private final String cityName;
    private final LocalDate date;
    private final double windSpd;
    private final double temp;

}