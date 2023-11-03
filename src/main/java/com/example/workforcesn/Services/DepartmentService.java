package com.example.workforcesn.Services;

import com.example.workforcesn.Model.Department;
import com.example.workforcesn.Repository.DepartmentRepository;
import com.example.workforcesn.Services.Interfaces.DepartmentIn;

import java.util.List;
import java.util.Optional;

public class DepartmentService implements DepartmentIn {
    private DepartmentRepository departmentRepository;

    public void setDepartmentRepository(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public DepartmentService(DepartmentRepository departmentRepository) {

        this.departmentRepository = departmentRepository;
    }

    public DepartmentService() {
    }

    @Override
    public Department saveDepartment(Department department) {

        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Department department) {

        return null;
    }

    @Override
    public List<Department> findAllDepartment() {

        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> findByIdDepartment(Long id) {

        return departmentRepository.findById(id);
    }

    @Override
    public void deleteDepartment(Department departments) { departmentRepository.delete(departments);
    }
}
