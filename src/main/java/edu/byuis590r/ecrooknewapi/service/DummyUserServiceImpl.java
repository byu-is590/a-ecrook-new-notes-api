package edu.byuis590r.ecrooknewapi.service;

import org.springframework.stereotype.Service;

/***
 * Telling it that is a service. Identifying different things that we need to have instantiated.
 * Helps repository know what to instantiate first when testing
 */
@Service
public class DummyUserServiceImpl implements UserService {

    /***
     * This method formats a string into an extended string with other data
     * @param userId
     * @return
     */
    @Override
    //instead of getUserName, use variable name 'getUserById'
    //instead of userName, use 'userId'
    public String getUserById(String userId) {
        //var user = String.format("Hello, %s, from User Service", userName);
        return String.format("Hello, %s, from the UserService", userId);
    }
}
