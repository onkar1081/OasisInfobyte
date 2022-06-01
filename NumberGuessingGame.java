import java.util.Scanner;
public class Main{
    public static void main(String arg[])
    {
         Scanner s = new Scanner(System.in);
        int x= 1 + (int)(100* Math.random());
        int a = 3;
        int i, numGuess;
        System.out.println("Guess the number within 3 trials(1 to 100)");
        for (i = 0; i < a; i++) {
            System.out.println("Guess the number");
            numGuess = s.nextInt();
            if (x== numGuess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (x > numGuess && i != a - 1) {
                System.out.println("The number is "+ "greater than " + numGuess);
            }
            else if (x < numGuess&& i != a - 1) {
                System.out.println("The number is" + " less than " + numGuess);
            }
        }
        if (i == a) {
            System.out.println("You have exhausted "+  a+" trials.");
            System.out.println("The number was " + x);
    }
}
}
