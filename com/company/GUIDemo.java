package com.company;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class GUIDemo {

    public static  void main(String[] args){
        final Frame f=new Frame("GUI");
        final TextField textField=new TextField(30);
        f.add(textField,BorderLayout.NORTH);
        f.setLocation(400,500);
        Button btn=new Button("click");
        f.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String info=textField.getText();
                System.out.println("文本框内容是："+info);
            }
        });
        f.pack();
        f.setVisible(true);

//        使用适配器模式
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }


}
