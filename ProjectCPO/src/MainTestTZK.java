import com.epf.Gui.GUIGlobalInfo;
import com.epf.Gui.GUIWelcome;

/**
 * MainTestTZK class
 *
 */
public class MainTestTZK {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor();
        GUIWelcome guiWelcome = new GUIWelcome();
        guiWelcome.showGUI();
//        com.epf.Gui.GUIGlobalInfo guiGlobalInfo = new com.epf.Gui.GUIGlobalInfo("null_1",
//                "00:00",sensor1.getTemp() + "\u00B0C",
//                sensor1.getHumi() + "%","14 JUL 2089");

        GUIGlobalInfo guiGlobalInfo = new GUIGlobalInfo("null_1",
                "00:00","00.0\u00B0C",
                "00.0%","14 JUL 2089");
        guiGlobalInfo.showGUI();

//        com.epf.Gui.GUISignIn guiSignIn = new com.epf.Gui.GUISignIn();
//        guiSignIn.showGUI();

        System.out.println(sensor1.getTemp());

        System.out.println("############################");
        System.out.println(sensor1.getHumi());

        Thread threadRefresh = new ThreadRefresh(guiGlobalInfo,sensor1);
        threadRefresh.start();


//        com.epf.Gui.GUISetting guiSetting = new com.epf.Gui.GUISetting();
//        guiSetting.showGUI();


    }
}
