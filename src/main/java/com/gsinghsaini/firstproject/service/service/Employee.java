package com.gsinghsaini.firstproject.service.service;

import javax.persistence.*;

@Entity
@Table
public class Employee {

    private String name;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
