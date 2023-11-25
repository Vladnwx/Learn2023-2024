package lr2;
//Напишите программу, которая проверяет, делится ли введенное Пользователем число на 3.
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        {System.out.println("Введите целое число, которое делится на 3");}
        Scanner in = new Scanner(System.in);
        long l;
        if (in.hasNextLong()){
            l=in.nextLong();
            l= l%3;
        }
        else {System.out.println("Вы ввели не целое число, программа будет закрыта");
        return;}
        if (l==0){System.out.println("Число делится на 3");}
        else {System.out.println("Число НЕ делится на 3");}

    }
}
