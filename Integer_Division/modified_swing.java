package Integer_Division;

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
        this.add(new JLabel("Enter Number 1"));
        this.add(new JTextField(10));
        this.add(new JLabel("Enter Number 2"));
        this.add(new JTextField(10));
        this.add(new JLabel("Result"));
        this.add(new JTextField(10));
        this.add(new JButton("Divide"));
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

public class modified_swing {
    public static void main(String[] args){
        new A();
    }
}
