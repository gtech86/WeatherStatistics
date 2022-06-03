package pl.grabowski.weatherstatistics.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import pl.grabowski.weatherstatistics.Controller.dto.WeatherMessage;
import pl.grabowski.weatherstatistics.configuration.AppConfiguration;

@Service
@Slf4j
@RequiredArgsConstructor
public class StatisticService {

    public final RabbitTemplate rabbitTemplate;
    public String getRequestStatistic() {
        return rabbitTemplate.receiveAndConvert(AppConfiguration.FORECAST_REQUEST_QUEUE, new ParameterizedTypeReference<>() {});

    }

    @RabbitListener(queues = AppConfiguration.FORECAST_REQUEST_QUEUE)
    public void messageListener(WeatherMessage in) {

        log.info("Message read from myQueue : " + in);
    }
}
