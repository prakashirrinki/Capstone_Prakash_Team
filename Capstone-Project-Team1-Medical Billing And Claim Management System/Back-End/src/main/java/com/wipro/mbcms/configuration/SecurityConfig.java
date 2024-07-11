/*
 * package com.wipro.mbcms.configuration;
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.authentication.AuthenticationManager; import
 * org.springframework.security.authentication.AuthenticationProvider; import
 * org.springframework.security.authentication.dao.DaoAuthenticationProvider;
 * import
 * org.springframework.security.config.annotation.authentication.configuration.
 * AuthenticationConfiguration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.http.SessionCreationPolicy; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.security.web.SecurityFilterChain; import
 * org.springframework.security.web.authentication.
 * UsernamePasswordAuthenticationFilter;
 * 
 * import com.wipro.mbcms.filter.JwtAuthFilter;
 * 
 * @Configuration public class SecurityConfig {
 * 
 * @Autowired JwtAuthFilter authFilter;
 * 
 * @Bean UserDetailsService userDetailsService() {
 * 
 * return new UserServiceConfig(); }
 * 
 * @Bean SecurityFilterChain getSecurityFilterChain(HttpSecurity http) throws
 * Exception {
 * 
 * return http.csrf().disable()
 * .authorizeHttpRequests().requestMatchers("/api/admin/authenticate",
 * "/api/admin/add","/api/admin/update").permitAll() .and()
 * .authorizeHttpRequests().requestMatchers("/api/admin/**")
 * .authenticated().and() //.formLogin().and().build(); .sessionManagement()
 * .sessionCreationPolicy(SessionCreationPolicy.STATELESS) .and()
 * .authenticationProvider(authenticationProvider()) .addFilterBefore(authFilter
 * , UsernamePasswordAuthenticationFilter.class) .build();
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * @Bean PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder();
 * }
 * 
 * @Bean AuthenticationProvider authenticationProvider(){
 * DaoAuthenticationProvider authenticationProvider=new
 * DaoAuthenticationProvider();
 * authenticationProvider.setUserDetailsService(userDetailsService());
 * authenticationProvider.setPasswordEncoder(passwordEncoder()); return
 * authenticationProvider; }
 * 
 * 
 * 
 * @Bean AuthenticationManager authenticationManager(AuthenticationConfiguration
 * config) throws Exception {
 * 
 * return config.getAuthenticationManager();
 * 
 * }
 * 
 * }
 */