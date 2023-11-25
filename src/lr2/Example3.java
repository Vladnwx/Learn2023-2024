package lr2;

import java.util.Scanner;

//Напишите программу, которая проверяет, удовлетворяет ли
// введенное пользователем число следующим критериям:
// число делится на 4, и при этом оно не меньше 10.
public class Example3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число, которое делится на 4 и при этом больше 10:");
        Scanner in =new Scanner(System.in);
        long l;
        if (in.hasNextLong()){
            l=in.nextLong();
            if (l%4==0 & l>10){
                System.out.println("Число удовлетворяет следующим критериям: число делится на 4, и при этом оно не меньше 10");
            }
            else {System.out.println("Число НЕ удовлетворяет следующим критериям: число делится на 4, и при этом оно не меньше 10");}
        }
        else {
            System.out.println("Вы ввели не целое число");
        }

    }
}
