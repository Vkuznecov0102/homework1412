package runnable;

public class RunnablePractice {
    public static void main(String[] args) {

        Runnable first = () -> System.out.println("Привет я Runnable");
        Thread firstThread = new Thread(first);
        firstThread.start();

        Runnable second = () -> {
            for (int i = 0; i < 7; i++) {
                System.out.println("Привет я проснулся после 4 секунд");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread secondThread = new Thread(second);
        secondThread.setDaemon(true);
        secondThread.start();
    }
}
