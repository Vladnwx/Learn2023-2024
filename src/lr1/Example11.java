package lr1;

import java.util.Scanner;

//Напишите программу, в которой Пользователь вводит имя и год рождения, в программа отображает сообщение содержащее имя пользователя и его возраст.
public class Example11 {
    public static void main(String[] args) {

Scanner in = new Scanner (System.in);

System.out.println("Введите имя: ");

String name = in.nextLine();

System.out.println("Введите возраст: ");

int age = in.nextInt();

System.out.println("Ваши данные: " + name +" " + age);
in.close();




    }
}
