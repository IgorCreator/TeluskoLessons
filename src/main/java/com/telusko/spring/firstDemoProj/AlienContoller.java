package com.telusko.spring.firstDemoProj;

import com.telusko.spring.firstDemoProj.dao.AlienRepo;
import com.telusko.spring.firstDemoProj.objtest.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienContoller {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/addAlien")
    public String addAlien(Alien alien) {
        System.out.println(alien);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", alien);
        repo.save(alien);
        return "welcome";
    }
}