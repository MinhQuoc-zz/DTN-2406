package com.vti.entity;

import jakarta.persistence.*;


//@Getter
//@Setter
//@AllArgsConstructor
@Entity //Đánh dấu class là một entity
@Table(name = "Department") //Config bảng
//@RequiredArgsConstructor
public class Department {
    @Id //PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT
    @Column(name = "DepartmentID") //config cột (name: tên cột)
    private int id;
    //@NonNull
    @Column(name = "DepartmentName",length = 50,nullable = false) // lenght:độ dài tối đa nullable <=> NOT NULL
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//contructor không tham số
    //getter,setter cho tất cả property


}
