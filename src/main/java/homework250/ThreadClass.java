package homework250;

import homework25.Thread;

import java.util.Arrays;

public class ThreadClass {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void fillArray (){
        float [] arr = new float[size];  // создаем массив из числа типа float
        Arrays.fill(arr, 1);         // заполняем его единицами
        long currentTime = System.currentTimeMillis(); // здесь мы получаем значение времени выполнения заполнения данного массива
        System.out.println("Время выполнения первого заполнения - " + currentTime);  // выводим время, которое понадобилось программе для выполнения предыдущей строчки
        Thread t1 = new Thread(() ->{ // не совсем понял, что за запись, но здесь мы создаем поток и вкладываем в него ту подпрограмму, что должна выполняться
            for (int i = 0; i < size; i++) {  // бегаем от 0 до значения size
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2)); //начинаем бегать по массиву и заполнять новыми значениями по формуле
            }
            System.out.println("Время заполнения второго заполнения - " + (System.currentTimeMillis()-currentTime)); // получаем разность времени выполнения заполнение массивов. Естственно второй заполняется дольше
        });
        t1.start(); // запускаем наш поток, по скольку они не синхронизированы, то поток из другого метода начинает выполняться раньше, чем закончит первый
    }
}
