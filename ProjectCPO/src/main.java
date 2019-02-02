/**
 * sssss
 *
 *
 */
public class main {
    public static void main(String[] args) {
        GUIWelcome guiWelcome = new GUIWelcome();
        guiWelcome.showGUI();
        GUIGlobalInfo guiGlobalInfo =
                new GUIGlobalInfo("Mod_null","00:00","00\u00B0C", "000%");
        guiGlobalInfo.showGUI();
        GUISignIn guiSignIn = new GUISignIn();
        guiSignIn.showGUI();
    }
}
