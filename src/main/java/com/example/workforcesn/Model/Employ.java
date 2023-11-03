package com.example.workforcesn.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

@Entity
public class Employ {

    @Id
    @GeneratedValue
    private Long id;
    private String nom_employ;
    private Float salary;

    @ManyToOne
    private Department department;


    public Employ(String nom_employ, Float salary, Department departments) {
        this.nom_employ = nom_employ;
        this.salary = salary;
        this.department = departments;
    }

    public Employ() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNom_employ() {
        return nom_employ;
    }

    public void setNom_employ(String nom_employ) {
        this.nom_employ = nom_employ;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Department getDepartments() {
        return department;
    }

    public void setDepartments(Department departments) {
        this.department = departments;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "nom_employ='" + nom_employ + '\'' +
                ", salary=" + salary +
                ", departments=" + department +
                '}';
    }
}
