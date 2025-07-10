package com.api.apiBanco.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import com.api.apiBanco.service.JwtService;

import com.api.apiBanco.filter.JwAuthenticatorFilter;

@Configuration
public class SecurityConfig {
    private final JwtService jwtService;

    public SecurityConfig(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/clientes/login", "/clientes",
                                "/v3/api-docs/**", "/swagger-ui/**").permitAll()
                        .requestMatchers("/clientes/**").authenticated()
                        .anyRequest().permitAll())
                .addFilterBefore(new JwAuthenticatorFilter(jwtService), UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
}