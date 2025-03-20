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
    private Role role;
    private int expInYear;
    private int projectId;
    private String proSkill;

    public void setRole(String role){
        this.role = Role.valueOf(role);
    }
    public enum Role{
        MANAGER,EMPLOYEE
    }
}
