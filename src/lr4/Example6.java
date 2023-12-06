package lr4;

import java.util.Random;
import java.util.Scanner;

/*
Напишите программу, в которой создается и инициализируется двумерный
 числовой массив. Затем из этого массива удаляется строка и столбец
 (создается новый массив, в котором по сравнению с исходным удалена
 одна строка и один столбец). Индекс удаляемой строки и индекс удаляемого
 столбца определяется с помощью генератора случайных чисел.
 */
public class Example6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.println("Введите размер массива:");
        int a, b;
        System.out.println("Введите длину массива:");
        try {
            if (in.hasNextInt()) a = in.nextInt();
            else {
                System.out.println("Вы ввели не целое число:");
                return;
            }
            System.out.println("Введите ширину массива:");
            if (in.hasNextInt()) b = in.nextInt();
            else {
                System.out.println("Вы ввели не целое число:");
                return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        int[][] arr = new int[a][b];
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Удаление случайной строки:");
        int aDel = random.nextInt(a);
        System.out.println(aDel);
        System.out.println("Удаление случайного столбца");
        int bDel = random.nextInt(b);
        System.out.println(bDel);
        int[][] arrNew = new int[a-1][b-1];
        int c=0;
        int k=0;
        for (int i = 0; i < a-1; i++) {
        if (i<aDel){ c=i;}
        else if (i>aDel && c<a) {c=i+1;}
        else c=i+1;
            for (int j = 0; j < b-1; j++) {
                if (j<bDel){ k=j;}
                else if (j>bDel && k<b) {k=j+1;}
                else k=j+1;
                arrNew[i][j]=arr[c][k];
            }
                                        }
        System.out.println("Новый массив с удаленной строкой или столбцом:");
        for (int i = 0; i < a-1; i++) {
            for (int j = 0; j < b-1; j++) {
                System.out.print(arrNew[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
