package PrototypeManager;

public class Question {
	private String question;
	private String[] answers = new String[5];
	private int counter = 0;
	private int rightAnswer;
	
	public Question(String question, String[] answers, int rightAnswer) {
		this.question = question;
		this.rightAnswer = rightAnswer;
		this.answers = answers;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void addAnswer(String answer) {
		if(counter == 5) {
			counter = 0;
		}
		answers[counter] = answer;
		counter++;
	}
	
	public boolean checkAnswer(int answer) {
		if (answer-1 == rightAnswer) 
			return true;
		return false;
	}
	
	public static boolean checkProgress(int rightAnswer) {
		if (rightAnswer * 1.0 / 5 >= 0.8)
			return true;
		return false;
	}
}
