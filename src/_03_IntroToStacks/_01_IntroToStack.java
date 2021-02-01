package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> numbers = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 101; i++) {
			numbers.push(i + .0);
			System.out.println(numbers.push(i + .0));
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String user = JOptionPane.showInputDialog("Input one large number between 0 to 100 please");
		String user2 = JOptionPane.showInputDialog("Input one small number between 0 to 100 please");
		int largenum = Integer.parseInt(user);
		int smallnum = Integer.parseInt(user2);
		System.out.println(largenum);
		System.out.println(smallnum);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		while (!numbers.isEmpty()) {
			double value = numbers.pop();
			if (value > smallnum && value < largenum) {
				System.out.println(value);
			}
		}
		
		
		
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
