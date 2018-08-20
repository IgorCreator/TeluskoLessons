package com.telusko.spring.firstDemoProj.objtest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Component
public class Alien {

    @Id
    @Getter
    @Setter
    private int aid;
    @Getter
    @Setter
    private String aname;
    @Getter
    @Setter
    private String lang;

    //    @Getter
    //    @Setter
    //    @Autowired
    //    @Qualifier("laptop")
    //    private Laptop laptop;

    public Alien() {
        System.out.println("Object created");
    }

    public void show(){
        System.out.println("IN show Alien");
        //laptop.compile();
    }

    @Override public String toString() {
        return "Alien{"
                + "id=" + aid
                + ", name='" + aname + '\''
                + ", lang='" + lang + '\''
                //+ ", laptop=" + laptop
                + '}'
                ;
    }
}

