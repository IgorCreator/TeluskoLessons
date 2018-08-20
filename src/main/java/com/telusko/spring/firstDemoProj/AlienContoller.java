package com.telusko.spring.firstDemoProj;

import com.telusko.spring.firstDemoProj.dao.AlienRepo;
import com.telusko.spring.firstDemoProj.objtest.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @RequestMapping("/getHome")
    public ModelAndView getHome() {
        //Just for test interface AlienRepo
        System.out.println("Find By Lang alien: " + repo.findByLang("Java"));
        System.out.println("find By Lang Sorted alien: " + repo.findByLangSorted("Java"));

        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("name", "User");
        return modelAndView;
    }

    @RequestMapping("/aliens")
    @ResponseBody
    public String getAllAliens() {
        StringBuilder rez = new StringBuilder();
        rez.append("<h3>");
        for (Alien alien : repo.findAll()) {
            rez.append(alien.toString());
            rez.append("<br>");
        }
        rez.append("</h3>");
        return rez.toString();
    }

    @RequestMapping("/alien/{aid}")
    @ResponseBody
    public ModelAndView getAlienById(@PathVariable("aid") int aid) {
        ModelAndView modelAndView = new ModelAndView("showAlien");
        Alien alien = repo.findById(aid).orElse(new Alien());
        System.out.println("Find alien: " + alien);
        modelAndView.addObject(alien);
        return modelAndView;
    }
}