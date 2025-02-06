import java.time.LocalDate;

public class Account {
    private int accountId;
    private String email;
    private String userName;
    private String fullName;
    private Department departmentId;
    private Position positionId;
    private LocalDate createdDate;

    public Account(int accountId, String email, String userName, String fullName, Department departmentId, Position positionId, LocalDate createdDate){
        this.accountId = accountId;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.departmentId = departmentId;
        this.positionId = positionId;
        this.createdDate = createdDate;
    }

    public int getAccountId(){
        return accountId;
    }
    public void setAccountId(int accountId){
        this.accountId=accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartmentId() {
        return departmentId.getDepartmentId();
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    public Position getPositionId() {
        return positionId;
    }

    public void setPositionId(Position positionId) {
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
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", departmentId=" + departmentId +
                ", positionId=" + positionId +
                ", createdDate=" + createdDate +
                '}';
    }
    public int getAccountDepartmentId(){
        return departmentId.getDepartmentId();
    }
    public int getAccountPositiomId(){
        return positionId.getPositionId();
    }


}
