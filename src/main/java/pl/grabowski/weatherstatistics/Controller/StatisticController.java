package pl.grabowski.weatherstatistics.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.grabowski.weatherstatistics.services.StatisticService;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/statistics")
public class StatisticController {
    private final StatisticService statisticService;

    @GetMapping(path = "/request")
    ResponseEntity<?> getRequestStatistic(){
        var request = statisticService.getRequestStatistic();
        return new ResponseEntity<>(request, HttpStatus.OK);
    }
}
