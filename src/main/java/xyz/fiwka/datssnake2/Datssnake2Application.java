package xyz.fiwka.datssnake2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import xyz.fiwka.datssnake2.feign.ClientSecret;

@EnableFeignClients
@EnableScheduling
@SpringBootApplication
public class Datssnake2Application {

    public static void main(String[] args) {
        SpringApplication.run(Datssnake2Application.class, args);
    }

    @Bean
    public ClientSecret clientSecret(@Value("${CLIENT_SECRET}") String xAuthToken) {
        return () -> xAuthToken;
    }

}
