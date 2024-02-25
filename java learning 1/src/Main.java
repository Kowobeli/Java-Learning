import java.sql.Struct;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int points = 0;
        Scanner scanner = new Scanner(System.in);
        String inputa1 = null;
        String inputa2 = null;
        String inputa3 = null;
        String q1 = "what's 1 + 1?";
        String q2 = "what's 2 + 1?";
        String q3 = "what's 3 + 1?";
        String a1 = "2";
        String a2 = "3";
        String a3 = "4";

        System.out.println(q1);
        inputa1 = scanner.next();
        if(Objects.equals(inputa1, a1)){
            points++;
            System.out.println("You are right! You have " + points + " points.");
        }
        else{
            System.out.println("You are wrong. The correct answer is: " + a1);
        }
        System.out.println(q2);
        inputa2 = scanner.next();
        if(Objects.equals(inputa2, a2)){
            points++;
            System.out.println("You are right! You have " + points + " points.");
        }
        else{
            System.out.println("You are wrong. The correct answer is: " + a2);
        }
        System.out.println(q3);
        inputa3 = scanner.next();
        if(Objects.equals(inputa3, a3)){
            points++;
            System.out.println("You are right! You have " + points + " points.");
        }
        else{
            System.out.println("You are wrong. The correct answer is: " + a3);
        }
        System.out.println("The trivia game is finished. You made " +  points + " points!");
    }
}