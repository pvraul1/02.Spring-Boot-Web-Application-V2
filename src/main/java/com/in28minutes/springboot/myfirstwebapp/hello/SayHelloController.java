package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The hello controller.
 *
 * @author architecture - pvraul1
 * @since 1.17
 * @version Jul 22, 2022 - 8:45:07 PM
 *
 */
@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello( ) {
        return "Hello! What are you learning today?";
    }
}
