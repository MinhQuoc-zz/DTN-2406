package service;

import entity.Department;
import repository.DepartmentRepository;

import java.util.List;

public class DepartmentService implements IDepartmentService{
    DepartmentRepository departmentRepository = new DepartmentRepository();

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.getAllDepartment();
    }

    @Override
    public Department getDepartmentById(int id) {
         return departmentRepository.getDepartmentById(id);
    }

    @Override
    public boolean createDepartment(Department department) throws Exception {
        return departmentRepository.createDepartment(department);
    }

    @Override
    public boolean updateDepartment(Department department) throws Exception {
        return departmentRepository.updateDepartment(department);
    }

    @Override
    public boolean deleteDepartment(int id) throws Exception {
        return departmentRepository.deleteDepartment(id);
    }
}
