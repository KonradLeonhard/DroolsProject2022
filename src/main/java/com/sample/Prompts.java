package com.sample;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Prompts {
	public static String AskQuestion(JFrame frame, String question, String[] answers) {
		int n = JOptionPane.showOptionDialog(frame,
				question,
                "QUESTION",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                answers,
                answers[0]);
		return answers[n];
	}
	
	public static void Done(JFrame frame, String Book, String Author) {
		JOptionPane.showMessageDialog(frame,
                "We have found a book for You!\n" + Book + "\nby " + Author);
		System.exit(0);
	}
}
