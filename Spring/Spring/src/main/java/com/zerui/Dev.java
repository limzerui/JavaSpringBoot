package com.zerui;

import java.util.logging.LoggingPermission;

public class Dev {

    private Computer com;

    public Dev() {
        System.out.println("Dev Constructor");
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){
        System.out.println("working");
        com.compile();
    }
}
