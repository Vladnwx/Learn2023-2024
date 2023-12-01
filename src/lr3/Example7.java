package lr3;

import java.util.Arrays;
import java.util.Scanner;

/*
Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
Массив заполняется буквами «через одну», начиная с буквы ' а ':
то есть массив заполняется буквами 'а', 'с', ' е', 'д' и так далее.
Отобразите массив в консольном окне в прямом и обратном порядке.
Размер массива задается переменной.
 */
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int ch;
        System.out.println("Введите размер массива:");
        if (in.hasNextInt()) {
            a = in.nextInt();
        } else {
            System.out.println("Введено некорректное значение");
            return;
        }
        int [] arr = new int[a];
        char [] arr2 = new char[a];
        ch = (int) 'a' -2;

        for(int i=0; i<a; i++){
            ch+=2;
            arr[i]=ch;
            arr2[i]=(char) ch;
        }
        System.out.println("Прямой массив :");
        for(int i=0; i<a; i++){
            System.out.print((char) arr[i] +" ");
        }
        System.out.println("\nОбратный массив: ");
        for(int i=a-1; i>=0; i--){
            System.out.print((char) arr[i] +" ");
        }
        System.out.println("\nПрямой массив :");
        System.out.println("\n" +Arrays.toString(arr2));
        System.out.println("\nОбратный массив: ");
        for(int i=a-1; i>=0; i--){
            System.out.print(arr2[i] +" ");
        }
    }
}
