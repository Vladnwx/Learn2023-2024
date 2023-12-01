package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Напишите программу, в которой создается массив и
заполняется случайными числами. Массив отображается в
консольном окне. В этом массиве необходимо определить элемент
с минимальным значением. В частности, программа должна вывести
значение элемента с минимальным значением и индекс этого элемента.
Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.
 */
public class Example9 {
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
            arr[i] = random.nextInt(200);
        }
        System.out.println("Массив до сортировки");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Массив после сортировки");
        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальное значение в массиве");
        System.out.println("Элемент массива [" + 0 + "] = " + arr[0]);

        System.out.println("Индексы элементов массива с минимальным значением: ");
        for (int i=0; i<arr.length; i++){
            if (arr[i]==arr[0]){
                System.out.print(" " + i);
            }
        }

    }
}
