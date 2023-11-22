package lr1;

import java.util.Scanner;

//Напишите программу, в которой по году рождения определяется возраст пользователя.
public class Example10 {
    public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("Введите год рождения: ");

int age = in.nextInt();

int years = in.nextInt();

System.out.println("Ваш возраст: " +(years-age));

in.close();

    }
}
