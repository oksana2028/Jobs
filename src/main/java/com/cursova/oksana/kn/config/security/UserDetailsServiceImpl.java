package com.cursova.oksana.kn.config.security;


import com.cursova.oksana.kn.model.User;
import com.cursova.oksana.kn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserService userService;

    @Autowired
    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User user = userService.findByEmail(s);
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getEncryptedPassword(),
                Collections.singletonList(new SimpleGrantedAuthority(user.getRole().toString())));
    }

}
