package team.CPO.Project1.Gui;

import javax.swing.*;
import java.awt.*;
/**
 * GUI of global information
 * time, temperature, humidity
 * <p>
 * JLabel 位置 字体 待修改
 */
public class GUIGlobalInfo extends JFrame {
    //set GUI color reference
    Color bgColor = new Color(20, 29, 39);
    Color white = new Color(255, 255, 255);
    Color grey = new Color(196, 196, 196);

    //set GUI Font reference
    Font impactTitle = new Font("Impact", 0, 20);
    Font impactTextTime = new Font("Impact", 0, 80);
    Font impactTextDate = new Font("Malgun Gothic", 0, 20);
    Font impactText = new Font("Impact", 0, 47);
    Font mg = new Font("Malgun Gothic", 1, 40);

    String infoModule, infoTime, infoTemp, infoHumi, infoDate;

    JLabel labelModule = new JLabel("Information du Capteur SAI60");
    JLabel labelInfoModule = new JLabel(infoModule);
    JLabel labelTime = new JLabel("Time");
    JLabel labelInfoTime = new JLabel(infoTime);
    JLabel labelInfoDate = new JLabel(infoDate);
    JLabel labelTemp = new JLabel("Temperature");
    JLabel labelInfoTemp = new JLabel(infoTemp);
    JLabel labelHumi = new JLabel("Humidity");
    JLabel labelInfoHumi = new JLabel(infoHumi);
    JButton buttonGraph1 = new JButton();


    //constructor of this GUI (infoModule, infoTime, infoTemperature, infoHumidity, inforDate)
    public GUIGlobalInfo(String infoModule, String infoTime, String infoTemp, String infoHumi, String infoDate) {
        //set JFrame
        this.setBounds(400, 300, 660, 350);
        this.getContentPane().setBackground(bgColor);
        this.setLayout(null);
        this.setResizable(false);
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);   //关闭退出程序
        //frame.setVisible(true);

        //setup JLabelModule
//        labelModule.setBounds(50, 50, 300, 30);
//        labelModule.setForeground(white);
//        labelModule.setFont(impactTitle);
//        this.add(labelModule);

        //setup JLabelInfoModule
//        labelInfoModule.setText(infoModule);
//        labelInfoModule.setBounds(5, 5, 300, 40);
//        labelInfoModule.setForeground(white);
//        labelInfoModule.setFont(mg);
//        this.add(labelInfoModule);

        //setup JLabelTime
        labelTime.setBounds(170, 40, 80, 40);
        labelTime.setForeground(white);
        labelTime.setFont(impactTitle);
        this.add(labelTime);

        //setup JLabelInfoTime
        labelInfoTime.setText(infoTime);
        labelInfoTime.setBounds(220, 35, 230, 92);
        labelInfoTime.setForeground(white);
        labelInfoTime.setFont(impactTextTime);
        this.add(labelInfoTime);

        //setup JLabelInfoDate
        labelInfoDate.setText(infoDate);
        labelInfoDate.setBounds(255, 105, 190, 50);
        labelInfoDate.setForeground(white);
        labelInfoDate.setFont(impactTextDate);
        this.add(labelInfoDate);

        //setup JLabelTemp
        labelTemp.setBounds(110, 150, 200, 30);
        labelTemp.setForeground(white);
        labelTemp.setFont(impactTitle);
        this.add(labelTemp);

        //setup JLabelInfoTemp
        labelInfoTemp.setText(infoTemp);
        labelInfoTemp.setBounds(117, 180, 200, 50);
        labelInfoTemp.setForeground(white);
        labelInfoTemp.setFont(impactText);
        this.add(labelInfoTemp);

        //setup JLabelHumi
        labelHumi.setBounds(400, 150, 200, 30);
        labelHumi.setForeground(white);
        labelHumi.setFont(impactTitle);
        this.add(labelHumi);

        //setup JLabelInfoHumi
        labelInfoHumi.setText(infoHumi);
        labelInfoHumi.setBounds(400, 180, 200, 50);
        labelInfoHumi.setForeground(white);
        labelInfoHumi.setFont(impactText);
        this.add(labelInfoHumi);

//
        //buttonGraph1.setBackground(Color.green);
        ImageIcon icon = new ImageIcon("src/image/gui.png");
        Image img = icon.getImage() ;
        Image newimg = img.getScaledInstance( 70, 30,  java.awt.Image.SCALE_SMOOTH ) ;
        icon = new ImageIcon( newimg );
        
        buttonGraph1.setBounds(165, 250, icon.getIconWidth(), icon.getIconHeight());
        buttonGraph1.setIcon(icon);
        //不绘制边框
        buttonGraph1.setBorderPainted(false);
        //设置边框为空
        buttonGraph1.setBorder(null);
        //设置手形图标变换
        buttonGraph1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonGraph1.setContentAreaFilled(false);
        this.add(buttonGraph1);
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

    //change the text of labelInfoDate
    public void setTextLabelInfoDate(String text) {
        labelInfoDate.setText(text);
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

    public static void main(String[] args) {
        GUIGlobalInfo guiGlobalInfo = new GUIGlobalInfo("null_1",
                "00:00", "00.0\u00B0C",
                "00.0%", "14 JUL 2089");
        guiGlobalInfo.showGUI();
    }

}
