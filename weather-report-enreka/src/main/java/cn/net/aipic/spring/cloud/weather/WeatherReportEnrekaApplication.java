package cn.net.aipic.spring.cloud.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WeatherReportEnrekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherReportEnrekaApplication.class, args);
	}
}
