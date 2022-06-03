package pl.grabowski.weatherstatistics.Controller.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class StatisticResponse {
    public final LocalDateTime date;
    public final Integer requestNumber;
}
