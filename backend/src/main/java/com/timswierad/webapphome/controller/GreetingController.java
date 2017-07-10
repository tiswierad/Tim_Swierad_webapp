package com.timswierad.webapphome.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.timswierad.webapphome.repository.ResumeSkillRepo;
import com.timswierad.webapphome.repository.UserRepository;
import com.timswierad.webapphome.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.timswierad.webapphome.model.Greeting;
@RestController
public class GreetingController {

    private static final String template = "Hello2, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    ResumeSkillRepo resumeSkillRepo;

    @Autowired
    UserRepository userRepo;

    @RequestMapping("/api/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }



    @RequestMapping("/api/adduser")
    public Boolean addUser(@RequestParam(value="name", defaultValue="World") String name) {
        User user = new User();
        user.setName("Aaron");
        userRepo.save(user);

        return true;

    }

    @RequestMapping("/api/findAllUsers")
    public List<User> findUser(@RequestParam(value="name", defaultValue="World") String name) {
        List<User> users = userRepo.findAll(new Sort(Sort.Direction.ASC, "name"));
        return users;
    }


}