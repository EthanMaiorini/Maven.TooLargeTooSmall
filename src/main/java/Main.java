/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int upper = 25;
        int result;
        int tries = 0;
        Main mainObject = new Main();
        int intRandom = rand.nextInt(upper);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Guess a number between 0 and 24: ");
            result = scanner.nextInt();
            tries++;
        }while(!(mainObject.guess(intRandom,result)));
        System.out.println("It took "+tries);
        scanner.close();
    }

    public boolean guess(int answer, int guess) {
        if(guess == answer){
            System.out.println("Correct guess");
            return true;
        } else if (guess < answer){
            System.out.println("Too small");
            return false;
        }else{
            System.out.println("Too large");
            return false;
        }
    }

}
