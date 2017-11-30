package src;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Illustration illustration = new Illustration();
		Answer answer = new Answer();
		System.out.print("Please enter the word you would like them to guess! ");
		answer.setAnswer(input.nextLine());
		for (int i = 0; i < 100; ++i) {
			System.out.println();
		}
		illustration.zero();
		answer.getFirstLine();

		do {
			System.out.print("Enter a guess! ");
			answer.setGuess(input.nextLine());
			answer.guesses();
			answer.checkGuess();
			illustration.getIllustration(answer.getGuessNum());
			answer.listGuesses();
		} while (answer.getGuessNum() < 6 && answer.getSum() < answer.getAnswer().length()); 
		if (answer.getSum() == answer.getAnswer().length()) {
			System.out.println("Congratulations! The answer was " + answer.getAnswer() + ". You won!");
		} else {
			System.out.println("You lost! The answer was " + answer.getAnswer() + ". Better luck next time.");
		}

	}

}