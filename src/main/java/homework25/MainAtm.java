package homework25;

public class MainAtm {
    public static void main(String[] args) throws InterruptedException {
        ATM atm = new ATM(100);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.takeMoney(50, "user-1");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.takeMoney(50, "user-2");
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.takeMoney(50, "user-3");
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        atm.info();
    }
}
