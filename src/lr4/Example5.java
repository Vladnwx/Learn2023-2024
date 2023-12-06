package lr4;

import java.util.Random;
import java.util.Scanner;

/*
Напишите программу, в которой создается двумерный целочисленный массив.
Он заполняется случайными числами. Затем в этом массиве строи и столбцы
меняются местами: первая строка становится первым столбцом, вторая строка
становиться вторым столбцом и так далее. Например, если исходный массив
состоял из 3 строк и 5 столбцов, то в итоге получаем массив из 5 строк и 3 столбцов.
 */
public class Example5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int a,b;
        System.out.println("Введите длину массива:");
        try {
            if (in.hasNextInt()) a=in.nextInt();
            else { System.out.println("Вы ввели не целое число:");
                return;
            }
            System.out.println("Введите ширину массива:");
            if (in.hasNextInt()) b=in.nextInt();
            else { System.out.println("Вы ввели не целое число:");
                return;}
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

        int [][] arr = new int[a][b];
        Random random =new Random();
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++) {
            arr[i][j]= random.nextInt(100);
            }
        }
        System.out.println("Исходный массив:");
        for (int i=0; i<a; i++) {
            for (int j = 0; j < b; j++) {
                    System.out.print(arr[i][j]+ " ");
                }
            System.out.print("\n");
            }
        int [][] arrNew = new int[b][a];
        for (int i=0; i<b; i++){
            for (int j=0; j<a; j++) {
                arrNew [i][j] = arr[j][i];
            }
        }
        System.out.println("Перевернутый массив:");
        for (int i=0; i<b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(arrNew[i][j]+ " ");
            }
            System.out.print("\n");
        }


        }

    }
