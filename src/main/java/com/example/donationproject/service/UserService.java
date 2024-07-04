package com.example.donationproject.service;

import com.example.donationproject.entities.User;
import com.example.donationproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
//    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;
//
////    @Autowired
////    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
////        this.userRepository = userRepository;
////        this.passwordEncoder = passwordEncoder;
////    }
//
//    public User saveUser(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        return userRepository.save(user);
//    }

//    @Override
////    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        User user = userRepository.findByUsername(username);
////        if (user == null) {
////            throw new UsernameNotFoundException("User not found");
////        }
////        return org.springframework.security.core.userdetails.User
////                .withUsername(user.getUsername())
////                .password(user.getPassword())
////                .authorities("USER")
////                .build();
////    }
}
