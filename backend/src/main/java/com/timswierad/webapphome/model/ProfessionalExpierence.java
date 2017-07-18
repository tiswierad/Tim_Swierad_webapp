package com.timswierad.webapphome.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tiswierad on 7/9/2017.
 */
@Document
public class ProfessionalExpierence {
    @Id
    private String id;
    private String company;
    private String city;
    private String state;
    private String jobTitle;
    private String department;
    private String startDate;
    private String endDate;
    private List<String> bulletPoints = new ArrayList<String>();
    private String description;

    public ProfessionalExpierence() {
    }

    public ProfessionalExpierence(String id, String company, String city, String state, String jobTitle, String department, String startDate, String endDate, List<String> bulletPoints, String description) {
        this.id = id;
        this.company = company;
        this.city = city;
        this.state = state;
        this.jobTitle = jobTitle;
        this.department = department;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bulletPoints = bulletPoints;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public List<String> getBulletPoints() {
        return bulletPoints;
    }

    public void setBulletPoints(List<String> bulletPoints) {
        this.bulletPoints = bulletPoints;
    }

    public void addBulletPoint(String bullet){
        this.bulletPoints.add(bullet);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProfessionalExpierence{" +
                "id='" + id + '\'' +
                ", company='" + company + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", department='" + department + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", bulletPoints=" + bulletPoints +
                ", description='" + description + '\'' +
                '}';
    }
}
