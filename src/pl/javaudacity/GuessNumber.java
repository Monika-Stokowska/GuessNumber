package pl.javaudacity;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
	int randomNumber = (int) (Math.random()*100) + 1;
	boolean hasWon = false;


        System.out.println("I have randomly chosen a number from 1 to 100. Try to guess it!");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i>0; i-- ){
            if (i==10){
                System.out.println("Please enter your number: ");
            }
            else {
                System.out.println("You have " + i + " guesses left! Choose again! Please enter your number:");
            }
            int guess = scanner.nextInt();
            System.out.println("Your guess was "+ guess);

            if (guess <randomNumber) {
                System.out.println("Your number is too small.");
            }else if (guess > randomNumber) {
                System.out.println("Your number is too big!");
            }
            else {
                hasWon = true;
                break;
            }
        }
        if (hasWon) {
            System.out.println("Congratulations! You win!");
        }
        else {
            System.out.println("You lose :( The correct number was "+ randomNumber);
        }
    }
}
