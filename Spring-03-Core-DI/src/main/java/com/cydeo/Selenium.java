package com.cydeo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium {
//@Autowired // not recommended field injection
    @Autowired // trying to inject this office hours recommended way with constructor
    public  Selenium(OfficeHours officeHours){
        this.officeHours=officeHours;
    }
    OfficeHours officeHours; // inject this with auto wiring
    public void getTeachingHours(){
        System.out.println("weekly teacher hours "+(20+ officeHours.getHours()));
    }



}