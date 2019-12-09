package PrototypeManager;

import java.util.Scanner;

public class Sub2 {
	private QuestionCollections questionPack = new QuestionCollections();
	private String mode;
	private int counter = 0;
	private int rightAnswer = 0;
	private int answer;
	private Scanner input = new Scanner(System.in);
	
	public Sub2() {

	}
	
	public Sub2(String mode) {
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
			questionPack.add(new Question(QuestionPack.ObjOeasyPack[i][0][0], QuestionPack.ObjOeasyPack[i][1], QuestionPack.ObjOezRightPack[i]));
		}
	}
	
	public void initMedPack() {
		for (int i = 0; i < 5; i++) {
			questionPack.add(new Question(QuestionPack.ObjOmedPack[i][0][0], QuestionPack.ObjOmedPack[i][1], QuestionPack.ObjOmedRightPack[i]));
		}
	}

	public void initHardPack() {
		for (int i = 0; i < 5; i++) {
			questionPack.add(new Question(QuestionPack.ObjOhardPack[i][0][0], QuestionPack.ObjOhardPack[i][1], QuestionPack.ObjOhardRightPack[i]));
		}
	}
	
	public QuestionCollections getCollections() {
		return questionPack;
	}
}
