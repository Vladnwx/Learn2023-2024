package lr3;

import java.util.Scanner;

/*
Напишите программу, в которой пользователем вводится два целых числа.
Программа выводит все целые числа — начиная с наименьшего (из двух введенных чисел)
и заканчивая наибольшим (из двух введенных чисел). Предложите разные версии программы
(с использованием разных операторов цикла).
 */
public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Введите два целых числа: ");
        System.out.println("Введите первое число: ");
        a= in.nextInt();
        System.out.println("Введите второе число: ");
        b= in.nextInt();
        if (a>b) c=0;
        else c=1;
        System.out.println("Через цикл for: ");
        switch (c){
            case 0: {
                for (int i=b; i<=a; i++){
                    System.out.println(i);
                }
                break;
            }
            case 1: {
                for (int i=a; i<=b; i++){
                    System.out.println(i);
                }
                break;
            }
            default:
                System.out.println("что-то тут не так");
                break;
        }
        System.out.println("Через цикл while: ");
        switch (c){
            case 0: {
                int i=b;
                while (i<=a){
                    System.out.println(i);
                    i++;
                }
                break;
            }
            case 1: {
                int i=a;
                while (i<=b){
                    System.out.println(i);
                    i++;
                }
                break;
            }
            default:
                System.out.println("что-то тут не так");
                break;
        }


    }
}
