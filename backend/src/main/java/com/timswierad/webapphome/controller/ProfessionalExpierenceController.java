package com.timswierad.webapphome.controller;

import com.timswierad.webapphome.model.ProfessionalExpierence;
import com.timswierad.webapphome.model.SkillCategory;
import com.timswierad.webapphome.repository.ProfessionalExpierenceRepository;
import com.timswierad.webapphome.repository.ResumeSkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Null;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ProfessionalExpierenceController {

    @Autowired
    ProfessionalExpierenceRepository profExpRepo;


    @RequestMapping("/api/profexp/findall")
    public List<ProfessionalExpierence> findAllProfExp() {
        List<ProfessionalExpierence> results = new ArrayList<ProfessionalExpierence>();

        try {
             results = profExpRepo.findAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return results;

    }

    @RequestMapping("/api/profexp/addskillcategory")
    public boolean addSkillCategory() {

        ProfessionalExpierence pe = new ProfessionalExpierence();
        pe.setCity("Jersey City");
        pe.setCompany("J.P. Morgan Chase & Co");
        pe.setState("NJ");
        pe.setJobTitle("Infrastructure Engineer Intern");
        pe.setDepartment("Integrated Customer Data Warehousing");
       pe.setState("NJ");
       pe.setStartDate("May 2012");
        pe.setEndDate("August 2012");
        pe.addBulletPoint("Responsible for creating and maintaining the technical design document which outlines the modeling, ETL, metadata, semantic layer, and integration of Chase Wealth Management Data into a single 180 TB Teradata warehouse.");
        pe.addBulletPoint("Constructed a central Data Management and Analytics SharePoint site, which is comprised of 12 sub sites in order to streamline access and navigation.");

        try {

            profExpRepo.save(pe);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return  true;
    }


    @ExceptionHandler(IllegalArgumentException.class)
    void handleBadRequests(HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value(), "Please try again and with a non empty string as 'name'");
    }

}