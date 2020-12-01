package com.serrodcal.domain;

public class Department {

    public Long id;
    public String name;

    public Department() {}

    public Department(String name) {
        this.name = name;
    }

    public Department(Long id, String name){
        this.id = id;
        this.name = name;
    }

}
