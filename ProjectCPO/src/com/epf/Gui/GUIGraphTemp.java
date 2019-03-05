package com.epf.Gui; /**
 *
 */

import javax.swing.*;
import java.awt.*;

public class GUIGraphTemp extends JFrame {
    //set GUI color reference
    Color bgColor = new Color(20,29,39);
    Color white = new Color(255,255,255);
    Color grey =new Color(196,196,196);

    //set GUI Font reference
    Font impactTitle = new Font("Impact",0,20);
    JLabel labelTitle = new JLabel("Temperature");

    public GUIGraphTemp() {
        //set JFrame
        this.setBounds(400, 300, 400, 400);
        this.getContentPane().setBackground(bgColor);
        this.setLayout(null);
        this.setResizable(false);
//set title
        labelTitle.setBounds(25, 20, 120, 40);
        labelTitle.setForeground(white);
        labelTitle.setFont(impactTitle);
        this.add(labelTitle);

    }

    public void showGUI(){
        this.setVisible(true);
    }
    public static void main(String[] args) {
        GUIGraphTemp test1 = new GUIGraphTemp();
        test1.showGUI();
    }
}
