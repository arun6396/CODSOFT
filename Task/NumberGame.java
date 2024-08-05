package Task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGame {

	private static void game() {
		int score = 10;
		int attempts = 0;
		int randomNumber = (int) (Math.random() * 100) + 1;
		while (attempts < 10) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the Number 1 to 100  : ");

			int  n = sc.nextInt();

			if (n > 100) {
				System.out.println("Number is high");
				continue;
			}
			if (n < 0) {
				System.out.println("Number is low"
						+ "");
				continue;
			}

			if (n <= 100) {
				if (n == randomNumber) {
					System.out.println("---------------------------------------------------------------------------");
					System.out.println("Congrates!  You Won the Game");
				    attempts++;
					System.out.println("Game Score :" + score);
					System.out.println("Number of attempts :" + attempts);
					System.out.println("---------------------------------------------------------------------------");
					return;
				} else {
					System.out.println("Wrong");
					score--;
					attempts++;
					System.out.println("---------------------------------------------------------------------------");
					System.out.println("score :" + score);
					System.out.println("attempts :" + attempts);
					System.out.println("---------------------------------------------------------------------------");

				}

			}
		}
		System.out.println("---------------------------------------------------------------------------");
		
		System.out.println("Thank you playing game and better luck next time !");
		System.out.println("Random number is : " + randomNumber);
		System.out.println("score :" + score);
		System.out.println("attempts :" + attempts);
		System.out.println("---------------------------------------------------------------------------");
		
	}

	public static void main(String[] args) {
		game();

	}

}
