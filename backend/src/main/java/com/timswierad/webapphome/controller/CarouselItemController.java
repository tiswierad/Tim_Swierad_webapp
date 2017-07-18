package com.timswierad.webapphome.controller;

import com.timswierad.webapphome.model.CarouselItem;
import com.timswierad.webapphome.repository.CarouselItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarouselItemController {

    @Autowired
    CarouselItemRepository carouselItemRepository;


    @RequestMapping("/api/carouselitem/findall")
    public List<CarouselItem> findAllCarouselItem() {
        try {
             return (List<CarouselItem>) carouselItemRepository.findAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }

    @RequestMapping("/api/carouselitem/addCarouselItem")
    public boolean addCarouselItem() {

        CarouselItem ci = new CarouselItem();
        ci.setTitle("Recent Resume Updates!");
        ci.setDescription("View my resume to see my latest experience");
        ci.setButtURl("/resume");
        CarouselItem c2 = new CarouselItem();
        c2.setTitle("Status Dashbaord");
        c2.setDescription("View the status Dashbaord to see the statsus of the services utilized by this site.");
        c2.setButtURl("/dashboard");
        try {

            carouselItemRepository.save(ci);
            carouselItemRepository.save(c2);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return  true;
    }




}