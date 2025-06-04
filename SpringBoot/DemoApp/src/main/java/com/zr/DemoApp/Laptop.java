package com.zr.DemoApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile(){
        System.out.println("compiling with error 404");
    }
}
