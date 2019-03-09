import team.CPO.Project1.Gui.GUIGraphTest;

public class ThreadRefreshGraph extends Thread {
    GUIGraphTest guiGraphTest;

    public ThreadRefreshGraph(GUIGraphTest guiGraphTest) {
        this.guiGraphTest = guiGraphTest;
    }

    @Override
    public void run() {
        int i =0;
        while (true) {
            i ++;
            guiGraphTest.mDataset.addValue(Integer.valueOf(2+i), "First",Integer.valueOf(2019+i));
            System.out.println("ok");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
