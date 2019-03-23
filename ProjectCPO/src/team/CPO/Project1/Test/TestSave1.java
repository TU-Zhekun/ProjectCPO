//package team.CPO.Project1.Test;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//    /**
//     * 持久化示例。如何将内存中的数据保存起来，并没有一定的格式，任何人
//     * 都可以根据自己的喜好来制定。持久化需要文件操作，所以请务必先弄懂
//     * 如何读写文件。
//     */
//    public class TestSave1 {
//
//        // 文件名可随意指定，你可以用文本编辑器打开这个文件（注意，记事本无法处理换行）
//        static String filename = "./././data/Sensor.data";
//
//        public static void main(String[] args) throws Exception {
//            // 将这个程序运行两遍。
//            // 第一遍它会创建一些 infoLine 对象并保存到文件；
//            // 第二遍它会从文件中读取对象数据并显示出来。
//            if (!new File(filename).exists()) {
//                createAndSave();
//            } else {
//                readAndShow();
//            }
//        }
//
//        // 生成并保存 infoLine 对象
//        private static void createAndSave() throws IOException {
//            List<infoLine> infoList = createinfoList();
//            saveinfoList(infoList);
//        }
//
//        // 读取并显示 infoLine 对象
//        private static void readAndShow() throws IOException {
//            List<infoLine> infoList = readinfoList();
//            showinfoList(infoList);
//        }
//
//        // 创建要保存的 infoLine 对象
//        private static List<infoLine> createinfoList() {
//            List<infoLine> infoList1 = new ArrayList<infoLine>();
//            infoList1.add(new infoLine("张三", new Date(), true));
//            infoList1.add(new infoLine("李四", new Date(), false));
//            infoList1.add(new infoLine("王五", new Date(), true));
//            return infoList1;
//        }
//
//        // 保存 infoLine 对象到文件。保存格式为：
//        // 1、每个 infoLine 一行
//        // 2、每行依次存放 name、birthday、male 三个属性值，用 tab 隔开
//        // 3、birthday 属性保存的是毫秒数，male 属性保存的是字符串
//        private static void saveinfoList(List<infoLine> infoList) throws IOException {
//
//            // 生成文件内容
//            String data = "";
//            for (infoLine infoLine : infoList) {
//                data += getinfoListtring(infoLine) + "/n";
//            }
//
//            // 保存文件内容
//            FileWriter writer = new FileWriter(filename);
//            writer.write(data);
//            writer.close();
//            System.out.println("对象保存完毕。");
//        }
//
//        private static String getinfoListtring(infoLine infoLine) {
//            return infoLine.getName() + "/t" + infoLine.getBirthday().getTime() + "/t" + infoLine.isMale();
//        }
//
//        // 从文件中读取 infoLine 对象
//        private static List<infoLine> readinfoList() throws IOException {
//            List<infoLine> result = new ArrayList<infoLine>();
//
//            BufferedReader reader = new BufferedReader(new FileReader(filename));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                result.add(getinfoLineFromString(line));
//            }
//
//            return result;
//        }
//
//        // 通过一行文件内容生成一个 infoLine 对象
//        private static infoLine getinfoLineFromString(String line) {
//            String[] parts = line.split("/t");  // 获取被分隔的三个部分
//
//            return new infoLine(
//                    parts[0],                               // 姓名
//                    new Date(Long.parseLong(parts[1])),     // 出生日期
//                    Boolean.parseBoolean(parts[2])          // 是否为男性
//            );
//        }
//
//        // 显示 infoLine 对象
//        private static void showinfoList(List<infoLine> infoList) {
//            for (infoLine infoLine : infoList) {
//                System.out.println(infoLine.getName() + ", " +
//                        infoLine.getBirthday() + ", " +
//                        (infoLine.isMale() ? "男" : "女"));
//            }
//        }
//    }
//
//    // 要持久化的类
//    class infoLine {
//
//        private String name;        // 姓名
//
//        private Date birthday;      // 生日
//
//        private boolean male;       // true 表示男性，false 表示女性
//
//        infoLine(String name, Date birthday, boolean male) {
//            this.name = name;
//            this.birthday = birthday;
//            this.male = male;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public Date getBirthday() {
//            return birthday;
//        }
//
//        public void setBirthday(Date birthday) {
//            this.birthday = birthday;
//        }
//
//        public boolean isMale() {
//            return male;
//        }
//
//        public void setMale(boolean male) {
//            this.male = male;
//        }
//    }
//
