package com.example.demo.authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {
    public String createJwtToken(String userId, String role) {
        String securityCode = "ayush@123456@123456@ayush@12345@ayush@123456";
        long expiration = 7 * 24 * 60 * 60 * 1000;
        return Jwts.builder()
                .setSubject(userId)
                .claim("role", role)
                .issuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(SignatureAlgorithm.HS256, securityCode.getBytes())
                .compact();
    }
}
