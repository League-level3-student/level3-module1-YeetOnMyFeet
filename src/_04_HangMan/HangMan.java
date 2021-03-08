package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<String> words = new Stack<String>();
	Random ran = new Random();
	String wordlength = "";
	String pop = "";
	String wordletters = "";
	int lives = 5;

	public static void main(String[] args) {
		HangMan hangman = new HangMan();
		hangman.run();

	}

	public void run() {
		String number = JOptionPane.showInputDialog("Choose a number from 0 to 266");
		frame.add(panel);
		panel.add(label);
		frame.setSize(500, 500);
		frame.setVisible(true);
		int num = Integer.parseInt(number);
		System.out.println(number);
		for (int i = 0; i < num; i++) {
			words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
			System.out.println(words.size());
		}
		pop = words.pop();
		System.out.println(pop);
		for (int i = 0; i < pop.length(); i++) {
			wordlength += "_";

		}
		label.setText(wordlength);
		frame.addKeyListener(this);
		frame.pack();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// if e.getkeychar equals indexes of pop
		// change the index of wordlength to be that value

		for (int i = 0; i < pop.length(); i++) {

			if (e.getKeyChar() == pop.charAt(i)) {
				System.out.println("Correct");
				wordletters = label.getText();
				wordletters = (wordletters.substring(0, i) + e.getKeyChar() + wordletters.substring(i + 1));
				System.out.println(wordletters);
				label.setText(wordletters);
			}
			if (e.getKeyChar() != pop.charAt(i)) {
				lives--;
				System.out.println("You have " + lives + "lives");
				if (lives == 0) {
					System.exit(0);
					System.out.println("You lost!");
				}

			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
