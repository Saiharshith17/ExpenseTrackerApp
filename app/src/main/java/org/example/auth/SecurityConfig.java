package org.example.auth;

import lombok.Data;
import org.example.repository.UserRepository;
import org.example.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableMethodSecurity
@Data
public class SecurityConfig {

    @Autowired
    private final PasswordEncoder passwordEncoder;

    @Autowired
    private final UserDetailsServiceImpl userDetailsService;

    @Bean
    @Autowired
    public UserDetailsService userDetailsService(UserRepository userRepository,PasswordEncoder passwordEncoder){
      return new UserDetailsServiceImpl(userRepository,passwordEncoder);
    }
}
