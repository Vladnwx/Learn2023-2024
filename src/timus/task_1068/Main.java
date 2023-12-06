package timus.task_1068;

//JUDGE_ID 368360HH
//https://acm.timus.ru/problem.aspx?space=1&num=1068
/*
1068. Сумма
Ограничение времени: 2.0 секунды
Ограничение памяти: 64 МБ
Всё, что от вас требуется — найти сумму всех целых чисел, лежащих между 1 и N включительно.
Исходные данные
В единственной строке расположено число N, по модулю не превосходящее 10000.
Результат
Выведите целое число — ответ задачи.

*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1068/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        Scanner in =
                null;
        try {
            in = oj ? new Scanner(System.in) :
                    new Scanner(new FileReader(inputFileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int a, sum=0;
a=in.nextInt();
if (a<=0) {
for (int )

}
else { 

}
System.out.println(sum);


   


    }
}
