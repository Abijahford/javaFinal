package PrototypeManager;

import javax.swing.JOptionPane;

public class SwitchLevel {
	public static int levelCounter = 1; // level counts
	
	public static void newGame(String title, String mode) {
		if (mode.equals("Beginner"))
			newGameProc(title, levelCounter);
		if (mode.equals("Intermediate")) {
			levelCounter = 2;
			newGameProc(title, levelCounter);
		}
		if (mode .equals("Advanced")) {
			levelCounter = 3;
			newGameProc(title, levelCounter);
		}		
	}
	
	public static void newGameProc(String title, int levelCounter) {
		if (title.equals("Programming Fundamentals")) {
			if (levelCounter == 2)
				new progFund(title, "Intermediate");
			else if (levelCounter == 3)
				new progFund(title, "Advanced");
			else
				new progFund(title, "Beginner");
		}
		if(title.equals("Object Oriented Programming")) {
			if (levelCounter == 2)
				new objOrient(title, "Intermediate");
			else if (levelCounter == 3)
				new objOrient(title, "Advanced");
			else
				new objOrient(title, "Beginner");
		}
			
		if(title.equals("Data Structures and Algorithms")) {
			if (levelCounter == 2)
				new dataStruct(title, "Intermediate");
			else if (levelCounter == 3)
				new dataStruct(title, "Advanced");
			else
				new dataStruct(title, "Beginner");
		}
	}
	
	public static boolean confirmSwitchLevel() { // switch level dialog
		int dialogButton = JOptionPane.YES_NO_OPTION;
		int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to go to next level", "Next level", dialogButton);
		if (dialogResult == JOptionPane.YES_OPTION)
			return true;
		return false;
	}
}
