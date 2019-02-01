public class main {
    public static void main(String[] args) {
        GUIWelcome guiWelcome = new GUIWelcome();
        guiWelcome.showGUI();
        GUIGlobalInfo guiGlobalInfo = new GUIGlobalInfo("null_1","00:00","00\u00B0C", "00%");
        guiGlobalInfo.setTextLabelInfoModule("nullMod");
        guiGlobalInfo.showGUI();
    }
}
