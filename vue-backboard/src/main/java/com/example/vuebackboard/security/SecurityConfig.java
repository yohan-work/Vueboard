//package com.example.vuebackboard.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests(authorizeRequests ->
//                        authorizeRequests
//                                .antMatchers("/h2-console/**").permitAll()
//                                .anyRequest().authenticated()
//                )
//                .headers(headers ->
//                        headers
//                                .frameOptions(frameOptions -> frameOptions.sameOrigin())
//                );
//
//        return http.build();
//    }
//}
//
//
