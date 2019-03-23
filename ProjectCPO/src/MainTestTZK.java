import team.CPO.Project1.Gui.GUIGlobalInfo;
import team.CPO.Project1.Gui.GUIGraphTest;
import team.CPO.Project1.Gui.GUIWelcome;

/**
 * MainTestTZK class
 *
 */
public class MainTestTZK {
    public static void main(String[] args) {
            Sensor sensor1 = new Sensor();
            System.out.println("fucked");
        GUIWelcome guiWelcome = new GUIWelcome();
        guiWelcome.showGUI();
//        GUIGlobalInfo guiGlobalInfo = new GUIGlobalInfo("null_1",
//                "00:00",sensor1.getTemp() + "\u00B0C",
//                sensor1.getHumi() + "%","14 JUL 2089");

        GUIGlobalInfo guiGlobalInfo = new GUIGlobalInfo("null_1",
                "00:00","00.0\u00B0C",
                "00.0%","14 JUL 2089");
        guiGlobalInfo.showGUI();

//        GUISignIn guiSignIn = new GUISignIn();
//        guiSignIn.showGUI();

//        try to get data from sensers.
        try {
            System.out.println(sensor1.getTemp());
            System.out.println("############################");
            System.out.println(sensor1.getHumi());
        }
        catch(Exception e){
            System.out.println("No data from sensors.");
        }


        GUIGraphTest test1 = new GUIGraphTest();

        Thread threadRefreshGlobalInfo =
                new ThreadRefreshGlobalInfo(guiGlobalInfo,sensor1);
        threadRefreshGlobalInfo.start();

        Thread threadRefreshGraph = new ThreadRefreshGraph(test1, sensor1);
        threadRefreshGraph.start();

//        GUISetting guiSetting = new GUISetting();
//        guiSetting.showGUI();


    }
}
