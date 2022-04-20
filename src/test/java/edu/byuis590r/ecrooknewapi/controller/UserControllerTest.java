package edu.byuis590r.ecrooknewapi.controller;

import edu.byuis590r.ecrooknewapi.Application;
import edu.byuis590r.ecrooknewapi.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;
import static org.junit.jupiter.api.Assertions.*;


@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {Application.class, UserController.class, UserService.class})

class UserControllerTest {

    @Autowired
    //get an instance of userController
    private UserController userController;

    @Autowired
    //userService to be the mock
    private UserService userService;

    //code to run before test if needed
    @BeforeEach
    void setUp() {
    }

    //code to run after test if needed. Clean things up/ post test actions
    @AfterEach
    void tearDown() {
    }

    @Test
    //test getUser without having any dependency on the userService
    void getUser() {
        //Call 'when', pass in userService to pass in SomeId to getUserById. Return mock userName
        Mockito.when(userService.getUserById("SomeId")).thenReturn("Mock user name");
        //getUser is calling UserController, then userService. No instance is made
        String testName = userController.getUser("SomeId");
        //Assert conditions are true. If false, throw exception
        Assert.isTrue("Mock user name".equals(testName), "Asserts if they are equal");
    }
}