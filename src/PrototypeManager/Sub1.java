package PrototypeManager;

import java.util.Scanner;
import PrototypeManager.QuestionPack;

public class Sub1 {
	private QuestionCollections easyPack = new QuestionCollections();
	private QuestionCollections mediumPack = new QuestionCollections();
	private QuestionCollections hardPack = new QuestionCollections();
	private int counter = 0;
	private int rightAnswer = 0;
	private int answer;
	private Scanner input = new Scanner(System.in);
	
	public Sub1() {
		initEzPack();
		initMedPack();
		initHardPack();
	}
	
	public void initEzPack() {
		for (int i = 0; i < 5; i++) {
			easyPack.add(new Question(QuestionPack.PFeasyPack1[i][0][0], QuestionPack.PFeasyPack1[i][0], QuestionPack.PFezRightPack1[i]));
		}
	}
	
	public void initMedPack() {
		for (int i = 0; i < 5; i++) {
			mediumPack.add(new Question(QuestionPack.mediumPack1[i][0][0], QuestionPack.mediumPack1[i][0], QuestionPack.medRightPack1[i]));
		}
	}

	public void initHardPack() {
		for (int i = 0; i < 5; i++) {
			hardPack.add(new Question(QuestionPack.hardPack1[i][0][0], QuestionPack.hardPack1[i][0], QuestionPack.hardRightPack1[i]));
		}
	}
	
	public void play(String mode) {
		if (mode.equals("Easy"))
			playEasy();
		/*if (mode.equals("Medium")) {
			playMedium();
		if (mode.equals("Hard"))
			playHard(); 
		}	*/
	}
	
	public void playEasy() {
		while(counter < 5) {
			Question question = easyPack.getQuestion();
			System.out.print("Which answer you gonna choose for " + question.getQuestion());
			answer = input.nextInt();
			
			if (question.checkAnswer(answer)) {
				rightAnswer += 1;
				counter += 1;
			}
			else {
				counter += 1;
			}
		}
		printResult(rightAnswer);
		counter = 0;
		rightAnswer = 0;
	}
	
	public void printResult(int rightAnswer) {
		if (Question.checkProgress(rightAnswer)) {
			System.out.print("YOU PASSED!");
		}
		else {
			System.out.print("YOU NEED TO PRACTICE MORE");
		}
	}
}
