package com.david.calendar.calendarapi.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.david.calendar.calendarapi.entity.User;
import com.david.calendar.calendarapi.repository.UserRepository;
public class UserService {
    private final UserRepository userRepository;
    

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User RegisterUser(User user) {
        if (userExists(user.getEmail())) {
            throw new IllegalArgumentException("User with this email already exists");
        }
        return userRepository.save(user);

    }
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    public boolean userExists(String email) {
        return userRepository.existsByEmail(email);
    }
    
}
