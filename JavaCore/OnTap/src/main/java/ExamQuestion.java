public class ExamQuestion {
    private Exam examId;
    private Question questionId;

    public ExamQuestion(Exam examId, Question questionId) {
        this.examId = examId;
        this.questionId = questionId;
    }

    public Exam getExamId() {
        return examId;
    }

    public void setExamId(Exam examId) {
        this.examId = examId;
    }

    public Question getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Question questionId) {
        this.questionId = questionId;
    }
}
