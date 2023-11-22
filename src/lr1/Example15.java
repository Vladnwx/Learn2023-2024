package lr1;

import java.util.Scanner;

//Напишите программу, в которой Пользователь вводит два числа, а программой вычисляется и отображается сумма и разность этих чисел.
public class Example15 {
    public static void main(String[] args) {

Scanner in = new Scanner (System.in);

System.out.println("Введите первое число: ");

int a = in.nextInt();

System.out.println("Введите второе число: ");

int b = in.nextInt();

System.out.println("Сумма чисел: " + (a+b));

System.out.println("Разность чисел: " + (a-b));

in.close();
    }
}
