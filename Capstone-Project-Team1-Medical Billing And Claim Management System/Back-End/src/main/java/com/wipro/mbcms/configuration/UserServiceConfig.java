/*
 * package com.wipro.mbcms.configuration;
 * 
 * import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import com.wipro.mbcms.entities.AdministratorEntity; import
 * com.wipro.mbcms.repositories.AdministratorRepository;
 * 
 * @Service public class UserServiceConfig implements UserDetailsService {
 * 
 * @Autowired private AdministratorRepository administratorRepository;
 * 
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException {
 * 
 * Optional<AdministratorEntity> admin =
 * administratorRepository.findByAdminName(username);
 * 
 * 
 * if(admin.isPresent()) { return admin.map(AdministratorConfig::new)
 * .orElseThrow(() -> new UsernameNotFoundException("Admin not found " +
 * username)); }
 * 
 * throw new UsernameNotFoundException("Username Not found"+username);
 * 
 * } }
 */