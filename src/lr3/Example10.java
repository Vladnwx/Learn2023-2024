package lr3;

import java.util.*;

/*
Напишите программу, в которой создается целочисленный массив,
заполняется случайными числами и после этого значения элементов
в массиве сортируются в порядке убывания значений.
 */
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Введите размер массива:");
        if (in.hasNextInt()) {
            a = in.nextInt();
        } else {
            System.out.println("Введено некорректное значение");
            return;
        }
        int [] arr = new int[a];
        Random random = new Random();
        for (int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(1000);
        }
        Arrays.parallelSort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
