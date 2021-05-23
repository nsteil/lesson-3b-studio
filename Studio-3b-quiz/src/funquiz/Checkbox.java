package funquiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Checkbox extends Question{
    protected HashMap<Integer,String> options = new HashMap<>();
    protected List<String> answerList = new ArrayList<>();
    protected List<String> correctAnswers = new ArrayList<>();


    public Checkbox(String aPrompt, String aCorrectAnswer, String optionOne, String optionTwo, String optionThree, String optionFour){
        super(aPrompt, aCorrectAnswer);
        this.options.put(1,optionOne);
        this.options.put(2,optionTwo);
        this.options.put(3,optionThree);
        this.options.put(4,optionFour);
        String[] answers = aCorrectAnswer.split(",");
        correctAnswers = Arrays.asList(answers);
    }

    @Override
    public boolean gradeQuestion(){
        int sum = 0;
        String[] answerParse = userAnswer.split(",");
        answerList = Arrays.asList(answerParse);
        if(answerList.size() == correctAnswers.size()) {
            for (String answer : answerList) {
                if (correctAnswers.contains(answer)){
                    sum++;
                }
            }
            return sum == correctAnswers.size();
        } else {
            return false;
        }
    }


}
