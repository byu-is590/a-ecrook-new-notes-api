package edu.byuis590r.ecrooknewapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//starts springboot application
@SpringBootApplication
//version is for
@OpenAPIDefinition(info = @Info(title = "Notes API", version = "v1", description = "Notes API Application"))
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}