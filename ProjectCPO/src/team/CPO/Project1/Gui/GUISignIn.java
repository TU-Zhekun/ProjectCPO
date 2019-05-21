package team.CPO.Project1.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * GUI of page Sign In
 */
public class GUISignIn extends JFrame {
    //set GUI color reference
    Color bgColor = new Color(20, 29, 39);
    Color white = new Color(255, 255, 255);
    Color grey = new Color(196, 196, 196);

    //set GUI Font reference
    Font impactTitle = new Font("Impact", 1, 32);
    Font impactTitle2 = new Font("Impact", 0, 20);
    Font impactText = new Font("Impact", 0, 40);
    Font mg = new Font("Malgun Gothic", 1, 40);

    //create components
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JTextField textField1;
    JTextField textField2;
    JButton button;

    public GUISignIn() {
        //setup this GUI
        this.setBounds(500, 400, 385, 425);
        this.setLayout(null);
        this.getContentPane().setBackground(bgColor);
        this.setResizable(false);

        //setup label1
        label1 = new JLabel("Sign in");
        label1.setBounds(15, 10, 100, 35);
        label1.setForeground(white);
        label1.setFont(impactTitle);
        this.add(label1);

        //setup label2
        label2 = new JLabel("Welcome");
        label2.setBounds(130, 80, 200, 35);
        label2.setForeground(white);
        label2.setFont(impactTitle);
        this.add(label2);

        //setup label3
        label3 = new JLabel("Username");
        label3.setBounds(25, 150, 90, 30);
        label3.setForeground(white);
        label3.setFont(impactTitle2);
        this.add(label3);

        //setup label4
        label4 = new JLabel("Password");
        label4.setBounds(25, 225, 90, 30);
        label4.setForeground(white);
        label4.setFont(impactTitle2);
        this.add(label4);

        //setup textField1
        textField1 = new JTextField(" Username");
        textField1.setBounds(125, 150, 210, 30);
        textField1.setForeground(white);
        textField1.setBackground(grey);
        textField1.setBorder(null);
        //textField1.setFont(mg);
        this.add(textField1);

        //setup textField2
        textField2 = new JTextField(" Password");
        textField2.setBounds(125, 225, 210, 30);
        textField2.setForeground(white);
        textField2.setBackground(grey);
        textField2.setBorder(null);
        //textField2.setFont(mg);
        this.add(textField2);

        //setup button
        button = new JButton("Login");
        button.setBounds(90, 300, 200, 40);
        button.setBackground(bgColor);
        button.setForeground(white);
        this.add(button);
        button.addActionListener(l);

    }

    //show this GUI
    public void showGUI() {
        this.setVisible(true);
    }

    //hide this GUI
    public void hideGUI() {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        GUISignIn guiSignIn = new GUISignIn();
        guiSignIn.setVisible(true);
    }

    ActionListener l = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // 以下为触发事件内容
            System.out.println("触发了事件xxx");
            if (textField1.getText().equals("ZTU") && textField2.getText().equals("88880000")) {
                System.out.println("okokokok");
                setVisible(false);
                GUISetting guiSetting = new GUISetting();
                guiSetting.setVisible(true);
            } else {
                setVisible(false);
                GUISignIn guiSignIn = new GUISignIn();
                guiSignIn.setVisible(true);

            }
        }
    };
}
