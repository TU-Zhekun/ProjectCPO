import Communication.ClientTcp;

import java.io.IOError;
import java.io.IOException;

/**
 * class Sensor
 * 传感器 类
 * 定义 传感器 方法
 */

public class Sensor {
    int temperature;
    int humidity;
    ClientTcp client;

    public Sensor() {
    }

    /**
     * 方法 获取温度  待处理！！！
     * ---byte of java are signed, cannot be bigger than 127
     * ---must be converted to unsigned byte
     */
    public int getTemp() {
        byte[] tab = {0, 1, 0, 0, 0, 6, 8, 3, 0, 100, 0, 1};
        byte[] tab2;
        int rul;
        ClientTcp client = new ClientTcp();
        try {
            client.se_connecter("169.254.211.21", 502);
        } catch (Exception e) {
            System.out.println("getTemperature Failed");
            System.out.println(e.toString());
        } finally {
            //
            client.envoyer_octets(tab);
            client.recevoir_octets();
            tab2 = client.getTrame_reponse();
            rul = tab2[9]*255 +tab2[10];
//            for (int i = 0; i < tab2.length; i++){
//                System.out.println(tab2[i]);
//            }
            client.se_deconnecter();
        }
        return rul;


        //方法 获取湿度
//        public int getHumi () {
//
    }

    /**
     * 方法 获取湿度  待处理！！！
     * ---byte of java are signed, cannot be bigger than 127
     * ---must be converted to unsigned byte
     */
    public int getHumi() {
        byte[] tab = {0, 1, 0, 0, 0, 6, 8, 3, 0, 101, 0, 1};
        byte[] tab2;
        int rul;
        ClientTcp client = new ClientTcp();
        try {
            client.se_connecter("169.254.211.21", 502);
        } catch (Exception e) {
            System.out.println("getTemperature Failed");
            System.out.println(e.toString());
        } finally {
            //
            client.envoyer_octets(tab);
            client.recevoir_octets();
            tab2 = client.getTrame_reponse();
            rul = tab2[9]*255 +tab2[10];
//            for (int i = 0; i < tab2.length; i++){
//                System.out.println(tab2[i]);
//            }
            client.se_deconnecter();
        }
        return rul;
    }
}

