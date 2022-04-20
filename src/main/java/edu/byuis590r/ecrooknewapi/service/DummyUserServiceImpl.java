package edu.byuis590r.ecrooknewapi.service;

import edu.byuis590r.ecrooknewapi.model.User;
import edu.byuis590r.ecrooknewapi.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

/***
 * Telling it that is a service. Identifying different things that we need to have instantiated.
 * Helps repository know what to instantiate first when testing
 */
@Service
@AllArgsConstructor
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
        return String.format("Hello, %s, from the User Service", userId);
    }

    @Override
    public Optional<User> getUseByEmail(String email) {
        var user = userRepository.findFirstByEmail(email);
        return user;
    }

    @Override
    public User saveUser(User user) {
        user.setCreatedAt(Instant.now());
        user.setPasswordHash(DigestUtils.sha256Hex(user.getPassword() + salt));
        return userRepository.save(user);
    }

    @Override
    public boolean validateUserByEmail(String email) {
        Optional<User> existingUser = userRepository.findFirstByEmail(email);
        return existingUser.isPresent() ? true : false;
    }
}
