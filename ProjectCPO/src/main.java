import com.epf.Gui.GUIGlobalInfo;
import com.epf.Gui.GUIWelcome;

public class main {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor();
        GUIWelcome guiWelcome = new GUIWelcome();
        guiWelcome.showGUI();
        GUIGlobalInfo guiGlobalInfo = new GUIGlobalInfo("null_1",
                "00:00",sensor1.getTemp() + "\u00B0C",
                sensor1.getHumi() + "%","14 JUL 2089");
//        guiGlobalInfo.setTextLabelInfoModule("nullMod");
        guiGlobalInfo.showGUI();
//        com.epf.Gui.GUISignIn guiSignIn = new com.epf.Gui.GUISignIn();
//        guiSignIn.showGUI();


        System.out.println(sensor1.getTemp());
        System.out.println("############################");
        System.out.println(sensor1.getHumi());


//        com.epf.Gui.GUISetting guiSetting = new com.epf.Gui.GUISetting();
//        guiSetting.showGUI();


    }
}
