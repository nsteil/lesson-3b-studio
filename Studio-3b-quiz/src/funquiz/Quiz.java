package funquiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> quizQuestions = new ArrayList<>();
    private HashMap<Integer, String> quizResults = new HashMap<>();
    private int numCorrect = 0;
    Scanner input = new Scanner(System.in);


    public void addMCQuestion(MultipleChoice newQuestion) {
        quizQuestions.add(newQuestion);
    }

    public void addTFQuestion(Question newQuestion){
        quizQuestions.add(newQuestion);
    }

    // public addCBQuestion()
    public void runQuiz(){
        int i = 1;
        for (Question item : quizQuestions){

            int answerKey = 0;
            System.out.println(i + ". " + item.prompt);
            if (item instanceof MultipleChoice){
                for (Map.Entry<Integer, String> option : ((MultipleChoice) item).options.entrySet()){
                    System.out.println(option.getKey() + ") " + option.getValue());
                    //if (correctAnswer.equals(option.getValue());
                }
                System.out.println("Please select the correct number");
                answerKey  = input.nextInt();
                for (Map.Entry<Integer,String> option : ((MultipleChoice) item).options.entrySet()){
                    if (answerKey == (option.getKey())){
                        item.userAnswer = option.getValue();
                    }
                }
            }

            if(item instanceof TrueFalse){
                System.out.println("1) True\n2) False?");
                answerKey = input.nextInt();
                if (answerKey == 1){
                    item.userAnswer = "true";
                } else if (answerKey == 2) {
                    item.userAnswer = "false";
                }
            }
            if (item instanceof Checkbox){
                for (Map.Entry<Integer, String> option : ((Checkbox) item).options.entrySet()){
                    System.out.println(option.getKey() + ") " + option.getValue());
                    //if (correctAnswer.equals(option.getValue());
                }
                System.out.println("Select all that apply");
                ((Checkbox) item).userAnswer = input.next();

            }

            if (item.gradeQuestion()){
                quizResults.put(i, "correct");
                numCorrect++;

            } else {
                quizResults.put(i, "incorrect");

            }

           i++;
        }

        System.out.println("Would you like to see your grade? Y/N");
        String gradeResponse = input.next();

        if (gradeResponse.toLowerCase().equals("y")){
            for(Map.Entry<Integer,String> result : quizResults.entrySet()){
                System.out.println("Question " + result.getKey() + " was " + result.getValue());
            }
            System.out.println("\nTotal grade: " + numCorrect + " out of " + quizResults.size());
        } else if(gradeResponse.toLowerCase().equals("n")){
            System.out.println("Thanks for trying Nate's quiz!");
        }

    }
    // gradeQuiz
}
