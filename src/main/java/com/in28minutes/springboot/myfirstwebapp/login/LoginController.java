package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("login")
    public String goToLoginPage() {
        return "login";
    }

}
