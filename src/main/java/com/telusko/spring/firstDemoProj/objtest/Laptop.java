package com.telusko.spring.firstDemoProj.objtest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop {
    @Getter
    @Setter
    private int lid;
    @Getter
    @Setter
    private String brand;

    @Override
    public String toString() {
        return "Laptop{" + "lid=" + lid + ", brand='" + brand + '\'' + '}';
    }

    public void compile(){
        System.out.println("Compiling of Laptop...");
    }

}
