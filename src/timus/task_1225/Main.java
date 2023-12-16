package timus.task_1225;

//JUDGE_ID 368360HH

//https://acm.timus.ru/problem.aspx?space=1&num=1225

/*
1225. Флаги
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ
В День флага России владелец магазина решил украсить свою витрину полосками ткани белого, синего и красного цветов. Он хочет, чтобы выполнялись следующие условия:
Полоски одного цвета не должны располагаться рядом друг с другом.
Синяя полоска может быть расположена только между белой и красной или между красной и белой.
Определите количество способов выполнить желание владельца магазина.
Например, для N = 3 возможны следующие варианты:
Problem illustration
Исходные данные
N — количество полосок, 1 ≤ N ≤ 45.
Результат
M — количество способов украсить витрину.
Примеры
исходные данные	результат
1
2
2
2
3
4
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1225/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        Scanner in =
                null;
        try {
            in = oj ? new Scanner(System.in) :
                    new Scanner(new FileReader(inputFileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
