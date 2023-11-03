package com.example.workforcesn.Repository;

import com.example.workforcesn.Model.Employ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployRepository extends JpaRepository<Employ,Long> {
}
