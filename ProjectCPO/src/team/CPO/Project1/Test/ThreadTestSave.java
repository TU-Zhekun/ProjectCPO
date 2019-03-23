package team.CPO.Project1.Test;

import java.io.File;

public class ThreadTestSave extends Thread {
    static String filename = "./././data/Sensor.data";
    TestSaveTZK testSaveTZK = new TestSaveTZK();

    @Override
    public void run() {
        // 将这个程序运行两遍。
        // 第一遍它会创建一些 infoLine 对象并保存到文件；
        // 第二遍它会从文件中读取对象数据并显示出来。

        while(true) {
            try {
                testSaveTZK.createAndSave();
            } catch (Exception ex) {
                System.out.println("save_err");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        if (!new File(filename).exists()) {
//            try{
//                testSaveTZK.createAndSave();
//            }catch (Exception ex){
//                System.out.println("err");
//            }
//        } else {
////            readAndShow();
//        }

    }
}