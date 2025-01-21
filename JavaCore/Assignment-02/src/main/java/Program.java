import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

       //DEPARTMENT
        Department department = new Department(1, "Marketing");
        System.out.println(department);

        //ACCOUNT
        Account account1 = new Account(1, "haidang29productions@gmail.com", "dangblack", "Nguyen Hai Dang", 1, 1, LocalDate.of(2019, 1, 15));
        Account account2 = new Account(2, "account1@gmail.com", "quanganh", "Tong Quang Anh", 0, 2, LocalDate.of(2020, 2, 25));

        //POSITON
        Position devPosition = new Position(1, PositionName.DEV);
        Position testPosition = new Position(2, PositionName.TEST);
        Position scrumMasterPosition = new Position(3, PositionName.SCRUM_MASTER);
        Position pmPosition = new Position(4, PositionName.PM);

        //GROUP
        Group group1 = new Group(1, "Group A", account1, LocalDate.of(2023, 1, 15));
        Group group2 = new Group(2, "Group B", account2, LocalDate.of(2024, 2, 20));

        // Hiển thị thông tin nhóm
        System.out.println("Group ID: " + group1.getGroupId());
        System.out.println("Group Name: " + group1.getGroupName());
        System.out.println("Creator Account ID: " + group1.getCreatorAccountId());
        System.out.println("Create Date: " + group1.getCreateDate());

        // GROUPACCOUNT
        GroupAccount groupAccount1 = new GroupAccount(1,account1,LocalDate.of(2025,1,1));
        GroupAccount groupAccount2 = new GroupAccount(2,account2,LocalDate.of(2024,5,1));

        //TYPE_QUESTION

        TypeQuestion typeQuestion1 = new TypeQuestion(1,TypeName.ESSAY);
        TypeQuestion typeQuestion2 = new TypeQuestion(2,TypeName.MULTIPLE_CHOICE);

        // CATEGORYQUESTION
        CategoryQuestion categoryQuestion1 = new CategoryQuestion(1,"Java");
        CategoryQuestion categoryQuestion2 = new CategoryQuestion(2,"SQL");
        CategoryQuestion categoryQuestion3 = new CategoryQuestion(3,"Postman");

        //Question
        Question question1 = new Question(1 ,"Conten 1",1,1,account1,LocalDate.now());
        Question question2 = new Question(2 ,"Conten 2",2,2,account2,LocalDate.now());

        //ANSWER
        Answer answer1 = new Answer(1,"Conten 1",question1,true);
        Answer answer2 = new Answer(2,"Conten 2",question1,true);

        // bài 1:
//        if (account2.getDepartmentId()==0){
//            System.out.println("nhân viên này chưa có phòng ban");
//        } else {
//            System.out.println("Phòng bạn của nhân viên này là " + account2.getDepartmentId());
//        }
        // bài 2:
        // Kiểm tra account thứ 2 tham gia những nhóm nào
        List<Group> allGroups = new ArrayList<>();
        allGroups.add(group1);
        allGroups.add(group2);
        List<Group> groupsOfAccount2 = new ArrayList<>();
        for (Group group : allGroups) {
            if (group.getCreator().getAccountId() == account2.getAccountId()) {
                groupsOfAccount2.add(group);
            }
        }

        // Xử lý logic in thông báo
        int numberOfGroups = groupsOfAccount2.size();
        if (numberOfGroups == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (numberOfGroups == 1 || numberOfGroups == 2) {
            System.out.print("Group của nhân viên này là: ");
            for (int i = 0; i < groupsOfAccount2.size(); i++) {
                System.out.print(groupsOfAccount2.get(i).getGroupName());
                if (i < groupsOfAccount2.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else if (numberOfGroups == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else if (numberOfGroups >= 4) {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }
}

