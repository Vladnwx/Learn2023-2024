package lr1;

import java.util.Scanner;

//Напишите программу, в которой пользователь вводит число, а программой отображается последовательность из четырех чисел:
// число, на единицу меньше введённого, введенное число и число, на единицу больше введенного.
// Четвертое число должно быть квадратом суммы первых трех чисел.
public class Example14 {
    public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("Введите число: ");

int a=in.nextInt();

System.out.println(a-1);
System.out.println(a);
System.out.println(a+1);
System.out.println(3*a*3*a);

in.close();

    }
}
