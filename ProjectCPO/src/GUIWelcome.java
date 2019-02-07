import javax.swing.*;
import java.awt.*;

/**
 * GUI Welcome Starting
 */
public class GUIWelcome extends JFrame{
    //set GUI color reference
    Color bgColor = new Color(20,29,39);
    Color white = new Color(255,255,255);
    Color grey =new Color(196,196,196);

    //set GUI Font reference
    Font impactTitle = new Font("Impact",0,26);
    Font impactText = new Font("Impact",0,40);
    Font mg = new Font("Malgun Gothic",1,40);

    //create labelWelcomeText1
    JLabel labelWelcomeText1 = new JLabel("Hello");
    JButton buttonSetting = new JButton("Setting");

    public GUIWelcome() {

        this.setBounds(300, 200, 385, 425);
        this.getContentPane().setBackground(bgColor);
        this.setResizable(false);
        this.setLayout(null);


        //setup labelWelcomeText1
        labelWelcomeText1.setBounds(8, 3,200,30);
        labelWelcomeText1.setForeground(white);
        labelWelcomeText1.setFont(impactTitle);
        this.add(labelWelcomeText1);

        //setup buttonSetting
        buttonSetting.setBounds(10,250,200,40);
        this.add(buttonSetting);
    }

    //show this GUI
    public void showGUI () {
        this.setVisible(true);
    }

    //hide this GUI
    public void hideGUI() {
        this.setVisible(false);
    }

}

