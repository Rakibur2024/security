package com.spring.security.config;

import com.spring.security.entities.Users;
import com.spring.security.repository.UserDetailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initUsers(UserDetailsRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            // Only create admin if not already present
            if (userRepository.findByUsername("admin").isEmpty()) {
                Users admin = new Users();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin")); // bcrypt encoded
                admin.setRole("ROLE_ADMIN");
                userRepository.save(admin);

                System.out.println("Default admin user created -> username: admin, password: admin");
            }
        };
    }

}
