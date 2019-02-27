import java.util.*;
import java.text.*;

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

            //根据系统时间自动刷新时间
            Date dNow = new Date( );
            SimpleDateFormat ft1 = new SimpleDateFormat ("HH:mm");
            guiGlobalInfo.setTextLabelInfoTime(ft1.format(dNow));

            SimpleDateFormat ftDay = new SimpleDateFormat ("dd");
            String strMonth=String.format(Locale.US,"%tb",dNow);
            SimpleDateFormat ftYear = new SimpleDateFormat ("yyyy");
            guiGlobalInfo.setTextLabelInfoDate(ftDay.format(dNow)+" "+strMonth+" "+ftYear.format(dNow));

            System.out.println("threadRefresh running");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
