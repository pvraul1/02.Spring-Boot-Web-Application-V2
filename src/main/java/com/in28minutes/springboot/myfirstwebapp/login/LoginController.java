package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("login")
    public String goToLoginPage(@RequestParam final String name, ModelMap model) {
        model.put("name", name);

        if (logger.isDebugEnabled()) {
            logger.debug(String.format("Request param is %s", name));
        }

        return "login";
    }

}
