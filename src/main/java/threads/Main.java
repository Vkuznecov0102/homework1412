package threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadClass thread=new ThreadClass("Я наследник Thread", 1650L);
        RunnableClass threadR=new RunnableClass("Я имплементирую Runnable",1312L);

        System.out.println("Начало");

        thread.start();
        threadR.run();

        thread.join();

        System.out.println("Конец");

        Thread messageThread=new ThreadClass("Это сообщение случится пять раз в 5 секунд",5000L);
        messageThread.start();
    }
}
