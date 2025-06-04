package com.zr.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired //field injection
//    private Laptop laptop;
    private Computer comp;


//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){
        comp.compile();
        System.out.println("working on project");
    }
}
