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
        int [] arr2 = new int[a];
        Random random = new Random();
        for (int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(200);
            arr2[i]= arr[i];
        }
        System.out.println("Массив до сортировки");
        System.out.println(Arrays.toString(arr));
        Arrays.parallelSort(arr2);
        System.out.println("Массив после сортировки");
        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальное значение в массиве");
        System.out.println("Элемент массива [" + 0 + "] = " + arr[0]);

        System.out.println("Индексы элементов массива с минимальным значением в исходном  массиве: ");
        for (int i=0; i<arr.length; i++){
            if (arr[i]==arr[0]){
                System.out.print(" " + i);
            }
        }
        System.out.println("\nИндексы элементов массива с минимальным значением в отсортировыанном массиве: ");
        for (int i=0; i<arr2.length; i++){
            if (arr2[i]==arr2[0]){
                System.out.print(" " + i);
            }
        }

    }
}
