package pl.grabowski.weatherstatistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ActiveProfiles;

@SpringBootApplication
@ActiveProfiles(value = "prod")
public class WeatherStatisticsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherStatisticsApplication.class, args);
    }

}
