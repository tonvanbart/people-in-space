package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import dto.opennotify.Astronaut;
import dto.opennotify.Result;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Result result = restTemplate.getForObject("http://api.open-notify.org/astros.json", Result.class);
        log.debug(result.toString());
        result.getPeople().stream()
                .collect(groupingBy(Astronaut::getCraft))
                .forEach((craft, astronauts) -> log.info("{} people in {}: {}", astronauts.size(), craft,
                        astronauts.stream()
                                .map(Astronaut::getName)
                                .collect(joining(", "))));
    }
}