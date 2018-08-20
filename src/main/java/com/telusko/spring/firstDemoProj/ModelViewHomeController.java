package com.telusko.spring.firstDemoProj;

import com.telusko.spring.firstDemoProj.objtest.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelViewHomeController {

        @RequestMapping("welcome")
        public ModelAndView addAlien(Alien alien) {
            System.out.println(alien);

            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("obj", alien);
            modelAndView.setViewName("welcome");
            return modelAndView;
        }
}
