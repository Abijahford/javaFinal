package PrototypeManager;

import java.util.Scanner;

public class Sub3 {
	private QuestionCollections questionPack = new QuestionCollections();
	private String mode;
	private int counter = 0;
	private int rightAnswer = 0;
	private int answer;
	private Scanner input = new Scanner(System.in);
	
	public Sub3() {

	}
	
	public Sub3(String mode) {
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
			questionPack.add(new Question(QuestionPack.DataStructeasyPack[i][0][0], QuestionPack.DataStructeasyPack[i][1], QuestionPack.DataStructezRightPack[i]));
		}
	}
	
	public void initMedPack() {
		for (int i = 0; i < 5; i++) {
			questionPack.add(new Question(QuestionPack.DataStructmedPack[i][0][0], QuestionPack.DataStructmedPack[i][1], QuestionPack.DataStructmedRightPack[i]));
		}
	}

	public void initHardPack() {
		for (int i = 0; i < 5; i++) {
			questionPack.add(new Question(QuestionPack.DataStructhardPack[i][0][0], QuestionPack.DataStructhardPack[i][1], QuestionPack.DataStructhardRightPack[i]));
		}
	}
	
	public QuestionCollections getCollections() {
		return questionPack;
	}
}
