package lr3;

import java.util.Scanner;

/*
Напишите программу, в которой пользователю предлагается ввести название дня недели.
По введенному названию программа определяет порядковый номер дня в неделе.
Если пользователь вводит неправильное название дня, программа выводит сообщение о том,
что такого дня нет. Предложите версию программы на основе вложенных условных операторов
и на основе оператора выбора switch.
 */
public class Example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a;
        String s1="";
        String s2="";

        System.out.println("Введите название дня недели: ");
        if (in.hasNext())
        {
            s1= in.next();
        } else {System.out.println("Вы ничего не ввели");
            return;
        }
        System.out.println("Введите версию вывода данных: ");
        System.out.println("switch или if");

        if (in.hasNext())
        {
            s2= in.next();
        } else {System.out.println("Вы ничего не ввели");
            return;
        }

        switch (s2){
            case "switch" :
                a = 1;
                break;
            case "if" :
                a = 2;
                break;
            default:
                a=0;
                break;

        }

        switch (a) {
            case 1: {
                switch (s1) {
                    case "Понедельник":
                        System.out.println("1");
                        break;
                    case "Вторник":
                        System.out.println("2");
                        break;
                    case "Среда":
                        System.out.println("3");
                        break;
                    case "Четверг":
                        System.out.println("4");
                        break;
                    case "Пятница":
                        System.out.println("5");
                        break;
                    case "Суббота":
                        System.out.println("6");
                        break;
                    case "Воскресенье":
                        System.out.println("7");
                        break;
                    case "понедельник":
                        System.out.println("1");
                        break;
                    case "вторник":
                        System.out.println("2");
                        break;
                    case "среда":
                        System.out.println("3");
                        break;
                    case "четверг":
                        System.out.println("4");
                        break;
                    case "пятница":
                        System.out.println("5");
                        break;
                    case "суббота":
                        System.out.println("6");
                        break;
                    case "воскресенье":
                        System.out.println("7");
                        break;
                    default:
                        System.out.println("Вы ввели не день недели");
                        break;
                } break;
            }
            case 2: {
                if (s1.contains("Понедельник") | s1.contains("понедельник")) {
                    System.out.println("1");
                } else if (s1.contains("Вторник") | s1.contains("вторник")) {
                    System.out.println("2");
                } else if (s1.contains("Среда") | s1.contains("среда")) {
                    System.out.println("3");
                } else if (s1.contains("Четверг") | s1.contains("четверг")) {
                    System.out.println("4");
                } else if (s1.contains("Пятница") | s1.contains("пятница")) {
                    System.out.println("5");
                } else if (s1.contains("Суббота") | s1.contains("суббота")) {
                    System.out.println("6");
                } else if (s1.contains("Воскресенье") | s1.contains("воскресенье")) {
                    System.out.println("7");
                } else System.out.println("Вы ввели не день недели");
                break;
            }
            case 0:
                System.out.println("Вы ввели неверную версию вывода");
                break;
            default:
                System.out.println("Вы ввели неверную версию вывода");
                break;



        }




    }
}
