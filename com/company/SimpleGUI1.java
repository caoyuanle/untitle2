package com.company;

import java.awt.*;
import java.awt.event.*;

public class SimpleGUI1 {
    public static void main(String[] args) {
        Frame f = new Frame("李红艳");
        f.setSize(800, 400);
        f.setLocation(200, 200);
        f.setVisible(true);
        Button bt=new Button("click");
        TextArea textArea=new TextArea(10,10);
        f.add(textArea,BorderLayout.NORTH);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("npcy");
            }
        });
        f.add(bt);
        f.add(textArea);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
