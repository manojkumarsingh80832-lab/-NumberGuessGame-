import java.util.Scanner;
import java.util.Random;
public class NumberGuessGame{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   Random random = new Random();
   int secretNumber = random.nextInt(100)+1;
int guess = 0 ; 
System.out.println("Number Guessing Game ");
System.out.println("Enter the number b/w 1 to 100");
while(guess != secretNumber){
    System.out.println("Enter the guess number");
    guess = sc.nextInt();
    if(guess < secretNumber){
        System.out.println("small number");
    }
    else if(guess > secretNumber){
        System.out.println("largest number");
    }
    else
        {
        System.out.println("correct number");
    }
} 
}
}
