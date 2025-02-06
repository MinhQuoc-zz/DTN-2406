import java.time.LocalDate;

public class Exam {
    private int examId;
    private String code;
    private String title;
    private CategoryQuestion categoryId;
    private int duration;
    private Account creatorId;
    private LocalDate createDate;

    public Exam(int examId, String code, String title, CategoryQuestion categoryId, int duration, Account creatorId, LocalDate createDate) {
        this.examId = examId;
        this.code = code;
        this.title = title;
        this.categoryId = categoryId;
        this.duration = duration;
        this.creatorId = creatorId;
        this.createDate = createDate;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryQuestion getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategoryQuestion categoryId) {
        this.categoryId = categoryId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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
