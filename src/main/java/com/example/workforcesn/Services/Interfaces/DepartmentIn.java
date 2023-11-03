package com.example.workforcesn.Services.Interfaces;

import com.example.workforcesn.Model.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentIn {
    Department saveDepartment(Department department);
    Department updateDepartment(Department department);
    List<Department> findAllDepartment();
    Optional<Department> findByIdDepartment(Long id);
    void deleteDepartment(Department department);
}
