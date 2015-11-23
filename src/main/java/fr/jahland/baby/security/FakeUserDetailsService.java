package fr.jahland.baby.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by mvincent on 22/11/2015.
 */
@Service
public class FakeUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws
            UsernameNotFoundException {
        return new User(username, "#20150620#", getGrantedAuthorities(username));
    }
    private Collection<? extends GrantedAuthority> getGrantedAuthorities(String
                                                                                 username) {
        Collection<? extends GrantedAuthority> authorities;
        if (username.equals("Robin")) {
            authorities = Arrays.asList(() -> "ROLE_ADMIN", () -> "ROLE_BASIC");
        } else {
            authorities = Arrays.asList();
        }
        return authorities;
    }
}
