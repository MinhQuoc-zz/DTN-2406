import java.time.LocalDate;

public class Question {
    private int questionId;
    private String content;
    private int categoryID;
    private int typeId;
    private Account creatorId;
    private LocalDate createDate;

    public Question(int questionId, String content, int categoryID, int typeId, Account creatorId, LocalDate createDate) {
        this.questionId = questionId;
        this.content = content;
        this.categoryID = categoryID;
        this.typeId = typeId;
        this.creatorId = creatorId;
        this.createDate = createDate;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
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
    // lấy ra chỉ số accountID
    public int getCreatorAccount(){
        return  creatorId.getAccountId();
    }
}
