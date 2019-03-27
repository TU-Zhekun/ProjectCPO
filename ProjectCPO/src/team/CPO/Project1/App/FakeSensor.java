package team.CPO.Project1.App;

public class FakeSensor {
    /**
     * 方法 获取温度  待处理！！！
     * ---int must be converted to unsigned float
     */
    public double getTemp() {

        if(i % 5 == 0){
            i=0;
        }
        i++;
        return (double)(225 + i)/10;
    }

    /**
     * 方法 获取湿度  待处理！！！
     * ---int must be converted to unsigned byte
     */
    int i = 1;
    public double getHumi() {

        if(i % 5 == 0){
            i=0;
        }
            i++;
            return (double)(334 + i)/10;
    }


}
