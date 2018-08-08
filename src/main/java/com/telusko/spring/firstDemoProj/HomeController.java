package com.telusko.spring.firstDemoProj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Calling home for .jsp");
        System.out.println("request" + request);
        System.out.println("request" + response);

        HttpSession session = request.getSession();
        String name = request.getParameter("name");
        session.setAttribute("name" , name);

        return "home";
    }
}
