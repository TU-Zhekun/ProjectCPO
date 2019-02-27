public class ThreadRefresh extends Thread{
    GUIGlobalInfo guiGlobalInfo;
    Sensor sensor1;

    public ThreadRefresh(GUIGlobalInfo guiGlobalInfo,Sensor sensor1) {
        this.guiGlobalInfo = guiGlobalInfo;
        this.sensor1 = sensor1;
    }

    @Override
    public void run() {
        //刷新 GUIGlobalInfo 的 温度 & 湿度 信息
        while (true) {
            guiGlobalInfo.setTextLabelInfoTemp(String.valueOf(sensor1.getTemp()) + "\u00B0C");
            guiGlobalInfo.setTextLabelInfoHumi(String.valueOf(sensor1.getHumi()) + "%");
            System.out.println("thread 1 running");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
