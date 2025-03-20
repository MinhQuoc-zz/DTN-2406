package com.vti.service;

import com.vti.entity.Department;

import java.util.List;
import java.util.Optional;

public interface IDepartmentService {
    List<Department> getAllDepartments();

    Department createDepartment(Department department);

    Department updateDepartment(Department department);


    void deleteDepartment(int id);

    Optional<Department> getDepartmentById(int id);
}
