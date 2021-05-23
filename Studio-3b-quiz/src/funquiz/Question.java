package funquiz;

public abstract class Question {
    protected String prompt;
    protected String correctAnswer;
    protected String userAnswer;

    public Question(String aPrompt, String aCorrectAnswer){
        this.prompt = aPrompt;
        this.correctAnswer = aCorrectAnswer;
    }

    public abstract boolean gradeQuestion();
}
