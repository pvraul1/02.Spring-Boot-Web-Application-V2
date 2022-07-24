package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

/**
 * The login controller class.
 *
 * @author architecture - pvraul1
 * @since 1.17
 * @version Jul 24, 2022 - 9:40:47 AM
 *
 */
@Slf4j
@Controller
public class LoginController {

    @RequestMapping("login")
    public String goToLoginPage(@RequestParam final String name, ModelMap model) {
        model.put("name", name);
        log.info(String.format("Request param is %s", name));

        return "login";
    }

}
