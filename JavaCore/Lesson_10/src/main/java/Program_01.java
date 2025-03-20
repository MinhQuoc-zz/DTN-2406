import controller.DepartmentController;
import entity.Department;

import java.util.List;

public class Program_01 {
    public static void main(String[] args) throws Exception {
        //Mô hình 3 layer
        DepartmentController departmentController = new DepartmentController();

        List<Department> departments = departmentController.getAllDepartment();
        departments.forEach(department -> System.out.println(department));

//        Department department = new Department(2," Coder");
//        System.out.println(departmentController.createDepartment(department));

//        Department department = new Department(12,"Bixy");
//        System.out.println(departmentController.updateDepartment(12,department));
        System.out.println(departmentController.deleteDepartment(14));

    }
}
