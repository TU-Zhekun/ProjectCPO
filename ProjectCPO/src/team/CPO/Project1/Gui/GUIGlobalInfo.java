package team.CPO.Project1.Gui;

import team.CPO.Project1.App.Sensor;
import team.CPO.Project1.App.main;
import team.CPO.Project1.Test.ThreadRefreshGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket;

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
    JButton buttonGraph2 = new JButton();

    //constructor of this GUI (infoModule, infoTime, infoTemperature, infoHumidity, inforDate)
    public GUIGlobalInfo(String infoModule, String infoTime, String infoTemp, String infoHumi, String infoDate) {
        //set JFrame
        this.setBounds(400, 300, 660, 350);
        this.getContentPane().setBackground(bgColor);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("Main Window");
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


//        Image img = icon.getImage() ;
//        Image newimg = img.getScaledInstance( 70, 30,  java.awt.Image.SCALE_SMOOTH ) ;
//        icon = new ImageIcon( newimg );


        buttonGraph1.setBounds(165, 250, 120, 30);
        buttonGraph1.setText("Graph\u2192");
        buttonGraph1.setFont(new Font("Malgun Gothic", 2, 20));
        buttonGraph1.setForeground(white);
        //不绘制边框
        buttonGraph1.setBorderPainted(false);
        //不绘制焦点线条
        buttonGraph1.setFocusPainted(false);
        //设置边框为空
        buttonGraph1.setBorder(null);
        //设置手形图标变换
        buttonGraph1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonGraph1.setContentAreaFilled(false);
        this.add(buttonGraph1);
        buttonGraph1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 以下为触发事件内容
                System.out.println("触发了事件BG1");
                GUIGraphTest guiGraphTest1 = new GUIGraphTest("Temperature");
                try {
                    Sensor sensor1 = new Sensor();

                    Thread threadRefreshGraph = new ThreadRefreshGraph(guiGraphTest1, 0, sensor1);

                    threadRefreshGraph.start();
                } catch (Exception ex) {

                }
//            mainTestTZK.hideGuiWelcome();
//          GUIWelcome guiWelcome = new GUIWelcome();
//          guiWelcome.showGUI();
            }
        });
//        buttonGraph1.addActionListener(new ActionListener());


        //buttonGraph2.setBackground(Color.green);

        buttonGraph2.setBounds(455, 250, 120, 30);
        buttonGraph2.setText("Graph\u2192");
        buttonGraph2.setFont(new Font("Malgun Gothic", 2, 20));
        buttonGraph2.setForeground(white);
        //不绘制边框
        buttonGraph2.setBorderPainted(false);
        //设置边框为空
        buttonGraph2.setBorder(null);
        //设置手形图标变换
        buttonGraph2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonGraph2.setContentAreaFilled(false);
        this.add(buttonGraph2);
        buttonGraph2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //            // 以下为触发事件内容
                System.out.println("触发了事件BG2");
            GUIGraphTest guiGraphTest2 = new GUIGraphTest("Humidity");
            try {
                Sensor sensor1 = new Sensor();

                Thread threadRefreshGraph2 = new ThreadRefreshGraph(0, guiGraphTest2, sensor1);

                threadRefreshGraph2.start();
            }catch(Exception ex){

            }
//            mainTestTZK.hideGuiWelcome();
//          GUIWelcome guiWelcome = new GUIWelcome();
//          guiWelcome.showGUI();

            }
        });
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

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        MainTestTZK mainTestTZK = new MainTestTZK();
//        GUIWelcome guiWelcome = new GUIWelcome();
//        guiWelcome.showGUI();
//    }

    //    ActionListener listenerBG1 = new ActionListener() {

//    class listenerBG1 implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            // 以下为触发事件内容
//            System.out.println("触发了事件BG1");
//            GUIGraphTest guiGraphTest1 = new GUIGraphTest("Temperature");
//            try {
//                Sensor sensor1 = new Sensor();
//
//                Thread threadRefreshGraph = new ThreadRefreshGraph(guiGraphTest1, 0, sensor1);
//
//                threadRefreshGraph.start();
//            } catch (Exception ex) {
//
//            }
////            mainTestTZK.hideGuiWelcome();
////          GUIWelcome guiWelcome = new GUIWelcome();
////          guiWelcome.showGUI();
//        }
//    }


//    class listenerBG2 implements /*ActionListener listenerBG2 = new */ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e2) {
//            // 以下为触发事件内容
//            System.out.println("触发了事件BG2");
////            GUIGraphTest guiGraphTest2 = new GUIGraphTest("Humidity");
////            try {
////                Sensor sensor1 = new Sensor();
////
////                Thread threadRefreshGraph = new ThreadRefreshGraph(0, guiGraphTest2, sensor1);
////
////                threadRefreshGraph.start();
////            }catch(Exception ex){
////
////            }
////            mainTestTZK.hideGuiWelcome();
////          GUIWelcome guiWelcome = new GUIWelcome();
////          guiWelcome.showGUI();
//
//        }
//    }

    ;

//    public static void main(String[] args) {
//        GUIGlobalInfo guiGlobalInfo = new GUIGlobalInfo("null_1",
//                "00:00", "00.0\u00B0C",
//                "00.0%", "14 JUL 2089");
//        guiGlobalInfo.showGUI();
//    }

}
