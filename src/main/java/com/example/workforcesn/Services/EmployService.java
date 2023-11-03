package com.example.workforcesn.Services;

import com.example.workforcesn.Model.Employ;
import com.example.workforcesn.Repository.EmployRepository;
import com.example.workforcesn.Services.Interfaces.EmployI;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EmployService implements EmployI {
    private EmployRepository employRepository;

    public EmployService(EmployRepository employRepository) {

        this.employRepository = employRepository;
    }
    public EmployService() {
    }

    @Override
    public Employ saveEmploy(Employ employ) {

        return employRepository.save(employ);
    }

    @Override
    public Employ updateEmploy(Employ employ) {

        return null;
    }

    @Override
    public List<Employ> findAllEmploy() {

        return employRepository.findAll();
    }

    @Override
    public Optional<Employ> findByIdEmploy(Long id) {

        return employRepository.findById(id);
    }

    @Override
    public void deleteEmploy(Employ employ) {

        employRepository.delete(employ);
    }
}
