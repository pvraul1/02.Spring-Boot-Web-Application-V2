package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.springboot.myfirstwebapp.loginAuthenticationService.AuthenticationService;

/**
 * The login controller class.
 *
 * @author architecture - pvraul1
 * @since 1.17
 * @version Jul 24, 2022 - 9:40:47 AM
 *
 */
@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    
    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="login", method=RequestMethod.GET)
    public String goToLoginPage() {
        return "login";
    }

    @RequestMapping(value="login", method=RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);

            return "welcome";
        }

        model.put("errorMessage", "Invalid Credentials! Please try again.");

        return "login";
    }

}
