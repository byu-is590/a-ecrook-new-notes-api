package edu.byuis590r.ecrooknewapi.controller;

import edu.byuis590r.ecrooknewapi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/***
 * class for user controller
 * Update with more details
 * Milestone 4
 */
@RequestMapping("/v1")
@RestController
@AllArgsConstructor
public class NoteController {

    private UserService userService;

    @GetMapping(value = "/user")
    public String getUserById(@RequestParam(name = "user_id") String userId) {
        return userService.getUserById(userId);
    }

}
