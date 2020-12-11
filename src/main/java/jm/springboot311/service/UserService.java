package jm.springboot311.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import jm.springboot311.model.User;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    void createUser(User user);
    Iterable<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(User user);
    Optional<User> getUserById(Long id);
}
