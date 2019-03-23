package team.CPO.Project1.Test;

import team.CPO.Project1.Gui.GUIGraphTest;
import team.CPO.Project1.App.Sensor;

public class ThreadRefreshGraph extends Thread {
    GUIGraphTest guiGraphTest;
    Sensor sensor1;

    public ThreadRefreshGraph(GUIGraphTest guiGraphTest, Sensor sensor1) {
        this.guiGraphTest = guiGraphTest;
        this.sensor1 = sensor1;
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {
            try {
                i++;

                guiGraphTest.mDataset.addValue(sensor1.getTemp(),
                        "First", Integer.valueOf(2018 + i));

                guiGraphTest.mDataset.addValue(sensor1.getHumi(),
                        "Second", Integer.valueOf(2018 + i));
                System.out.println("ok");
                if (i > 13) {
                    guiGraphTest.mDataset.removeValue("First", 2018+i-13);
                    guiGraphTest.mDataset.removeValue("Second", 2018+i-13);
                }
            } catch (Exception ex) {
                System.out.println("addValue failed");
                System.out.println(ex.toString());
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
