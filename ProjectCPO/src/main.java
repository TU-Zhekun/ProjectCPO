import Communication.ClientTcp;

public class main {
    public static void main(String[] args) {
        /*
        GUIWelcome guiWelcome = new GUIWelcome();
        guiWelcome.showGUI();
        GUIGlobalInfo guiGlobalInfo = new GUIGlobalInfo("null_1","00:00","00\u00B0C", "00%");
        guiGlobalInfo.setTextLabelInfoModule("nullMod");
        guiGlobalInfo.showGUI();
        */
        //GUISignIn guiSignIn = new GUISignIn();
        //guiSignIn.showGUI();

//        ClientHttp http = new ClientHttp();
//        http.se_connecter("169.254.211.21");
//
//        GUISetting guiSetting = new GUISetting();
//        guiSetting.showGUI();
//        ClientTcp client = new ClientTcp();
//        if (client.se_connecter("169.254.211.21", 502)) {
//            System.out.println("ok");
//            byte[] tab = {0, 1, 0, 0, 0, 6, 8, 3, 0, 100, 0, 2};//
//            client.envoyer_octets(tab);
//            client.recevoir_octets();
//            byte[] tab2 = client.getTrame_reponse();
//            for (int i = 0; i < tab2.length; i++)
//                System.out.println(tab2[i]);
//            client.se_deconnecter();
//        } else System.out.println("pas ok");
        Sensor sensor1 = new Sensor();
        System.out.println(sensor1.getTemp());
        System.out.println("############################");
        System.out.println(sensor1.getHumi());
    }
}
