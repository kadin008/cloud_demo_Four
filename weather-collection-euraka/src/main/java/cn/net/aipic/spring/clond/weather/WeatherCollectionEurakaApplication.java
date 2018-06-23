package cn.net.aipic.spring.clond.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class WeatherCollectionEurakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherCollectionEurakaApplication.class, args);
    }
}
