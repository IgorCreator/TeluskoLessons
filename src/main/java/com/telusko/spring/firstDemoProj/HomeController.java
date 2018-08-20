package com.telusko.spring.firstDemoProj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(@RequestParam("name") String inputName,
                       HttpSession session) {
        System.out.println("Calling home for .jsp with session: " + session.getId());
        session.setAttribute("name" , inputName);
        return "home";
    }
}
