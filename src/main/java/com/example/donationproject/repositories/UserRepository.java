package com.example.donationproject.repositories;

import com.example.donationproject.entities.User;
import com.example.donationproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
