package hangman;

public class Answer {

	private String answer = "";
	private int guessNum = 0;
	private String guess = "";
	private String listGuess = "";
	private String[] answerArray = new String[0];
	private int[] showChar = new int[0];
	private String listCompile = "";
	private int oldSum = 0;
	private int sum = 0;
	
	
	public int getSum() {
		return this.sum;
	}
	
	public void setAnswer(String c) {
		this.answer = c;
		answerArray = new String[answer.length()];
		for (int i = 0; i < answerArray.length; i++) {
			answerArray[i] = answer.substring(i, i+1);
		}
		showChar = new int[answer.length()];
		for (int i = 0; i < showChar.length; i++) {
			showChar[i] = 0;
		}
	}
	
	public String getAnswer() {
		return this.answer;
	}

	public int length() {
		return answer.length();
	}
	
	public void setGuessNum(int a) {
		this.guessNum = a;
	}
	
	public int getGuessNum() {
		return this.guessNum;
	}
	
	public void setGuess(String a) {
		this.guess = a;
	}
	
	public String getGuess() {
		return this.guess;
	}
	
	public void guesses() {
		listGuess = listGuess + getGuess();
		
	}
	public void listGuesses() {
		System.out.println(listCompile);
		System.out.print("Previous guesses: ");
		for(int i = 0; i < listGuess.length(); i++) {
			System.out.print(" " + listGuess.substring(i, i + 1) + ",");
		}
		System.out.println();
	}
	public void checkGuess() {
	oldSum = sum;
		boolean incorrect = true;
		for (int k = 0; k < listGuess.length(); k++) {
			listCompile = "";
		for (int i = 0; i<answer.length(); ++i) {
			
		
			if(listGuess.substring(k,k+1).equalsIgnoreCase(answerArray[i])) {
			showChar[i] = 1;						
				incorrect = false; //add this after, if matchingLetters has increased
		
			}
			
			
			switch (showChar[i]) {
			case 1:
				listCompile = listCompile + answer.charAt(i) + " ";
				break;
			case 0:
				listCompile = listCompile + "_ ";
				break;
			}
			
		}
		}
		sum = 0;
		for(int p = 0; p < showChar.length; p++) {
			sum += showChar[p];
		}
		
		if (sum<=oldSum) {
			guessNum = guessNum + 1;
		}
		System.out.println();
	}
	
	public void getFirstLine() {
	int index = 0;
	while (index < answer.length()) {
	System.out.print("_ ");
	index = index + 1;
	}
	System.out.println();
	}
}