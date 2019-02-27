import Communication.ConvertisseurOctet;

/**
 * MainTestTZK class
 *
 */
public class MainTestTZK {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor();
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

        System.out.println(sensor1.getTemp());

        System.out.println("############################");
        System.out.println(sensor1.getHumi());

        Thread threadRefresh = new ThreadRefresh(guiGlobalInfo,sensor1);
        threadRefresh.start();


//        GUISetting guiSetting = new GUISetting();
//        guiSetting.showGUI();


    }
}
