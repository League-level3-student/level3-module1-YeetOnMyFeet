package _06_Intro_To_Hash_Maps;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements MouseListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	int id;
	String name;
	String idRemove;
	int idGone;

	public static void main(String[] args) {

		_02_LogSearch logSearch = new _02_LogSearch();
		logSearch.run();
	}

	public void run() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.setText("Add Entry");
		button2.setText("Search by ID");
		button3.setText("View List");
		button4.setText("Remove Entry");
		button1.addMouseListener(this);
		button2.addMouseListener(this);
		button3.addMouseListener(this);
		button4.addMouseListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (button1 == e.getSource()) {
			System.out.println("Completed");
			String inputid = JOptionPane.showInputDialog("Enter your ID number");
			id = Integer.parseInt(inputid);
			System.out.println(id);
			name = JOptionPane.showInputDialog("Enter your name");
			map.put(id, name);
			System.out.println(map.put(id, name));
		}

		if (button2 == e.getSource()) {
			System.out.println("Second button input");
			String button2ID = JOptionPane.showInputDialog("Enter the ID number");
			int id2 = Integer.parseInt(button2ID);
			if (id == id2) {
				JOptionPane.showMessageDialog(null, "The name we found in our system is: " + name);
				System.out.println(name);
			} else if (id != id2) {
				JOptionPane.showMessageDialog(null, "ERROR! Not found!");
			}
		}
		
		if (button3 == e.getSource()) {
			//System.out.println("Button3 input");
			System.out.println(map.get(id));
			System.out.println(map.get(name));
			JOptionPane.showMessageDialog(null, "ID: " + id + " Name: " + name);
			System.out.println("Names:");
			for(String s : map.values()){
				System.out.println(s);
			}
			System.out.println("Keys:");
			for(Integer i : map.keySet()){
				System.out.println(i);
			}
		}
		if (button4 == e.getSource()) {
			idRemove = JOptionPane.showInputDialog("Enter an ID that you would like to delete");
			idGone = Integer.parseInt(idRemove);
			if (idGone == id) {
				map.clear();
				id = 0;
				JOptionPane.showMessageDialog(null, "Entry Cleared!");
				JOptionPane.showMessageDialog(null, map.get(id));
			}
			else if (idGone != id) {
				JOptionPane.showMessageDialog(null, "Error! ID not found!");
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
