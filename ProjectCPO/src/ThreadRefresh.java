public class ThreadRefresh extends Thread{
    @Override
    public void run() {
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

    }
}
