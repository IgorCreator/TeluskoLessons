package com.telusko.spring.firstDemoProj.objtest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Getter
    @Setter
    private int aid;
    @Getter
    @Setter
    private String aname;
    @Getter
    @Setter
    private String tech;

    @Getter
    @Setter
    @Autowired
    @Qualifier("laptop")
    private Laptop laptop;

    public Alien() {
        System.out.println("Object created");
    }

    public void show(){
        System.out.println("IN show Alien");
        laptop.compile();
    }
}
