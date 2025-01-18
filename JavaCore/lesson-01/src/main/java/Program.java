import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.id = 1;
        department.name = "Bảo vệ";

        Department department2 = new Department();
        department2.id =2;
        department2.name = "Giám đốc";
        System.out.println("department.name = " + department2.name);

        Position position = new Position();
        position.id = 1;
        position.name = PositionName.DEV;
        System.out.println("position.name = " + position.name);

        Account account = new Account();
        account.id =1;
        account.email = "quoc@gamil.com";
        account.userName = "quoc.nm";
        account.fullName = "Nguyen Minh Quoc";
        account.department = department;
        account.position = position;
        account.createDate = LocalDate.now();
        System.out.println("account.department.name = " + account.department.name);

        Group group = new Group();
        group.id = 1;
        group.name = "VTI";
        group.creatorId = 1;
        group.createdDate = LocalDate.now();
        System.out.println("group.name = " + group.name);

        GroupAccount groupaccount = new GroupAccount();
        groupaccount.creatorId = 1;
        groupaccount.accountId = 1;
        groupaccount.joinDate = LocalDate.now();
        System.out.println("groupaccount.joinDate = " + groupaccount.joinDate);

        TypeQuestion typeQuestion = new TypeQuestion();
        typeQuestion.typeId = 1 ;
        typeQuestion.typeName = "Essay";
        System.out.println("typeQuestion.typeName = " + typeQuestion.typeName);

        CategoryQuestion categoryQuestion = new CategoryQuestion();
        categoryQuestion.categoryId = 1;
        categoryQuestion.categoryName = "Java";
        System.out.println("categoryQuestion.categoryName = " + categoryQuestion.categoryName);

        Question question = new Question();
        question.questionId = 1;
        question.content = "Hỏi về java";
        question.categoryQuestion = categoryQuestion;
        question.typeQuestion = typeQuestion;
        question.department = department;
        question.createdDate = LocalDate.now();
        System.out.println("question.categoryQuestion = " + question.categoryQuestion.categoryId);

        Answer answer = new Answer();
        answer.answerId= 1;
        answer.content = "Trả lời 1";
        answer.question = question;
        answer.isCorrect = true;
        System.out.println("answer.isCorrect = " + answer.isCorrect);

        Exam exam = new Exam();
        exam.examId = 1;
        exam.code = "1234";
        exam.title ="Đề thi Java";
        exam.categoryQuestion = categoryQuestion;
        exam.duration = LocalDate.of(2024,9,9);
        exam.department = department;
        exam.createDate = LocalDate.now();
    }
}
