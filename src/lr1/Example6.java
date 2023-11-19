package lr1;

//Напишите программу, в которой Пользователь вводит сначала фамилию, затем имя, затем отчество.
// После ввода программа выводит сообщение «Hello <фамилия, имя, отчество>».

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String family = in.nextLine();

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите отчество: ");
        String otchestvo = in.nextLine();

        System.out.println("Hello " + family + " "+ name + " " + otchestvo);

        in.close();

    }
}
