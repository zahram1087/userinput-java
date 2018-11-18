import java.util.Scanner;

public class Main {
    public static void main (String [] args){
 /*Scanner scanner = new Scanner(System.in); //stages the keyboard as the scanner
 String inputGreeting = scanner.next(); // method that captures a string input/ is used to scan the keyboard
 System.out.println(inputGreeting);
 questionAnswers();*/

 questionAnswers();
    }
    public static void questionAnswers(){
        /*System.out.format("I have %d cats, %d fish , 1 %s and %.1f goats", 2,4, "dog", 1.5);
        System.out.format("\nwhen formatted %.1f", 4.5-2.7); */
        Scanner scanner = new Scanner (System.in); //new scanner is created and stored in a variable

        System.out.println("What is your name?");

        String userName = scanner.next();//method does blocking, it will block any progression until it recieves some input
        System.out.println( "Hello " + userName);

        System.out.println("\nHow old are you " + userName + " ?");
        int userAge = scanner.nextInt(); //method that captures integers responses
        System.out.println( userName + " you indicated you are " + userAge + " years old");

        System.out.println("\nHow tall are you in meters ?");

        double userHeight = scanner.nextDouble();
        System.out.println( userName + " you are " + userHeight + " meters tall");
        double averageMaleHeightDifference = userHeight-1.75;
        double averageFemaleHeightDifference = userHeight-1.62;
        System.out.format("you are %.1fm taller than the average female ", averageFemaleHeightDifference );
        System.out.format("\nyou are %.1fm taller than the average male " , averageMaleHeightDifference);

    }
}
