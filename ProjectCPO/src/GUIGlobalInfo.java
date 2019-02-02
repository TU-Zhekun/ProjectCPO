import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * GUI of global information
 * time, temperature, humidity
 *
 * JLabel 位置 字体 待修改
 */
public class GUIGlobalInfo extends JFrame {
    //set GUI color reference
    Color bgColor = new Color(20,29,39);
    Color white = new Color(255,255,255);
    Color grey =new Color(196,196,196);

    //set GUI Font reference
    Font impactTitle = new Font("Impact",0,26);
    Font impactText = new Font("Impact",0,40);
    Font mg = new Font("Malgun Gothic",1,40);

    String infoModule, infoTime, infoTemp, infoHumi;

    JLabel labelModule = new JLabel("Information du Capteur SAI60");
    JLabel labelInfoModule = new JLabel(infoModule);
    JLabel labelTime = new JLabel("Time");
    JLabel labelInfoTime = new JLabel(infoTime);
    JLabel labelTemp = new JLabel("Temperature");
    JLabel labelInfoTemp = new JLabel(infoTemp);
    JLabel labelHumi = new JLabel("Humidity");
    JLabel labelInfoHumi = new JLabel(infoHumi);


    //constructor of this GUI (infoModule, infoTime, infoTemperature, infoHumidity)
    public GUIGlobalInfo(String infoModule, String infoTime, String infoTemp, String infoHumi) {
        //set JFrame
        this.setBounds(400, 300, 600, 400);
        this.getContentPane().setBackground(bgColor);
        this.setLayout(null);
        this.setResizable(false);
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);   //关闭退出程序
        //frame.setVisible(true);

        //setup JLabelModule
        //labelModule.setBounds(50, 50, 300, 30);
        //labelModule.setForeground(white);
        //labelModule.setFont(impactTitle);
        //this.add(labelModule);

        //setup JLabelInfoModule
        labelInfoModule.setText(infoModule);
        labelInfoModule.setBounds(50, 50, 300, 30);
        labelInfoModule.setForeground(white);
        labelInfoModule.setFont(impactTitle);
        this.add(labelInfoModule);

        //setup JLabelTime
        labelTime.setBounds(120, 110, 100, 30);
        labelTime.setForeground(white);
        labelTime.setFont(impactTitle);
        this.add(labelTime);

        //setup JLabelInfoTime
        labelInfoTime.setText(infoTime);
        labelInfoTime.setBounds(200, 100, 200, 40);
        labelInfoTime.setForeground(white);
        labelInfoTime.setFont(impactText);
        this.add(labelInfoTime);

        //setup JLabelTemp
        labelTemp.setBounds(100, 150, 200, 40);
        labelTemp.setForeground(white);
        labelTemp.setFont(impactTitle);
        this.add(labelTemp);

        //setup JLabelInfoTemp
        labelInfoTemp.setText(infoTemp);
        labelInfoTemp.setBounds(140, 200, 200, 40);
        labelInfoTemp.setForeground(white);
        labelInfoTemp.setFont(impactText);
        this.add(labelInfoTemp);

        //setup JLabelHumi
        labelHumi.setBounds(300, 150, 200, 40);
        labelHumi.setForeground(white);
        labelHumi.setFont(impactTitle);
        this.add(labelHumi);

        //setup JLabelInfoHumi
        labelInfoHumi.setText(infoHumi);
        labelInfoHumi.setBounds(315, 200, 200, 40);
        labelInfoHumi.setForeground(white);
        labelInfoHumi.setFont(impactText);
        this.add(labelInfoHumi);
    }

    //show this GUI
    public void showGUI() {
        this.setVisible(true);
    }

    //hide this GUI
    public void hideGUI() {
        this.setVisible(false);
    }

    //change the text of labelInfoModule
    public void setTextLabelInfoModule(String text) {
        labelInfoModule.setText(text);
    }

    //change the text of labelInfoTime
    public void setTextLabelInfoTime(String text) {
        labelInfoTime.setText(text);
    }

    //change the text of labelInfoTemp
    public void setTextLabelInfoTemp(String text) {
        labelInfoTemp.setText(text);
    }

    //change the text of labelInfoHumi
    public void setTextLabelInfoHumi(String text) {
        labelInfoHumi.setText(text);
    }

}
