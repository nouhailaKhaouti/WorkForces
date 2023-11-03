package com.example.workforcesn.Repository;

import com.example.workforcesn.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
