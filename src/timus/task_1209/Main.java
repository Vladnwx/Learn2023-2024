package timus.task_1209;

//JUDGE_ID 368360HH

//https://acm.timus.ru/problem.aspx?space=1&num=1209

/*
Представим себе бесконечную последовательность цифр, составленную из
записанных друг за другом возрастающих степеней десятки. Вот начало этой
последовательности: 110100100010000… Всё, что надо — определить, какая
цифра находится в такой последовательности на определённом месте.
Исходные данные
В первой строке находится целое число N (1 ≤ N ≤ 65535).
В i-й из N последующих строк записано целое число Ki —
номер позиции в последовательности (1 ≤ Ki ≤ 231 − 1).
Результат
Выведите через пробел N цифр. i-я цифра должна равняться цифре,
которая находится в описанной выше последовательности на позиции с номером Ki.
Пример
исходные данные	результат
4
3
14
7
6
0 0 1 0
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1209/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        Scanner in =
                null;
        try {
            in = oj ? new Scanner(System.in) :
                    new Scanner(new FileReader(inputFileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int N=in.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++){
            arr[i]=in.nextInt();
        }

        for (int i=0; i<N; i++){

            if (arr[i]>1){

              int k=2;
              while (k  <arr[i]){

              }

            } else { System.out.println(1 + " ");

            }


//            String s = "";
//            int c=0;
//            while (s.length()<arr[i]){
//                s+="1";
//                for (int j=0; j<c; j++){
//                    s+="0";
//                }
//                c++;
//            }
//
//            System.out.println(s.charAt(arr[i]-1) + " ");
        }

       // System.out.println(Arrays.toString(arr));
    }
}