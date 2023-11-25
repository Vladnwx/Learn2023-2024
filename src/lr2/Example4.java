package lr2;

import java.util.Scanner;

//Напишите программу, которая проверяет, попадает ли введение пользователем число в диапазон от 5 до 10 включительно.
public class Example4 {

    public static void main(String[] args) {
        System.out.println("Введите целое число, которое попадает в диапозон от 5 до 10 включительно:");
        Scanner in = new Scanner(System.in);
        int i;
        if (in.hasNextInt()){
            i=in.nextInt();
            if (i>=5 & i<=10){
                System.out.println("Введённое пользователем число ПОПАДАЕТ в диапазон от 5 до 10 включительно");
            }
            else {System.out.println("Введённое пользователем число НЕ попадает в диапазон от 5 до 10 включительно");}

        }
        else {
            System.out.println("Вы ввели не целое число");
        }

    }
}
