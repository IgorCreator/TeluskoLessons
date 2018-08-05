package com.telusko.spring.firstDemoProj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home() {
        System.out.println("Calling home for .jsp");
        return "home.jsp";
    }
}
