package com.company;
import java.awt.*;

public class GUIDemo2 extends Frame{
    private boolean inApplet=true;
    Panel cards;
    final static String BUTTONPANEL="Panel with BUTTONS";
    final static String TEXTPANEL="Panel with TetField";
    public GUIDemo2(){
        setLayout(new BorderLayout());
        setFont( new Font("Helvetica",Font.PLAIN, 14));

//        创建列表
    Panel cp=new Panel();
    Choice c=new Choice();
    c.addItem(BUTTONPANEL);
    c.addItem(TEXTPANEL);
    cp.add(c);
    add("North",cp);

    }


}
