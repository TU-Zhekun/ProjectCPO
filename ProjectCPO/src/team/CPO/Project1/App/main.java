package team.CPO.Project1.App;


import team.CPO.Project1.Gui.*;
import team.CPO.Project1.Gui.GUIGlobalInfo;
import team.CPO.Project1.Gui.GUIWelcome;
import team.CPO.Project1.Test.ThreadRefreshGlobalInfo;
import team.CPO.Project1.Test.ThreadRefreshGraph;
import team.CPO.Project1.Test.ThreadTestSave;

public class main {
    public static void main(String[] args) {

//        Thread threadSet =
//                new ThreadSet();
//        threadSet.start();

        Sensor sensor1 = new Sensor();
        GUIWelcome guiWelcome = new GUIWelcome();
        guiWelcome.showGUI();

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
            guiWelcome.labelIPInfo.setText("No data from sensors. Please check the connection.");
        }




        Thread threadRefreshGlobalInfo =
                new ThreadRefreshGlobalInfo(guiGlobalInfo,sensor1);
        threadRefreshGlobalInfo.start();

//        Thread threadRefreshGraph = new ThreadRefreshGraph(guiGraphTest1, guiGraphTest2, sensor1);
//        Thread threadRefreshGraph = new ThreadRefreshGraph(guiGraphTest1, 0, sensor1);
//
//        threadRefreshGraph.start();

//        GUISetting guiSetting = new GUISetting();
//        guiSetting.showGUI();

        Thread threadTestSave = new ThreadTestSave();
        threadTestSave.start();
    }
}
