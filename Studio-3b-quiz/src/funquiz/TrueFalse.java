package funquiz;

public class TrueFalse extends Question{

    public TrueFalse(String aPrompt, String aCorrectAnswer){
        super(aPrompt,aCorrectAnswer);
    }

    @Override
    public boolean gradeQuestion(){
        return userAnswer.equals(correctAnswer);
    }
}
