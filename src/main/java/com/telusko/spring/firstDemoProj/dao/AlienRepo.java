package com.telusko.spring.firstDemoProj.dao;

import com.telusko.spring.firstDemoProj.objtest.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
    List<Alien> findByAname(String aname);

    List<Alien> findByLang(String lang);

    @Query("from Alien where lang=?1 order by aname")
    List<Alien> findByLangSorted(String lang);
}
