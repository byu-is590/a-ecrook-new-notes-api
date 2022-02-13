package edu.byuis590r.ecrooknewapi.controller;

import edu.byuis590r.ecrooknewapi.service.DummyUserServiceImpl;
import edu.byuis590r.ecrooknewapi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
/***
 * Create boiler plate code. View builder code in the .jar file to see what was built
 */
@AllArgsConstructor
public class UserController {
/***
 *
 */
    private UserService userService;

    /***
     *     constructor that we won't use
     *     public UserController() {
     *         this.userService = new DummyUserServiceImpl();
     *     }
     */

    @GetMapping("/user")
    public String getUser(@RequestParam String username) {
        var user = userService.getUserById(username);
        return user; }
}
