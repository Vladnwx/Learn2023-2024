package lr3;

import java.util.Arrays;
import java.util.Scanner;

/*
Напишите программу, в которой создается одномерный числовой массив и
заполняется числами, которые при делении на 5 дают в остатке 2
(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
Предусмотреть обработку ошибки, связанной с вводом некорректного значения.
 */
public class Example6 {
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

        for (int i=0; i<a; i++){
            if (i==0) arr[i]=2;
            else arr[i]=arr[i-1]+5;
        }
        System.out.println("Массив значений: ");
        System.out.println(Arrays.toString(arr));
    }
}
