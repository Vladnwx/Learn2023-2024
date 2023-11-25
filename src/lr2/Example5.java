package lr2;

import java.util.Scanner;

//Напишите программу, которая проверяет, сколько тысяч
// во введенном пользователем числе (определяется четвертая цифра справа в десятичном представлении числа).
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число более 1000:");
        int i;
        if (in.hasNextInt()){
            i =in.nextInt();
                System.out.println("В введенном числе: " + i / 1000 + " тысяч");
        }
        else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
