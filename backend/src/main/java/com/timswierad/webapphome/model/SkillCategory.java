package com.timswierad.webapphome.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by tiswierad on 7/9/2017.
 */
@Document
public class SkillCategory {

    private String category;
    private String description;
    private List<Skill> skills;

    public SkillCategory() {
    }

    public SkillCategory(String category, String description, List<Skill> skills) {
        this.category = category;
        this.description = description;
        this.skills = skills;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public void addSkill(Skill skill){
        this.skills.add(skill);
    }

    @Override
    public String toString() {
        return "SkillCategory{" +
                "category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", skills=" + skills +
                '}';
    }
}
