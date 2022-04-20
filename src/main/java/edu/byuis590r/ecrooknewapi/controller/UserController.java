package edu.byuis590r.ecrooknewapi.controller;

import edu.byuis590r.ecrooknewapi.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import edu.byuis590r.ecrooknewapi.service.DummyUserServiceImpl;
//import org.springframework.web.bind.annotation.*;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import io.swagger.v3.oas.annotations.security.SecurityRequirement;

/***
 * class for user controller
 */
@Tag(name = "UserController", description = "User Controller endpoint")
@RestController
//For a breaking change
@RequestMapping("/v1")
// Create boiler-plate code. View builder code in the .jar file to see what was built
//generate constructor with all the args, all the args being my private fields
@AllArgsConstructor
public class UserController {

    private UserService userService;

    //    @Value("${name}")
    //    private String name;

    //    @Autowired
    //    @Qualifier("env")
    //    private String env;

    @GetMapping(value = "/user")
    public String getUserById(@RequestParam(name = "user_id") String userId) {
        return userService.getUserById(userId);
    }

}





