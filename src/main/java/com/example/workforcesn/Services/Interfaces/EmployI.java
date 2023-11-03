package com.example.workforcesn.Services.Interfaces;

import com.example.workforcesn.Model.Employ;

import java.util.List;
import java.util.Optional;

public interface EmployI {
    Employ saveEmploy(Employ employ);
    Employ updateEmploy(Employ employ);
    List<Employ> findAllEmploy();
    Optional<Employ> findByIdEmploy(Long id);
    void deleteEmploy(Employ employ);
}
