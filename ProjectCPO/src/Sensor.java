import Communication.ClientTcp;
import Communication.ConvertisseurOctet;

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
     * ---int must be converted to unsigned float
     */
    public double getTemp() {
        byte[] tab = {0, 1, 0, 0, 0, 6, 8, 3, 0, 100, 0, 1};
        return (double)(getInfo(tab))/10;
    }

    /**
     * 方法 获取湿度  待处理！！！
     * ---int must be converted to unsigned byte
     */
    public double getHumi() {
        byte[] tab = {0, 1, 0, 0, 0, 6, 8, 3, 0, 101, 0, 1};
        return (double)(getInfo(tab))/10;
    }

    int getInfo(byte[] tab) {
        int rul;
        byte[] tab2;
        ClientTcp client = new ClientTcp();
        try {
            client.se_connecter("169.254.211.21", 502);
        } catch (Exception e) {
            System.out.println("getTemperature Failed");
            System.out.println(e.toString());
        } finally {
            client.envoyer_octets(tab);
            client.recevoir_octets();
            tab2 = client.getTrame_reponse();
            ConvertisseurOctet convertisseurOctet = new ConvertisseurOctet();
            rul = convertisseurOctet.ByteToInt(tab2[9]) * 255 + convertisseurOctet.ByteToInt(tab2[10]);
            client.se_deconnecter();
        }
        return rul;
    }
}

