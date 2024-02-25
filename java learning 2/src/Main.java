import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int points = 0;
    public static void main(String[] args) {
        String[] questions = new String[5];
        questions[0] = "what's 1 + 1?";
        questions[1] = "what's 2 + 1?";
        questions[2] = "what's 3 + 1?";
        questions[3] = "what's 4 + 1?";
        questions[4] = "what's 5 + 1?";

        String[] answers = new String[5];
        answers[0] = "2";
        answers[1] = "3";
        answers[2] = "4";
        answers[3] = "5";
        answers[4] = "6";

        int i = 1;
        while(i == 1){
            printingQuestionsAndFeedback(questions, answers);
            System.out.println("Type 1 if you want to repeat the test, or 0 if you want to stop.");

            try{
                i = Integer.parseInt(scanner.next());
            }
            catch(NumberFormatException e){
                System.out.println("Bruh. You almost broke the code, wanna NOT do that again please?? I wanna repeat.");
            }

            if(i == 1){
                points = 0;
                System.out.println("Your points from your last try have been reset.");
            } else if (i == 0) {
                break;
            } else {
                System.out.println("That doesn't seems like a 0 or a 1 to me O_o. Ending the code because you look dumb!");
            }
        }


//        System.out.println(q1);
//        inputa1 = scanner.next();
//        if(Objects.equals(inputa1, a1)){
//            points++;
//            System.out.println("You are right! You have " + points + " points.");
//        }
//        else{
//            System.out.println("You are wrong. The correct answer is: " + a1);
//        }
//        System.out.println(q2);
//        inputa2 = scanner.next();
//        if(Objects.equals(inputa2, a2)){
//            points++;
//            System.out.println("You are right! You have " + points + " points.");
//        }
//        else{
//            System.out.println("You are wrong. The correct answer is: " + a2);
//        }
//        System.out.println(q3);
////        inputa3 = scanner.next();
////        if(Objects.equals(inputa3, a3)){
////            points++;
////            System.out.println("You are right! You have " + points + " points.");
////        }
////        else{
////            System.out.println("You are wrong. The correct answer is: " + a3);
//        }
//        System.out.println("The trivia game is finished. You made " +  points + " points!");
//
    }
    public static void printingQuestionsAndFeedback(String[] questions, String[] answers){
        String finish = "The trivia game is finished. ";
        for(int i = 0; i < 5; i++){
            System.out.println(questions[i]);
            String input = scanner.next();
            extracted(answers, input, i);
        }
        switch (points){
            case 5: System.out.println(finish + "You made " +  points + " points! Well done!"); break;
            case 4: System.out.println(finish + "You made " +  points + " points! Almost perfect, but very good!"); break;
            case 3: System.out.println(finish + "You made " +  points + " points! Not the worst, nor the best."); break;
            case 2: System.out.println(finish + "You made " +  points + " points! You should take some math class."); break;
            case 1: System.out.println(finish + "You made " +  points + " points! Didn't know you skipped the entire school."); break;
            default: System.out.println(finish + "Really?? No points?? What a shame!"); break;
        }
    }

    private static void extracted(String[] answers, String input, int i) {
        if(Objects.equals(input, answers[i])){
            points++;
            System.out.println("You are right! You have " + points + " points.");
        }else{
            System.out.println("You are wrong. The correct answer is: " + answers[i] + ". You have " + points + " points.");
        }
    }

}