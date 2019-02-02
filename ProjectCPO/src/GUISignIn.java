import javax.swing.*;
import java.awt.*;

/**
 * GUI of page Sign In
 */
public class GUISignIn extends JFrame {
    //set GUI color reference
    Color bgColor = new Color(20,29,39);
    Color white = new Color(255,255,255);
    Color grey =new Color(196,196,196);

    //set GUI Font reference
    Font impactTitle = new Font("Impact",0,26);
    Font impactText = new Font("Impact",0,40);
    Font mg = new Font("Malgun Gothic",1,40);

    //create components
    JLabel label1 = new JLabel("Sign in");
    public GUISignIn() {
        //setup this GUI
        this.setBounds(500,400,600,400);
        this.setLayout(null);
        this.getContentPane().setBackground(bgColor);

        //setup label1
        label1.setBounds(10,5,100,30);
        label1.setForeground(white);
        label1.setFont(impactTitle);
        this.add(label1);

    }

    //show this GUI
    public void showGUI() {
        this.setVisible(true);
    }

    //hide this GUI
    public void hideGUI() {
        this.setVisible(false);
    }

}
