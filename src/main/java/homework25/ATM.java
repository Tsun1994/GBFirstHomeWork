package homework25;

import java.lang.Thread;

public class ATM {
    int money;

    public ATM(int money) {
        this.money = money;
    }

    public synchronized void  took (int a, String user){
        if (money >= a){
            try{
                java.lang.Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public synchronized void takeMoney(int amount, String user){
        if (money >= amount){
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            money -= amount;
            System.out.println(user + " take " + amount);
        } else {
            System.out.println(user + ": not enough money");
        }
    }

    public void info (){
        System.out.println("ATM " + money);
    }
}