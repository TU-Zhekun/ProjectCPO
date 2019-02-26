import Communication.ConvertisseurOctet;

/**
 * TestTZK class
 *
 */
public class TestTZK {
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
//        guiGlobalInfo.setTextLabelInfoModule("nullMod");
        guiGlobalInfo.showGUI();

//        GUISignIn guiSignIn = new GUISignIn();
//        guiSignIn.showGUI();

        System.out.println(sensor1.getTemp());

        System.out.println("############################");
        System.out.println(sensor1.getHumi());

        Thread threadRefresh = new ThreadRefresh();


        //刷新 GUIGlobalInfo 的 温度 & 湿度 信息
        while (true) {
            guiGlobalInfo.setTextLabelInfoTemp(String.valueOf(sensor1.getTemp()) + "\u00B0C");
            guiGlobalInfo.setTextLabelInfoHumi(String.valueOf(sensor1.getHumi()) + "%");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        GUISetting guiSetting = new GUISetting();
//        guiSetting.showGUI();


    }
}
