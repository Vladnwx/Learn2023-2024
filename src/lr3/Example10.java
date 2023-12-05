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

        int [] arr1 = arr.clone();
        int [] arr2 = arr.clone();
        int [] arr3 = arr.clone();
        int [] arr4 = arr.clone();

        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(arr));

        System.out.println("Сортировка пузырьком по возрастанию/ Bubble sort");
        for (int i=0; i< arr1.length; i++){
            for (int j=i+1;j<arr1.length;j++){
                if (arr1[i]<arr1[j]){
                    int tmp = arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=tmp;
                }
            }
        }
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(arr1));

      /*  System.out.println("Шейкерная сортировка по возрастанию/ Shaker sort");

        int start =0, end=0;

        for (int i =0; i<arr2.length; i++){

        }


        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(arr1));*/
in.close();


    }
}
