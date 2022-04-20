package edu.byuis590r.ecrooknewapi.config;

import edu.byuis590r.ecrooknewapi.service.UserService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfiguration {

    @Bean(name="userService")
    public UserService getUserService() {
        return Mockito.mock(UserService.class);
    }

}
