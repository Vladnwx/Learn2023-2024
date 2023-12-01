package lr3;

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

        System.out.println("Последовательность чисел при делении числа на 5 в остатке получа-ется 2");
        int result=2;
        System.out.print("2+");
        for (int i=1; i<a;i++){
            if (i<a-1)System.out.print("5+");
            else System.out.print("5");
            result +=5;
        }
        System.out.print(" = " +result + "\n");
        System.out.println("Последовательность чисел при делении на 3 в остатке получается 1");
        result=1;
        System.out.print("1+");
        for (int i=1; i<a;i++){
            if (i<a-1)System.out.print("3+");
            else System.out.print("3");
            result +=3;
        }
        System.out.print(" = " +result+ "\n");
        System.out.println("Через цикл while: ");
        System.out.println("Последовательность чисел при делении числа на 5 в остатке получа-ется 2");
        result =2;
        int i=1;
        System.out.print("2+");
        while (i<a){
            if (i<a-1)System.out.print("5+");
            else System.out.print("5");
            result +=5;
            i++;
        }
        System.out.print(" = " +result + "\n");

        System.out.println("Последовательность чисел при делении числа на 5 в остатке получа-ется 2");
        result =1;
         i=1;
        System.out.print("1+");
        while (i<a){
            if (i<a-1)System.out.print("3+");
            else System.out.print("3");
            result +=3;
            i++;
        }
        System.out.print(" = " +result + "\n");
    }
}
