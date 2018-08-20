package com.telusko.spring.firstDemoProj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelViewHomeController {

        @RequestMapping("welcome")
        public ModelAndView home(@RequestParam("name") String inputName) {
            ModelAndView modelAndView = new ModelAndView();
            System.out.println("inputName: " + inputName);
            modelAndView.addObject("name", inputName);
            modelAndView.setViewName("welcome");
            return modelAndView;
        }
}
