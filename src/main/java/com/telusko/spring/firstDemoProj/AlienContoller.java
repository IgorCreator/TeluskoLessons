package com.telusko.spring.firstDemoProj;

import com.telusko.spring.firstDemoProj.dao.AlienRepo;
import com.telusko.spring.firstDemoProj.objtest.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienContoller {

    @Autowired
    AlienRepo repo;

    @GetMapping("/getHome")
    public ModelAndView getHome() {
        //Just for test interface AlienRepo
        System.out.println("Find By Lang alien: " + repo.findByLang("Java"));
        System.out.println("find By Lang Sorted alien: " + repo.findByLangSorted("Java"));

        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("name", "User");
        return modelAndView;
    }

    @GetMapping(path="/aliens", produces = {"application/json"})
    public List<Alien> getAllAliens() {
        return repo.findAll();
    }

    @GetMapping("/alien/{aid}")
    public Optional<Alien> getAlienById(@PathVariable("aid") int aid) {
        return repo.findById(aid);
    }

    @PostMapping("/alien/add")
    public Alien addAlien(@RequestBody Alien alien) {
        System.out.println(alien);
        ModelAndView modelAndView = new ModelAndView("showAlien");
        modelAndView.addObject("obj", alien);
        repo.save(alien);
        return alien;
    }

    @DeleteMapping("/alien/delete/{aid}")
    public String deleteAlienById(@PathVariable("aid") int aid) {
        Alien alien = repo.getOne(aid);
        repo.delete(alien);
        return "Alien with ID: " + aid + " was deleted";
    }

    @PutMapping("/alien/update")
    public String updateAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return "Alien with ID: " + alien + " was updated";
    }
}