package com.timswierad.webapphome.controller;

import com.timswierad.webapphome.model.Greeting;
import com.timswierad.webapphome.model.Skill;
import com.timswierad.webapphome.model.SkillCategory;
import com.timswierad.webapphome.model.User;
import com.timswierad.webapphome.repository.ResumeSkillRepo;
import com.timswierad.webapphome.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SkillsController {

    private static final String template = "Hello2, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    ResumeSkillRepo resumeSkillRepo;


    @RequestMapping("/api/skills/findall")
    public List<SkillCategory> findAllSkillCategories() {
        return resumeSkillRepo.findAll(new Sort(Sort.Direction.ASC, "category"));
    }
/*
    @RequestMapping("/api/skills/addskillcategory")
    public boolean addSkillCategory() {


        try {
            resumeSkillRepo.save(sc);
            resumeSkillRepo.save(sc2);
            resumeSkillRepo.save(sc3);
            resumeSkillRepo.save(sc4);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return  true;
    }
*/
}