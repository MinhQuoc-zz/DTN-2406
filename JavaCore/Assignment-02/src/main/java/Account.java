import java.time.LocalDate;

public class Account {
    private int accountId;
    private String email;
    private String username;
    private  String fullname;
    private int departmentId;
    private int positionId;
    private LocalDate createdDate;


    public Account(int accountId, String email, String username, String fullname, int departmentId, int positionId, LocalDate createdDate) {
        this.accountId = accountId;
        this.email = email;
        this.username = username;
        this.fullname = fullname;
        this.departmentId = departmentId;
        this.positionId = positionId;
        this.createdDate = createdDate;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullname='" + fullname + '\'' +
                ", departmentId=" + departmentId +
                ", positionId=" + positionId +
                ", createdDate=" + createdDate +
                '}';
    }
}
