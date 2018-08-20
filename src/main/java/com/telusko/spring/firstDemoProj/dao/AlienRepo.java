package com.telusko.spring.firstDemoProj.dao;

import com.telusko.spring.firstDemoProj.objtest.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

}
