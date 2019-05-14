package team.CPO.Project1.Test;

import team.CPO.Project1.App.Sensor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestSaveTZK {

    //    Sensor sensor = new Sensor();
    Sensor sensor = new Sensor();
//    FakeSensor sensor = new FakeSensor();

    // 文件名可随意指定，你可以用文本编辑器打开这个文件（注意，记事本无法处理换行）
    static String filename = "./././data/Sensor.data";

//    public static void main(String[] args) throws Exception {
//        // 将这个程序运行两遍。
//        // 第一遍它会创建一些 infoLine 对象并保存到文件；
//        // 第二遍它会从文件中读取对象数据并显示出来。
//        if (!new File(filename).exists()) {
//            createAndSave();
//        } else {
////            readAndShow();
//        }
//    }

    // 生成并保存 infoLine 对象
    public void createAndSave() throws IOException {
        List<infoLine> infoList = createinfoList();
        saveinfoList(infoList);
    }

    // 创建要保存的 infoLine 对象
    private List<infoLine> createinfoList() {
        List<infoLine> infoList1 = new ArrayList<infoLine>();
        infoList1.add(new infoLine("1", "null", "null"));
        return infoList1;
    }

    // 保存 infoLine 对象到文件。保存格式为：
    // 1、每个 infoLine 一行
    // 2、每行依次存放 name、birthday、male 三个属性值，用 tab 隔开
    // 3、birthday 属性保存的是毫秒数，male 属性保存的是字符串
    private void saveinfoList(List<infoLine> infoList) throws IOException {

        // 生成文件内容
        String data = "";
//        for (infoLine infoLine : infoList) {
            data += getinfoListString() + "\n";
//        }

        // 保存文件内容
        FileWriter writer = new FileWriter(filename, true);
        writer.write(data);
        writer.flush();
        writer.close();
        System.out.println("对象保存完毕。");
    }

    private String getinfoListString() {
        return getDate() + "\t" + String.valueOf(sensor.getTemp())
                + "\t" + Double.toString(sensor.getHumi());
    }

    //getData return String 返回时间信息，用于信息存储
    public String getDate() {
        Date date = new Date();
        return date.toString();
    }

}

// 要持久化的类
class infoLine {

    private String time;
    private String temp;
    private String humi;

    public infoLine(String time, String temp, String humi) {
        this.time = time;
        this.temp = temp;
        this.humi = humi;
    }


}


