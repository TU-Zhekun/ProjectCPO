public class ThreadTest1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("1");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
