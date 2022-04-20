package edu.byuis590r.ecrooknewapi.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableCaching
public class StringPropConfig {

    @Bean(name = "jwtSecret")
    public String getJwtSecret() {
        var map = System.getenv();
        return map.get("JWT_SECRET");
    }

    @Bean(name = "jwtExpirationMilli")
    public int getJwtExpirationMilli() {
        return 24 * 60 * 60 * 1000;
    }

}