package hangman;

public class Illustration {
	public void zero () {
		System.out.println();
		System.out.println("****_____**********");
		System.out.println("***/*****\\*********");
		System.out.println("***|******|********");
		System.out.println("***|***************");
		System.out.println("***|***************");
		System.out.println("***|***************");
		System.out.println("***|***************");
		System.out.println("***|***************");
		System.out.println("***|***************");
		System.out.println("***|***************");
		System.out.println("***|***************");
		System.out.println("___|___************");	
		System.out.println();
	}
	
	public void one () {
		System.out.println();
		System.out.println("****_____**********");
		System.out.println("***/*****\\*********");
		System.out.println("***|******|********");
		System.out.println("***|*****___*******");
		System.out.println("***|****/   \\******");
		System.out.println("***|****\\___/******");
		System.out.println("***|***************");
		System.out.println("***|***************");
		System.out.println("***|***************");
		System.out.println("***|***************");
		System.out.println("***|***************");
		System.out.println("___|___************");
		System.out.println();
	}	
	
	public void two () {
		System.out.println();
		System.out.println("****_____**********");
		System.out.println("***/*****\\*********");
		System.out.println("***|******|********");
		System.out.println("***|*****___*******");
		System.out.println("***|****/   \\******");
		System.out.println("***|****\\___/******");
		System.out.println("***|******|********");
		System.out.println("***|******|********");
		System.out.println("***|******|********");
		System.out.println("***|******|********");
		System.out.println("***|***************");
		System.out.println("___|___************");
		System.out.println();
	}

	public void three() {
		System.out.println();
		System.out.println("****_____**********");
		System.out.println("***/*****\\*********");
		System.out.println("***|******|********");
		System.out.println("***|*****___*******");
		System.out.println("***|****/   \\******");
		System.out.println("***|****\\___/******");
		System.out.println("***|******|********");
		System.out.println("***|****\\*|********");
		System.out.println("***|*****\\|********");
		System.out.println("***|******|********");
		System.out.println("***|***************");
		System.out.println("___|___************");	
		System.out.println();
	}
	public void four() {
		System.out.println();
		System.out.println("****_____**********");
		System.out.println("***/*****\\*********");
		System.out.println("***|******|********");
		System.out.println("***|*****___*******");
		System.out.println("***|****/   \\******");
		System.out.println("***|****\\___/******");
		System.out.println("***|******|********");
		System.out.println("***|****\\*|*/******");
		System.out.println("***|*****\\|/*******");
		System.out.println("***|******|********");
		System.out.println("***|***************");
		System.out.println("___|___************");
		System.out.println();
	}
	
	public void five () {
		System.out.println();
		System.out.println("****_____**********");
		System.out.println("***/*****\\*********");
		System.out.println("***|******|********");
		System.out.println("***|*****___*******");
		System.out.println("***|****/   \\******");
		System.out.println("***|****\\___/******");
		System.out.println("***|******|********");
		System.out.println("***|****\\*|*/******");
		System.out.println("***|*****\\|/*******");
		System.out.println("***|******|********");
		System.out.println("***|*****/*********");
		System.out.println("___|___*/**********");
		System.out.println();
	}
	
	public void six () {
		System.out.println();
		System.out.println("****_____**********");
		System.out.println("***/*****\\*********");
		System.out.println("***|******|********");
		System.out.println("***|*****___*******");
		System.out.println("***|****/   \\******");
		System.out.println("***|****\\___/******");
		System.out.println("***|******|********");
		System.out.println("***|****\\*|*/******");
		System.out.println("***|*****\\|/*******");
		System.out.println("***|******|********");
		System.out.println("***|*****/*\\*******");
		System.out.println("___|___*/***\\******");
		System.out.println();
	}
	
	public void getIllustration(int i) {
		switch (i) {
		case 0:
			this.zero();
			break;
		case 1:
			this.one();
			break;
		case 2:
			this.two();
			break;
		case 3:
			this.three();
			break;
		case 4:
			this.four();
			break;
		case 5:
			this.five();
			break;
		case 6:
			this.six();
			break;
			
		}
	}
	public static void main(String[] args) {
		Illustration y = new Illustration();
		y.zero();
		y.one();
		y.two();
		y.three();
		y.four();
		y.five();
		y.six();
	}
}
