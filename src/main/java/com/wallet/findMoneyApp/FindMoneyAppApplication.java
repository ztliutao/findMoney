package com.wallet.findMoneyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableConfigurationProperties
@PropertySource(value={"file:D:\\opt\\config\\findMoney\\application.properties"})
public class FindMoneyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindMoneyAppApplication.class, args);
	}
}
