package team.CPO.Project1.Test;

import team.CPO.Project1.App.Sensor;
import team.CPO.Project1.Gui.*;

/**
 * team.CPO.Project1.Test.MainTestTZK class
 *
 */
public class MainTestTZK {

//    public GUIWelcome guiWelcome;


    public static void main(String[] args) {

//        Thread threadSet =
//                new ThreadSet();
//        threadSet.start();

        Sensor sensor1 = new Sensor();
        GUIWelcome guiWelcome = new GUIWelcome();
        guiWelcome.showGUI();

        GUIGraphTest guiGraphTest1 = new GUIGraphTest("Temperature");
        GUIGraphTest guiGraphTest2 = new GUIGraphTest("Humidity");

        GUIGlobalInfo guiGlobalInfo = new GUIGlobalInfo("null_1",
                "00:00","00.0\u00B0C",
                "00.0%","14 JUL 2089");
        guiGlobalInfo.showGUI();

//        try to get data from sensers.
        try {
            System.out.println(sensor1.getTemp());
            System.out.println("############################");
            System.out.println(sensor1.getHumi());
        }
        catch(Exception e){
            System.out.println("No data from sensors.");
        }




        Thread threadRefreshGlobalInfo =
                new ThreadRefreshGlobalInfo(guiGlobalInfo,sensor1);
        threadRefreshGlobalInfo.start();

        Thread threadRefreshGraph = new ThreadRefreshGraph(guiGraphTest1, guiGraphTest2, sensor1);
        threadRefreshGraph.start();

//        GUISetting guiSetting = new GUISetting();
//        guiSetting.showGUI();

        Thread threadTestSave = new ThreadTestSave();
        threadTestSave.start();
    }

//    public void hideGuiWelcome(){
////        GUIWelcome guiWelcome = new GUIWelcome();
//        ThreadSet.guiWelcome.setVisible(true);
//    }

}


