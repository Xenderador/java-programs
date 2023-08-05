/*
 * Create a programm to simulate Traffic Lights. The program lets the user
 * select one of three lights: red, yellow or Green with radio buttons. On
 * selecting radio button, an appropriate message with “stop” or “Ready” or “GO”
 * should appear above the button in selected color. Initially, there is no
 * message Shown.
 */

package Traffic_Lights;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Lights extends JFrame implements ItemListener {
    public JLabel l1, l2;
    public JRadioButton r1, r2, r3;
    public ButtonGroup bg;
    public JPanel p, p1;

    public Lights() {
        setLayout(new GridLayout(2, 1));
        setSize(800, 400);

        p = new JPanel(new FlowLayout());
        p1 = new JPanel(new FlowLayout());

        l1 = new JLabel();
        Font f = new Font("Verdana", Font.BOLD, 80);
        l1.setFont(f);
        add(l1);
        p.add(l1);

        add(p);

        l2 = new JLabel("Select Lights");
        p1.add(l2);

        JRadioButton r1 = new JRadioButton("Red Light");
        r1.setBackground(Color.red);
        p1.add(r1);
        r1.addItemListener(this);

        JRadioButton r2 = new JRadioButton("Yellow Light");
        r2.setBackground(Color.YELLOW);
        p1.add(r2);
        r2.addItemListener(this);

        JRadioButton r3 = new JRadioButton("Green Light");
        r3.setBackground(Color.GREEN);
        p1.add(r3);
        r3.addItemListener(this);

        add(p1);

        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent i) {
        JRadioButton jb = (JRadioButton) i.getSource();
        switch (jb.getText()) {
            case "Red Light": {
                l1.setText("STOP");
                l1.setForeground(Color.RED);
            }
                break;
            case "Yellow Light": {
                l1.setText("Ready");
                l1.setForeground(Color.YELLOW);
            }
                break;
            case "Green Light": {
                l1.setText("GO");
                l1.setForeground(Color.GREEN);
            }
                break;
        }
    }
}

public class traffic_lights {
    public static void main(String[] args){
        new Lights();
    }
}
