package lr6;

import java.util.*;

/*
Напишите программу со статическим методом,
аргументом которому передается произвольное количество
целочисленных аргументов. Результатом метод возвращает
массив из двух элементов: это значения наибольшего и наименьшего
значений среди аргументов, переданных методу.
 */
public class Example10 {
    public static void MINMAX (int ... ints){
        Arrays.parallelSort(ints);

        System.out.println(Arrays.toString(ints));;

        System.out.println("MIN = " + ints[0]);
        System.out.println("MAX = " + ints[ints.length-1]);

    }

    public static void main(String[] args) {

        Random r = new Random();

        int[] arrInt = new int[r.nextInt(10, 1000)];
        for (int i=0; i<arrInt.length; i++){
            arrInt[i]=r.nextInt(50, 1000);
        }
        MINMAX(arrInt);
    }
}
