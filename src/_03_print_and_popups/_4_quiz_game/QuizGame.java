package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		 int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		 String first = JOptionPane.showInputDialog("What is 2+4?");
				// 3.  Use an if statement to check if their answer is correct
		 if(first.equalsIgnoreCase("6")){score=+1;} 
		 else score=-1;
				// 4.  if the user's answer was correct, add one to their score 
		 String second = JOptionPane.showInputDialog("What is 6+15?");
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		 if(second.equalsIgnoreCase("21")){score=+1;} 
		 else score=-1;
		
		 String third = JOptionPane.showInputDialog(score);
		// After all the questions have been asked, tell the user their final score 
		
	}
}
