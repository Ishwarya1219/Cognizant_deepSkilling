package com.cognizant.spring_learn.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // For now, hardcoding a single user.
        if ("admin".equals(username)) {
            return new User("admin", "{noop}admin123", new ArrayList<>());
            // {noop} tells Spring not to encode the password
        }
        throw new UsernameNotFoundException("User not found with username: " + username);
    }
}
