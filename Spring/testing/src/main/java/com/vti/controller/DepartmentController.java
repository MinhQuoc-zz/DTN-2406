package com.vti.controller;

import com.vti.entity.Department;
import com.vti.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //đánh dấu class này thuộc controller
@RequestMapping("api/v1/departments") //restfull API
public class DepartmentController {
    @Autowired //tự khởi tạo đối tượng
    private IDepartmentService departmentService;
    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody Department department){ // @RequestBody: Lấy thông tin client truyền trong body
        Department departmentCreated = departmentService.createDepartment(department);
        return new ResponseEntity<>(departmentCreated, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Department> updateDepartment(@PathVariable int id, @RequestBody Department department){
        department.setId(id);
        Department departmentUpdate = departmentService.updateDepartment(department);
        return new ResponseEntity<>(departmentUpdate, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteDepartment(@PathVariable int id){
        departmentService.deleteDepartment(id);
        return new ResponseEntity<>("Department id = " +id+"deleted",HttpStatus.OK);
    }
    //getDepartmentById

    @GetMapping("{id}")
    public ResponseEntity<Object> getDepartmentById(@PathVariable int id){
        Optional<Department> departmentById = departmentService.getDepartmentById(id);
        return new ResponseEntity<>(departmentById,HttpStatus.OK);
    }

}
