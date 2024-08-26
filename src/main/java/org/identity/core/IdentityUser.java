package org.identity.core;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class IdentityUser extends User {

    private final String UUID;

    public IdentityUser(String username, String password, Collection<? extends GrantedAuthority> authorities, String uuid) {
        super(username, password, authorities);
        UUID = uuid;
    }
}
