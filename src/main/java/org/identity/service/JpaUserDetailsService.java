package org.identity.service;

import lombok.RequiredArgsConstructor;
import org.identity.repository.PersonRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@RequiredArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {

    private final PersonRepository personRepository;

    @Override
    public UserDetails loadUserByUsername(String emailOrPhone) throws UsernameNotFoundException {
        //TODO
        return null;
    }
}
