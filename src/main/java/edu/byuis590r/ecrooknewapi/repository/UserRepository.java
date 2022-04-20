package edu.byuis590r.ecrooknewapi.repository;

import edu.byuis590r.ecrooknewapi.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findFirstById(Long Id);

    //pulls from the model.user folder...
    Optional<User> findFirstByEmail(String email);
}
