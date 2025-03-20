package service;

import entity.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> getAllDepartment();

    Department getDepartmentById(int id);

    boolean createDepartment(Department department) throws Exception;

    boolean updateDepartment(Department department) throws Exception;

    boolean deleteDepartment(int id) throws Exception;
}
