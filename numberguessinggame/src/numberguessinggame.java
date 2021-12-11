import java.util.Random;
import java.util.Scanner;

public class numberguessinggame {
	
	public static void main (String[]args) {
		
		Random rand = new Random();
		int answer = rand.nextInt (100) + 1;
		int totalAttempts = 0;
		final int maxAttempts = 9;
		Scanner scan = new Scanner(System.in);
		int guess;
		
		System.out.println("You will start with 10 points and lose 1 per wrong guess! Enter 0 to terminate.");
		System.out.println("Guess a number between 1 and 100: ");
		guess = scan.nextInt();
		
		if (guess == 0) {
			System.out.println("Goodbye");
		}
		
		while (guess != 0) {
		
			if (guess == answer && totalAttempts != maxAttempts) {
				System.out.println("Your guess was correct!");
				System.out.println("The number was: " + answer );
				System.out.println("Your score was: " + (maxAttempts - totalAttempts + 1));
				break;
			}	
			if (guess == answer && totalAttempts == maxAttempts) {
				System.out.println("Phew. Your guess was correct on the last attempt!");
				System.out.println("The number was: " + answer );
				System.out.println("Your score was: " + (maxAttempts - totalAttempts + 1));
				break;	
			}
		
			else if (guess < answer && totalAttempts != maxAttempts) {
				System.out.println("Your guess is too low.");
				totalAttempts++;
				guess = scan.nextInt();
			
			}
			
			else if (guess > answer && totalAttempts != maxAttempts) {
				System.out.println("Your guess was too high.");
				totalAttempts++;
				guess = scan.nextInt();
			}
			if (totalAttempts == maxAttempts && guess != answer) {
				System.out.println("Sorry. The number was: " + answer);
				break;
				
		}
	}
}
}