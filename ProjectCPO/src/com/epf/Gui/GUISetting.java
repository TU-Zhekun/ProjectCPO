package com.epf.Gui;

import javax.swing.*;
import java.awt.*;

/**
 * GUI Setting
 */
public class GUISetting extends JFrame{
    //set GUI color reference
    Color bgColor = new Color(20,29,39);
    Color white = new Color(255,255,255);
    Color grey =new Color(196,196,196);

    //set GUI Font reference
    Font impactTitle = new Font("Impact",0,26);
    Font impactTitle2 = new Font("Impact",0,20);
    Font impactText = new Font("Impact",0,40);
    Font mg = new Font("Malgun Gothic",1,40);

    //Create components
    JLabel labelmain;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel labelAlarm;
    JLabel labelTemp;
    JLabel labelHumi;

    JTextField textFieldStart;
    JTextField textFieldEnd;
    JTextField textFieldStep;
    JTextField textFieldTemp;
    JTextField textFieldHumi;

    public GUISetting() {
        //setup this GUI
        this.setBounds(500,400,385,425);
        this.setLayout(null);
        this.getContentPane().setBackground(bgColor);
        this.setResizable(false);

        //setup labelmain
        labelmain = new JLabel("Setting");
        labelmain.setBounds(20,25,100,30);
        labelmain.setForeground(white);
        labelmain.setFont(impactTitle);
        this.add(labelmain);

        //setup label1
        label1 = new JLabel("Start Time");
        label1.setBounds(5,75,110,30);
        label1.setForeground(white);
        label1.setFont(impactTitle2);
        label1.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(label1);

        //setup label2
        label2 = new JLabel("End Time");
        label2.setBounds(5,125,110,30);
        label2.setForeground(white);
        label2.setFont(impactTitle2);
        label2.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(label2);

        //setup label3
        label3 = new JLabel("Step");
        label3.setBounds(5,175,110,30);
        label3.setForeground(white);
        label3.setFont(impactTitle2);
        label3.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(label3);

        //setup textFieldStart
        textFieldStart = new JTextField(" Start Time");
        textFieldStart.setBounds(200,75,200,30);
        textFieldStart.setForeground(white);
        textFieldStart.setBackground(grey);
        textFieldStart.setBorder(null);
        //textField1.setFont(mg);
        this.add(textFieldStart);

        //setup textFieldEnd
        textFieldEnd = new JTextField(" End Time");
        textFieldEnd.setBounds(200,125,200,30);
        textFieldEnd.setForeground(white);
        textFieldEnd.setBackground(grey);
        textFieldEnd.setBorder(null);
        //textField1.setFont(mg);
        this.add(textFieldEnd);

        //setup textFieldStep
        textFieldStep = new JTextField(" Step");
        textFieldStep.setBounds(200,175,200,30);
        textFieldStep.setForeground(white);
        textFieldStep.setBackground(grey);
        textFieldStep.setBorder(null);
        //textField1.setFont(mg);
        this.add(textFieldStep);

        //setup labelAlarm
        labelAlarm = new JLabel("Alarm");
        labelAlarm.setBounds(20,210,100,30);
        labelAlarm.setForeground(white);
        labelAlarm.setFont(impactTitle);
        this.add(labelAlarm);

        //setup labelTemp
        labelTemp = new JLabel("Temperature");
        labelTemp.setBounds(5,260,110,30);
        labelTemp.setForeground(white);
        labelTemp.setFont(impactTitle2);
        labelTemp.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(labelTemp);

        //setup labelHumi
        labelHumi = new JLabel("Humidity");
        labelHumi.setBounds(5,310,110,30);
        labelHumi.setForeground(white);
        labelHumi.setFont(impactTitle2);
        labelHumi.setHorizontalAlignment(SwingConstants.RIGHT);
        this.add(labelHumi);

        //setup textFieldTemp
        textFieldTemp = new JTextField(" Temperature");
        textFieldTemp.setBounds(200,345,200,30);
        textFieldTemp.setForeground(white);
        textFieldTemp.setBackground(grey);
        textFieldTemp.setBorder(null);
        //textField1.setFont(mg);
        this.add(textFieldTemp);

        //setup textFieldHumi
        textFieldHumi = new JTextField(" Humidity");
        textFieldHumi.setBounds(200,345,200,30);
        textFieldHumi.setForeground(white);
        textFieldHumi.setBackground(grey);
        textFieldHumi.setBorder(null);
        //textField1.setFont(mg);
        this.add(textFieldHumi);
    }

    //show this GUI
    public void showGUI() {
        this.setVisible(true);
    }

    //hide this GUI
    public void hideGUI() {
        this.setVisible(false);
    }

    //Getter
    public String getTextFieldStart() {
        return textFieldStart.getText();
    }

    public String getTextFieldEnd() {
        return this.textFieldEnd.getText();
    }

    public String getTextFieldStep() {
        return textFieldStep.getText();
    }

    public String getTextFieldTemp() {
        return textFieldTemp.getText();
    }

    public String getTextFieldHumi() {
        return textFieldHumi.getText();
    }
}
