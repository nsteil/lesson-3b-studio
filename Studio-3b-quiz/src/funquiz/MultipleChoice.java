package funquiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class MultipleChoice extends Question{
    protected HashMap<Integer, String> options = new HashMap<>();


    public MultipleChoice(String aPrompt, String aCorrectAnswer, String optionOne, String optionTwo, String optionThree, String optionFour){
        super(aPrompt, aCorrectAnswer);
        this.options.put(1,optionOne);
        this.options.put(2,optionTwo);
        this.options.put(3,optionThree);
        this.options.put(4,optionFour);
    }

    @Override
    public boolean gradeQuestion() {
        boolean isCorrect = userAnswer.equals(correctAnswer);
         return isCorrect;
    }
}
