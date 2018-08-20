package com.telusko.spring.firstDemoProj.dao;

import com.telusko.spring.firstDemoProj.objtest.Alien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
    List<Alien> findByAname(String aname);

    List<Alien> findByLang(String lang);

    @Query("from Alien where lang=?1 order by aname")
    List<Alien> findByLangSorted(String lang);
}
