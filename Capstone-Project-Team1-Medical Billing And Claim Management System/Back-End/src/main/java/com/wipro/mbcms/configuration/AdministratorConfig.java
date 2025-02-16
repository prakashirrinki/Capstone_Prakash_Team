/*
 * package com.wipro.mbcms.configuration;
 * 
 * import java.util.Arrays;
 * 
 * import java.util.Collection; import java.util.List; import
 * java.util.stream.Collectors;
 * 
 * import org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.core.userdetails.UserDetails;
 * 
 * import com.wipro.mbcms.entities.AdministratorEntity;
 * 
 * public class AdministratorConfig implements UserDetails {
 * 
 * private static final long serialVersionUID = 1L; private String userName;
 * private String password; private List<GrantedAuthority> authorities;
 * 
 * public AdministratorConfig(AdministratorEntity administratorEntity){
 * userName=administratorEntity.getAdminName();
 * password=administratorEntity.getAdministratorPassword(); authorities=
 * Arrays.stream(administratorEntity.getRole().split(","))
 * .map(SimpleGrantedAuthority::new) .collect(Collectors.toList()); }
 * 
 * @Override public Collection<? extends GrantedAuthority> getAuthorities() {
 * return authorities; }
 * 
 * @Override public String getPassword() { return password; }
 * 
 * @Override public String getUsername() { return userName; }
 * 
 * @Override public boolean isAccountNonExpired() { return true; }
 * 
 * @Override public boolean isAccountNonLocked() { return true; }
 * 
 * @Override public boolean isCredentialsNonExpired() { return true; }
 * 
 * @Override public boolean isEnabled() { return true; }
 * 
 * 
 * }
 */