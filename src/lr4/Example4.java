package lr4;

import java.util.Scanner;

/*
Напишите программу, в которой создается двумерный массив, который выводит прямоугольный треугольник;
 */
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер треугольника:");
        int a;
       // System.out.println("Введите длину прямоугольника:");
        try {
            if (in.hasNextInt()) a=in.nextInt();
            else { System.out.println("Вы ввели не целое число:");
                return;
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        int [][] arr = new int[a][a];

        for (int i=0; i<a; i++){
            for (int j=i+1; j<a; j++){
                if (j==(i+1)) {
                arr[i][j]=2;}
            }
            arr[i][0]=2;
            arr[a-1][i]=2;
        }

        for (int i=0; i<a; i++) {
            for (int j = 0; j < a; j++) {

                if(arr[i][j]>0){
                    System.out.print(arr[i][j]);
                }
                else System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
