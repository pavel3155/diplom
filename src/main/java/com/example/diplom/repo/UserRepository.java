package com.example.diplom.repo;

import com.example.diplom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {
    User findByEmail(String Email);

}
