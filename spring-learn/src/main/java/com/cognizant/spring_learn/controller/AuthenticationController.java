package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.util.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @RequestMapping(value = "/authenticate", method = RequestMethod.GET)
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return ResponseEntity.status(401).body("Missing or invalid Authorization header");
        }

        // Decode Base64
        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(credDecoded);
        String[] values = credentials.split(":", 2);

        String username = values[0];
        String password = values[1];

        // Dummy validation (replace with actual DB check)
        if ("user".equals(username) && "pwd".equals(password)) {
            UserDetails userDetails = User.withUsername(username).password(password).roles("USER").build();
            String token = jwtUtil.generateToken(username); // username is a String, so it's now valid

            return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
