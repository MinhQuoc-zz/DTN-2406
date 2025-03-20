package controller;

import entity.Department;
import service.DepartmentService;
import service.IDepartmentService;

import java.util.List;

public class DepartmentController {
    private IDepartmentService departmentService = new DepartmentService();

    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }


    public Department getDepartmentById(int id) {
        return departmentService.getDepartmentById(id);
    }
    public boolean createDepartment(Department department) throws Exception {
        return departmentService.createDepartment(department);
    }

    public boolean updateDepartment(int id,Department department) throws Exception {
        department.setId(id);
        return departmentService.updateDepartment(department);
    }


    public boolean deleteDepartment(int id) throws Exception {
        return departmentService.deleteDepartment(id);
    }
}
