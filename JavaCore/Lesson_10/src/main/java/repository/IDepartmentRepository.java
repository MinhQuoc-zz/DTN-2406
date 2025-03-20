package repository;

import entity.Department;

import java.util.List;

public interface IDepartmentRepository {
    List<Department> getAllDepartment();

    Department getDepartmentById(int id);

    boolean createDepartment(Department department) throws Exception;

    boolean updateDepartment(Department department) throws Exception;

    boolean deleteDepartment(int id) throws Exception;
}
