package com.example.workforcesn.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue
    private Long id;

    public Department() {

    }
    public Department(String nom) {
        this.nom = nom;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    private String nom;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Employ> employs;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Employ> getEmploys() {
        return employs;
    }

    public void setEmploys(List<Employ> employs) {
        this.employs = employs;
    }

    @Override
    public String toString() {
        return "Department{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
