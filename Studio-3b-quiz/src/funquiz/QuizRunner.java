package funquiz;

import static java.util.Arrays.asList;

public class QuizRunner {
    public static void main(String[] args){
        Quiz trickyQuiz = new Quiz();
        MultipleChoice javaQuestion = new MultipleChoice("What language is this test programmed in?", "Java","JavaScript","DogeScript","It wasn't programmed", "Java");
        trickyQuiz.addMCQuestion(javaQuestion);
        MultipleChoice foodQuestion = new MultipleChoice("What is the greatest dessert of all time?", "Ice Cream", "Cookies", "Ice Cream", "Brownies", "Cake");
        trickyQuiz.addMCQuestion(foodQuestion);
        TrueFalse emoRocks = new TrueFalse("Does emo music rock?","true");
        trickyQuiz.addTFQuestion(emoRocks);
        Checkbox iceCreamFlavors = new Checkbox("Which flavors of ice cream are delicious?","1,3,4", "Chocolate","Broccoli", "Cookie Dough", "Mint Chip");
        trickyQuiz.addTFQuestion(iceCreamFlavors);
        trickyQuiz.runQuiz();
    }
}
