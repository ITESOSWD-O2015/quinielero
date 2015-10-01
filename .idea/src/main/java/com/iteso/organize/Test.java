package com.iteso.organize;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aldo on 30/09/2015.
 */
public class Test {

    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JLabel lab1;

    public Test(){
        gui();
    }

    public void gui(){

        f = new JFrame("Quinielero");
        f.setVisible(true);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        p.setBackground(Color.gray);

        b1 = new JButton("Test");
        lab1 = new JLabel("Label Test");

        p.add(b1);
        p.add(lab1);
        f.add(p);

    }

    public static void main (String []a)
    {
        new Test();
    }
}


