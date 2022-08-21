package com.in28minutes.springboot.myfirstwebapp.loginAuthenticationService;

import org.springframework.stereotype.Service;

/**
 * The Authentication Service.
 *
 * @author architecture - pvraul1
 * @since 1.17
 * @version Aug 21, 2022 - 12:47:09 PM
 *
 */
@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {

        boolean isValidUserName = "in28minutes".equalsIgnoreCase(username);
        boolean isValidPassword = "dummy".equalsIgnoreCase(password);

        return isValidUserName && isValidPassword;
    }

}
