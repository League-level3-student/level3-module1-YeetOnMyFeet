package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<String> words = new Stack<String>();
	Random ran = new Random();
	String wordlength = "";
	String pop = words.pop();
	public static void main(String[] args) {
		HangMan hangman = new HangMan();
		hangman.run();
		
	}
	
	public void run() {
		String number = JOptionPane.showInputDialog("Choose a number from 0 to 266");
		frame.add(panel);
		panel.add(label);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.pack();
		int num = Integer.parseInt(number);
		System.out.println(number);
		for (int i = 0; i < num; i++) {
			words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
			System.out.println(words.size());
		}
		System.out.println(pop);
		for (int i = 0; i < pop.length(); i++) {
			wordlength += "_ ";
		}
		label.setText(wordlength);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar() == pop) {
			label.setText(pop);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
