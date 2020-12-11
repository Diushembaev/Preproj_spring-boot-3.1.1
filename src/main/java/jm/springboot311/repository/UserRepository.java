package jm.springboot311.repository;

import org.springframework.data.repository.CrudRepository;
import jm.springboot311.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String name);
}

