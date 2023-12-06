package lr4;

import java.util.Arrays;
import java.util.Scanner;

/*
Напишите программу, в которой создается двумерный массив,
 который выводи прямоугольник из цифр 2;
 */
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер прямоугольника:");
        int a,b;
        System.out.println("Введите длину прямоугольника:");
        try {
         if (in.hasNextInt()) a=in.nextInt();
         else { System.out.println("Вы ввели не целое число:");
             return;
         }
        System.out.println("Введите ширину прямоугольника:");
            if (in.hasNextInt()) b=in.nextInt();
            else { System.out.println("Вы ввели не целое число:");
                return;}
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

        int [][] arr = new int[a][b];

        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                if (i==0){
                   arr[i][j]=2;
                }
                else  if (i==a-1){
                    arr[i][j]=2;
                }
            }
            arr[i][0]=2;
            arr[i][b-1]=2;
        }

        for (int i=0; i<a; i++) {
            for (int j = 0; j < b; j++) {

                if(arr[i][j]>0){
                    System.out.print(arr[i][j]);
                    }
                else System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
