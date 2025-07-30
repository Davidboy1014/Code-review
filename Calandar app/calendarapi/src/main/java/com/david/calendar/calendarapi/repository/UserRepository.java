package com.david.calendar.calendarapi.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.calendar.calendarapi.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);
    Optional<User> findByEmailOrUsername(String email, String username);
    boolean existsByEmail(String email);
    //boolean existsByUsername(String username);
}
