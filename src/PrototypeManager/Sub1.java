package PrototypeManager;

import java.util.Scanner;
import PrototypeManager.QuestionPack;

public class Sub1 {
	private QuestionCollections questionPack = new QuestionCollections();
	private String mode;
	private int counter = 0;
	private int rightAnswer = 0;
	private int answer;
	private Scanner input = new Scanner(System.in);
	
	public Sub1() {

	}
	
	public Sub1(String mode) {
		this.mode = mode;
		if (mode == "Beginner")
			initEzPack();
		if (mode == "Intermediate")
			initMedPack();
		if (mode == "Advanced")
			initHardPack();
	}
	
	public void initEzPack() {
		for (int i = 0; i < 5; i++) {
			questionPack.add(new Question(QuestionPack.PFeasyPack[i][0][0], QuestionPack.PFeasyPack[i][1], QuestionPack.PFezRightPack[i]));
		}
	}
	
	public void initMedPack() {
		for (int i = 0; i < 5; i++) {
			questionPack.add(new Question(QuestionPack.PFmedPack[i][0][0], QuestionPack.PFmedPack[i][1], QuestionPack.PFmedRightPack[i]));
		}
	}

	public void initHardPack() {
		for (int i = 0; i < 5; i++) {
			questionPack.add(new Question(QuestionPack.PFhardPack[i][0][0], QuestionPack.PFhardPack[i][1], QuestionPack.PFhardRightPack[i]));
		}
	}
	
	/*
	public void play(String mode) {
		if (mode.equals("Easy"))
			playEasy();
		if (mode.equals("Medium")) {
			playMedium();
		if (mode.equals("Hard"))
			playHard(); 
		}	
	}
	
	public void playEasy() {
		while(counter < 5) {
			Question question = questionPack.getQuestion();
			System.out.print("Which answer you gonna choose for " + question.getQuestion());
			answer = input.nextInt();
			question.printAnswer();
			
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
	*/
	public QuestionCollections getCollections() {
		return questionPack;
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
