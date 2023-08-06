/*
 * Create a Swing that is having a List View to select the city, Text box to
 * enter the name,phone number. Radio button to choose the gender and check box
 * to choose hobbies. Create an alert to display the selections made by the
 * user.
 */

package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class SwingEle implements ActionListener {
    JScrollPane jsp;
    JCheckBox c1, c2, c3, c4;
    String[] cities = {"Mlore", "Blore", "Mysuru", "Madikeri", "Udupi", "Bhatkal", "Puttur", "Sullia"};
    JList<String> jList = new JList<String>(cities);
    JRadioButton r1, r2;
    JTextField tf1, tf2;
    ArrayList<String> hobby = new ArrayList<String>();

    SwingEle() {
        JFrame jf = new JFrame("Big Swing");
        jf.setSize(300, 300);
        jf.setLayout(new FlowLayout());
        JLabel jl1 = new JLabel("Name");
        tf1 = new JTextField(20);
        JLabel jl2 = new JLabel("Number");
        tf2 = new JTextField(20);
        jf.add(jl1);
        jf.add(tf1);
        jf.add(jl2);
        jf.add(tf2);
        jsp = new JScrollPane(jList);
        jsp.setPreferredSize(new Dimension(100, 100));
        jf.add(jsp);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        jf.add(r1);
        jf.add(r2);
        c1 = new JCheckBox("Swimming");
        c2 = new JCheckBox("Music");
        c3 = new JCheckBox("Movies");
        c4 = new JCheckBox("Cricket");
        jf.add(c1);
        jf.add(c2);
        jf.add(c3);
        jf.add(c4);
        JButton sub = new JButton("Submit");
        sub.addActionListener(this);
        jf.add(sub);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String val = e.getActionCommand();
        String city, name, num, gender;
        if (val.equals("Submit")) {
            city = jList.getSelectedValue();
            name = tf1.getText();
            num = tf2.getText();
            if (r1.isSelected())
                gender = r1.getActionCommand();
            else
                gender = r2.getActionCommand();
            if (c1.isSelected())
                hobby.add(c1.getActionCommand());
            if (c2.isSelected())
                hobby.add(c2.getActionCommand());
            if (c3.isSelected())
                hobby.add(c3.getActionCommand());
            if (c4.isSelected())
                hobby.add(c4.getActionCommand());
            String res = "Name: " + name + "\nNumber: " + num + "\nCity:" + city + "\nGender: "
                    + gender + "\nHobbies: \n";
            for (String s : hobby)
                res += s + "\n";
            JOptionPane.showMessageDialog(null, res);
            hobby.clear();
        }
    }
}
    
public class swing_element {
    public static void main(String[] args){
        new SwingEle();
    }
}
