import java.time.LocalDate;

public class Question {
    private int questionId;
    private String content;
    private CategoryQuestion categoryId;
    private TypeQuestion typeId;
    private Account creatorId;
    private LocalDate createDate;

    public Question(int questionId, String content, CategoryQuestion categoryId, TypeQuestion typeId, Account creatorId, LocalDate createDate) {
        this.questionId = questionId;
        this.content = content;
        this.categoryId = categoryId;
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

    public CategoryQuestion getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategoryQuestion categoryId) {
        this.categoryId = categoryId;
    }

    public TypeQuestion getTypeId() {
        return typeId;
    }

    public void setTypeId(TypeQuestion typeId) {
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
}
