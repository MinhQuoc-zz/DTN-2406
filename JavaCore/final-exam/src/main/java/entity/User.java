package entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String fullName;
    private String email;
    private String password;


    //Chuyển kiểu dữ liệu string từ database sang enum java
public void setRole(String role){
    this.role = Role.valueOf(role);
}

    private Role role;
    public enum Role {
        EMPLOYEE, ADMIN
    }


}
