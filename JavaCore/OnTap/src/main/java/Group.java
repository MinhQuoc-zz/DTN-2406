import java.time.LocalDate;
import java.util.List;

public class Group {
    private int groupId;
    private String groupName;
    private Account creatorId;
    private LocalDate createDate;


    public Group(int groupId, String groupName,Account creatorId, LocalDate createDate){
        this.groupId = groupId;
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.createDate = createDate;

    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Account getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Account creatorId) {
        this.creatorId = creatorId;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", creatorId=" + creatorId +
                ", createDate=" + createDate +
                '}';
    }

}
