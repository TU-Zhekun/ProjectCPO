package team.CPO.Project1.Gui;

import team.CPO.Project1.App.Sensor;
import team.CPO.Project1.Test.ThreadRefreshGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * GUI Welcome Starting
 */
public class GUIWelcome extends JFrame {
    //set GUI color reference
    Color bgColor = new Color(20, 29, 39);
    Color white = new Color(255, 255, 255);
    Color grey = new Color(196, 196, 196);

    //set GUI Font reference
    Font impactTitle = new Font("Impact", 0, 26);
    Font impactText = new Font("Impact", 0, 40);
    Font mg = new Font("Malgun Gothic", 1, 40);

    //create labelWelcomeText1
    Sensor sensor1 = new Sensor();
    JLabel labelWelcomeText1 = new JLabel("Hello");
    public JLabel labelIPInfo = new JLabel("Please set IP Adresse: " + sensor1.adrIP);
    JButton buttonSetting = new JButton("Setting");

    public GUIWelcome() {

        this.setBounds(300, 200, 385, 425);
        this.getContentPane().setBackground(bgColor);
        this.setResizable(false);
        this.setLayout(null);


        //setup labelWelcomeText1
        labelWelcomeText1.setBounds(8, 3, 200, 30);
        labelWelcomeText1.setForeground(white);
        labelWelcomeText1.setFont(impactTitle);
        this.add(labelWelcomeText1);
//
        labelIPInfo.setBounds(8, 30, 500, 30);
        labelIPInfo.setForeground(white);
        labelIPInfo.setFont(new Font("Impact", 0, 15));
        this.add(labelIPInfo);

        //setup buttonSetting
        buttonSetting.setBounds(10, 250, 200, 40);
        this.add(buttonSetting);
        buttonSetting.addActionListener(l);
    }

    ActionListener l = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // 以下为触发事件内容
            System.out.println("触发了事件xxx");
            GUISignIn guiSignIn = new GUISignIn();
            guiSignIn.setVisible(true);

        }
    };

    //show this GUI
    public void showGUI() {
        this.setVisible(true);
    }

    //hide this GUI
    public void hideGUI() {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        GUIWelcome guiWelcome = new GUIWelcome();
        guiWelcome.showGUI();
    }

}

