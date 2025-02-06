import java.time.LocalDate;

public class GroupAccount {
    private Group groupId;
    private Account accountId;
    private LocalDate joinDate;

    public GroupAccount(Group groupId, Account accountId, LocalDate joinDate) {
        this.groupId = groupId;
        this.accountId = accountId;
        this.joinDate = joinDate;
    }

    public Group getGroupId() {
        return groupId;
    }

    public void setGroupId(Group groupId) {
        this.groupId = groupId;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }
}

