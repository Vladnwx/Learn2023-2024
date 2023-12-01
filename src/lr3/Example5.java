package lr3;

import java.util.Arrays;
import java.util.Scanner;

/*
Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям:
при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1.
 Количество чисел в сумме вводится пользователем. Программа отображает числа, которые суммируются,
 и значение суммы. Предложите версии программы, использующие разные операторы цикла.
 */
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Введите количество чисел для суммы: ");
        a=in.nextInt();
        System.out.println("Через цикл for: ");

        int[] arr = new int[a];
        int result=0;
        for (int i=0; i<a;i++){
            result +=arr[i];
            Arrays.toString(arr);
        }

        if ((result/5==2 | result/3==1) & result>2){
        System.out.print(" = ");
        System.out.print(result);}
        System.out.println("\n"+ result/5);
        System.out.println(result/3);


    }
}
