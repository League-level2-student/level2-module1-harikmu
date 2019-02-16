package intro_to_array_lists;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class GuestBook implements ActionListener{
	public static void main(String[] args) throws Exception {
		GuestBook guestbook = new GuestBook();
		guestbook.makeButtons();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
		JFrame f = new JFrame();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JPanel p = new JPanel();
		private void makeButtons() {
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(125, 90);
		f.add(p);
		p.add(b1);
		p.add(b2);
		b1.setText("add name");
		b2.setText("view names");
		b1.addActionListener(this);
		b2.addActionListener(this);
		}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList<String> names = new ArrayList<String>();
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
		   String n = JOptionPane.showInputDialog("enter a name. do this four times");
		   names.add(n);
		}
		if(e.getSource()==b2) {
				JOptionPane.showMessageDialog(null, "guest #1: " + names.get(0) + ", guest #2: " + names.get(1) + ", guest #3: " + names.get(2) + ", guest #4: " + names.get(3));
			}
		}
		
		
	}

