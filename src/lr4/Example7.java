package lr4;

import java.util.Random;
import java.util.Scanner;

/*
Напишите программу, в которой создается двумерный числовой массив
и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так далее.
 */
public class Example7 {
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
    }


}
