package com.timswierad.webapphome.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tiswierad on 7/9/2017.
 */
@Document
public class CarouselItem {
    @Id
    private String id;
    private String title;
    private String description;
    private String buttURl;

    public CarouselItem() {
    }

    public CarouselItem(String id, String title, String description, String buttURl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.buttURl = buttURl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getButtURl() {
        return buttURl;
    }

    public void setButtURl(String buttURl) {
        this.buttURl = buttURl;
    }

    @Override
    public String toString() {
        return "CarouselItem{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", buttURl='" + buttURl + '\'' +
                '}';
    }
}