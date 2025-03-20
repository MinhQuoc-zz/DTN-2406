package com.vti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Đánh dáu class thuộc layer controller
@RequestMapping("hello")
//Tạo đường dẫn đến controller
public class HelloController {
    @GetMapping //Đánh dấu method xử lý cho phương thức GET
    public String helloWorld(){
        return "Hello Spring";
    }
}
