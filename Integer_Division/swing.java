/*
 * Create a User Interface to perform Integer Division. The user enters two
 * numbers in text fields, Num1 and Num2. The division of Num1 and Num2 is
 * displayed in the result field when the divide button is clicked. If Num1 or
 * Num2 were not integer, the program would throw a NumberFormatException, If
 * Num2 is Zero, the program would throw an Arithmetic Exception. Display the
 * Exception in message box.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class A extends JFrame implements ActionListener {
	JLabel l1, l2, l3;
	JTextField tf1, tf2, tf3;
	JButton b1;

	A() {
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(500, 200);
		l1 = new JLabel("Enter Number 1");
		add(l1);
		tf1 = new JTextField(10);
		add(tf1);
		l2 = new JLabel("Enter Number 2");
		add(l2);
		tf2 = new JTextField(10);
		add(tf2);
		l3 = new JLabel("Result");
		add(l3);
		tf3 = new JTextField(10);
		add(tf3);
		b1 = new JButton("Divide");
		add(b1);
		b1.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		try {
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			if (b == 0)
				throw new ArithmeticException("Divide by Zero Error");
			float c = (float) a / b;
			tf3.setText(String.valueOf(c));
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		} catch (ArithmeticException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}
}

public class swing {
    public static void main(String[] args){
        new A();
    }
}
