package xyz.fiwka.datssnake2;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import xyz.fiwka.datssnake2.feign.DatsSnake2FeignClient;

@EnableFeignClients
@EnableScheduling
@SpringBootApplication
public class Datssnake2Application {

    public static void main(String[] args) {
        SpringApplication.run(Datssnake2Application.class, args);
    }

}
