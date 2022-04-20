package edu.byuis590r.ecrooknewapi.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyUserServiceImplTest {

    @Test
    public void getUserById() {
        var dummyUserServiceImpl = new DummyUserServiceImpl();
        var testUser = "testUser";
        var testResult = String.format("Hello, %s, from the UserService", testUser);
        var result = dummyUserServiceImpl.getUserById(testUser);
        Assertions.assertEquals(testResult, result);
    }
}