package lr2;

import java.util.Scanner;

//Напишите программу, которая проверяет, удовлетворяет ли
// введенное пользователем число следующим критериям: при
// делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1.
public class Example2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        long l;
        if (in.hasNextLong()) {
            l = in.nextLong();
        } else {
            System.out.println("Вы ввели не целое число");
            return;
        }
        long result1 = l % 5;
        long result2 = l % 7;

        if (result1==2 & result2==1){
            System.out.println("Число удовлетворяетс следующим критериям: при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1.");
        }
        else {System.out.println("Число НЕ удовлетворяетс следующим критериям: при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1.");}

    }
}
