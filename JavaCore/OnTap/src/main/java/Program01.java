import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program01 {
    public static void main(String[] args) {
    // DEPARTMENT
        Department department1 = new Department(1 , "Maketing");
        Department department2 = new Department(2 , "Bao ve");
        System.out.println(department1);

        //POSITON
        Position devPosition = new Position(1, PositionName.DEV);
        Position testPosition = new Position(2, PositionName.TEST);
        Position scrumMasterPosition = new Position(3, PositionName.SCRUM_MASTER);
        Position pmPosition = new Position(4, PositionName.PM);

        //ACCOUNT
        Account account1 = new Account(1, "haidang29productions@gmail.com", "dangblack", "Nguyen Hai Dang", department1, devPosition, LocalDate.of(2019, 1, 15));
        Account account2 = new Account(2, "account1@gmail.com", "quanganh", "Tong Quang Anh", department2, scrumMasterPosition, LocalDate.of(2020, 2, 25));

        //GROUP
        Group group1 = new Group(1, "Group A", account1, LocalDate.of(2023, 1, 15));
        Group group2 = new Group(2, "Group B", account2, LocalDate.of(2024, 2, 20));
        System.out.println(group1);
        // Hiển thị thông tin nhóm
        System.out.println("Group ID: " + group1.getGroupId());
        System.out.println("Group Name: " + group1.getGroupName());
        System.out.println("Create Date: " + group1.getCreateDate());

        // GROUPACCOUNT
        GroupAccount groupAccount1 = new GroupAccount(group1,account1,LocalDate.of(2025,1,1));
        GroupAccount groupAccount2 = new GroupAccount(group2,account2,LocalDate.of(2024,5,1));

        //TYPE_QUESTION

        TypeQuestion typeQuestion1 = new TypeQuestion(1,TypeName.ESSAY);
        TypeQuestion typeQuestion2 = new TypeQuestion(2,TypeName.MULTIPLE_CHOICE);

        // CATEGORYQUESTION
        CategoryQuestion categoryQuestion1 = new CategoryQuestion(1,"Java");
        CategoryQuestion categoryQuestion2 = new CategoryQuestion(2,"SQL");
        CategoryQuestion categoryQuestion3 = new CategoryQuestion(3,"Postman");

        //Question
        Question question1 = new Question(1 ,"Conten 1",categoryQuestion1,typeQuestion1,account1,LocalDate.now());
        Question question2 = new Question(2 ,"Conten 2",categoryQuestion2,typeQuestion2,account2,LocalDate.now());

        //ANSWER
        Answer answer1 = new Answer(1,"Conten 1",question1,true);
        Answer answer2 = new Answer(2,"Conten 2",question1,true);

        //Exam
        Exam exam1 = new Exam(1,"Code 1","title1",categoryQuestion1,60,account2,LocalDate.now());
        Exam exam2 = new Exam(2,"Code 2","title2",categoryQuestion1,60,account2,LocalDate.now());

        //ExamQuestion
        ExamQuestion examQuestion1 = new ExamQuestion(exam1,question1);
        ExamQuestion examQuestion2 = new ExamQuestion(exam2,question2);

        // EXERCISE-01
        //IF
        //QUESTION 1:
        System.out.println("Bai 1:");
        if(account2.getDepartmentId() == 0){
            System.out.println("Nhân viên này chưa có phòng ban");
        }else {
            System.out.println("Phòng ban của nhân viên này là: " + department2.getDepartmentName());
        }

        //Question 2:
        // Kiểm tra account thứ 2 tham gia những nhóm nào
        List<Group> allGroups = new ArrayList<>();
        allGroups.add(group1);
        allGroups.add(group2);
        List<Group> groupsOfAccount2 = new ArrayList<>();
        for (Group group : allGroups) {
            if (group.getGroupId() == account2.getAccountId()) {
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

        //Question 3:
        System.out.println("Bài 3:");
        System.out.println( account2.getDepartmentId() == 0 ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là : " + department2.getDepartmentName());

        //Question 4:
        System.out.println("Bài 4: ");
        System.out.println(account2.getPositionId().getPositionName()== PositionName.DEV
                ? "Đây là Developer"
                : "Người này không phải là Developer");
        //SWITCH CASE
        //Question 5:
        System.out.println("Bài 5: ");
        int count = 0;
        for (GroupAccount ga : List.of(groupAccount1, groupAccount2)) { // Giả sử bạn có danh sách GroupAccount
            if (ga.getGroupId().getGroupId() == group1.getGroupId()) {
                count++;
            }
        }
        // In ra kết quả theo format yêu cầu
        System.out.println("Số lượng Account trong nhóm " + group1.getGroupName() + " là: " + count);
        switch (count){
            case 1:
                System.out.println("Nhóm có 1 thành viên");
                break;
            case 2:
                System.out.println("Nhóm có 2 thành viên");
                break;
            case 3:
                System.out.println("Nhóm có 3 thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
        }

        //Question 6
        switch (numberOfGroups){
            case 1:
                System.out.println("Group của nhân viên này là Java");
                break;
            case 2:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;

            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
        //FOR REACH
        //Question 8
        // Tạo danh sách các tài khoản
        System.out.println("Bài 8");
        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);

        for (Account account : accounts){
            System.out.println("Email: " + account.getEmail());
            System.out.println("Tên đầy đủ: " + account.getFullName());
            System.out.println("Phòng ban: " + account.getDepartmentId());
            System.out.println();
        }
        // Question 9
        // Tạo danh sách các phòng ban
        System.out.println("Bài 9");
        List<Department> departments = new ArrayList<>();
        departments.add(department1);
        departments.add(department2);
        for(Department department : departments){
            System.out.println("Id: " + department.getDepartmentId());
            System.out.println("Name: " + department.getDepartmentName());
        }

    }
}
