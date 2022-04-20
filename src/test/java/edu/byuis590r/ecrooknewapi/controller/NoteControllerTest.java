package edu.byuis590r.ecrooknewapi.controller;

import edu.byuis590r.ecrooknewapi.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
class NoteControllerTest {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Autowired
    private NoteController noteController;

    @Test
    void getUserById() {
        //Call 'when', pass in userService to pass in SomeId to getUserById. Return mock userName
        Mockito.when(userService.getUserById("SomeId")).thenReturn("Mock user name");
        //getUser is calling UserController, then userService. No instance is made
        String testName = noteController.getUserById("SomeId");
        //Assert conditions are true. If false, throw exception
        Assert.isTrue("Mock user name".equals(testName), "Asserts if they are equal");
    }
}