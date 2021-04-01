package homework25;

import java.util.Arrays;

public class ThreadArray {
    static final int size = 10000000;
    static final int h = size / 2;


    public static void main(String[] args) {
        fillArray();
        currentArray(12);
    }

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

    public static void currentArray (int threadNumber){ // мы в этот метод передаем число потоков, на который надо разделить массивы
        if (threadNumber <= 0) { // заранее проверяем, что число положительное
            throw new RuntimeException("Thread number must be more than 0, your thread number is " + threadNumber);
        }

        float [] arr = new float[size]; // создаем новый массив и заполняем его единицами, а затем засекаем время.
        Arrays.fill(arr, 1);
        long time = System.currentTimeMillis();

        Thread [] threads = new Thread[threadNumber];  // еще один массив, где количество элементов равно количеству, переданного нам значения
        int size1 = size/threadNumber;    // получаем новые значения, где мы
        int size2 = size%threadNumber;

        float [][] newArr = new float[threadNumber][];  // создаем двумерный массив, где количество стобов равно значению переданного числа

        for (int i = 0; i < threadNumber; i++) { // начинаем цикл
            if (i == threadNumber - 1) {  // в случем если уже последний массив или он был один
                int size0 = size1 + size2;  // склеваем значения когда мы 10000000 подделили получили целое число, а так приплюсовываем ему остаток от деления
                newArr[i] = new float[size0];  // двумерный превращаем в одномерный с размером
                System.arraycopy(arr, i * size1, newArr[i], 0, size0);  // копируем значения из нашего изначального массива в наш новый массив (двумерный), по которому мы бегаем
                // то есть в нашем случае, если делили на 3 потока, то size1 будет равным 333333, а size2 равен 1
                // и мы копируем наш первый массив с единичками, начиная со значения суммы size1 и size2 (333334) по множенное на количество итерацийв цикле for
                // в новый массив, начиная с посизиции 0 на количество значений size0
            } else {
                newArr[i] = new float[size1]; // в случае, если массив не один и не последний, то делаем так
                System.arraycopy(arr, i * size1, newArr[i], 0, size1);
                // берем наш массив и передаем в него значения изначального массива с позиции числа итерации помноженного на size1
                // то есть сначала с 0, потом с 333333, а уже 666666 будет в if, который true
                // в новый двумерный массив массивов (то есть newArr[i][], и уже newArr[i][0], newArr[i][1] будут принимать единички)
                // на размер size1
            }
            float [] tempArr = newArr[i];  // при этом создаем новый массив из нового массива
            int count = i;
            threads[i] = new Thread(new Runnable() { // начинаем бегать по новом массиву из потоков
                @Override
                public void run() {
                    for (int j = 0, k = count * size1; j < newArr.length; j++, k++){ // где мы делаем новый цикл из двух переменных
                        tempArr[j] = (float)(tempArr[j] * Math.sin(0.2f + k / 5) * Math.cos(0.2f + k / 5) * Math.cos(0.4f + k / 2));
                        //нашему третьему массиву, где ч это значение текущей операции i помножение на size1
                        // и мы бегаеи по этому массиву, пока не кончится длина нашего первого массива newArr
                        // k особой роли не играет
                    }
                }
            });
            threads[i].start();  //запускаем наш поток, состоящий из массиовв
        } // здесь кончился цикл
        try {
            for (int i = 0; i < threadNumber; i++) {
                threads[i].join();  // здесь ноачинаем новые циклы, не совсем понимаю, но мы снова идем по нашему потоку массивов
                // пересмотрю урок по массивам еще раз
            }
            for (int i = 0; i < threadNumber; i++) { // теперь идем по другому массиву
                if (i == threadNumber - 1){ // в случем если уже последний массив или он был один
                    System.arraycopy(newArr[i], 0, arr, i * size1, size1 + size2); //то мы копируем массив обратно
                    //из нашего нового массива в старый с самого начала начинаем записывать со значения 666666 на количество size1 + size2
                } else {
                    System.arraycopy(newArr[i], 0 , arr, i * size1, size1);
                }
            }
            System.out.println("Threads: " + threadNumber + ". Time: " + (System.currentTimeMillis()- time));
            // здесь мы записываем количество потоков и разность времени от первого заполнения, сколько мы потратили на разделение потоков
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
