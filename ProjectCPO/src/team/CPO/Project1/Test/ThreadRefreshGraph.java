package team.CPO.Project1.Test;

import team.CPO.Project1.Gui.GUIGraphTest;
import team.CPO.Project1.App.Sensor;

public class ThreadRefreshGraph extends Thread {
    GUIGraphTest guiGraphTest1;
    GUIGraphTest guiGraphTest2;
    Sensor sensor1;

    public ThreadRefreshGraph(GUIGraphTest guiGraphTest1, GUIGraphTest guiGraphTest2, Sensor sensor1) {
        this.guiGraphTest1 = guiGraphTest1;
        this.guiGraphTest2 = guiGraphTest2;
        this.sensor1 = sensor1;
    }

    public ThreadRefreshGraph(GUIGraphTest guiGraphTest1, int a, Sensor sensor1) {
        this.guiGraphTest1 = guiGraphTest1;
//        this.guiGraphTest2 = guiGraphTest2;
//        guiGraphTest2.
        this.sensor1 = sensor1;
    }

    public ThreadRefreshGraph(int a, GUIGraphTest guiGraphTest2, Sensor sensor1) {
//        this.guiGraphTest1 = guiGraphTest1;
        this.guiGraphTest2 = guiGraphTest2;
        this.sensor1 = sensor1;
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {

            try {
                i++;
                refreshTemp(i);
            } catch (Exception ex) {
                System.out.println("Temp addValue failed");
                System.out.println(ex.toString());
            }

            try{
                refreshHumi(i);
            }catch (Exception e){
                System.out.println("Humi addValue failed");
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    private void refreshTemp(int i) {
        guiGraphTest1.mDataset.addValue(sensor1.getTemp(),
                "First", Integer.valueOf(2018 + i));
        System.out.println("ok--------");
        if (i > 13) {
            guiGraphTest1.mDataset.removeValue("First", 2018 + i - 13);
        }
    }

    private void refreshHumi(int i) {
        guiGraphTest2.mDataset.addValue(sensor1.getHumi(),
                "Second", Integer.valueOf(2018 + i));
        System.out.println("ok+++++++++");
        if (i > 13) {
//                    guiGraphTest1.mDataset.removeValue("First", 2018 + i - 13);
            guiGraphTest2.mDataset.removeValue("Second", 2018 + i - 13);
        }
    }
}


