package timus.task_1313;

//JUDGE_ID 368360HH

//https://acm.timus.ru/problem.aspx?space=1&num=1313

/*
Уральские медики очень озабочены состоянием здоровья молодежи. Как показали исследования, многие талантливые студенты вместо того, чтобы играть в футбол, кататься на коньках или велосипедах, занимаются олимпиадами по программированию. Так они это еще и спортивным программированием называют! Ну какой же это спорт, сидеть перед монитором и думать по пять часов в день! И ладно бы только на соревнованиях два раз в год, так ведь при подготовке к очередному чемпионату у них на сидение за компьютером уходит по несколько дней в неделю! И пусть бы это были разгильдяи какие-то, так ведь лучшие студенты, говорят, что и на мировом уровне результаты показывают приличные — жалко молодежь!
Чтобы отучить студентов от вредной привычки часами сидеть у компьютеров, уральские медики придумали принципиально новую разработку — монитор с диагональной разверткой! В скором будущем его будут вручать победителям и призерам чемпионатов Урала. В специально разработанном квадратном мониторе электронный луч должен проходить экран не по горизонталям, а по диагоналям. Поскольку длины диагоналей разные, нестандартные параметры мерцания и нелинейные искажения изображения быстро отучат оболтусов пялиться в экран. Разумеется, им ничего не останется делать, кроме как идти и заниматься спортом. Проблема в том, что большинство видеокарт подают на вход монитору нормальную развертку. Для успешного внедрения нового типа монитора нужна программа-адаптер, которая преобразует квадратное изображение в формат, требуемый для ввода в квадратный монитор. Программа должна быть надежной и быстрой, поэтому её разработкой будут заниматься самые лучшие программисты — участники чемпионата Урала по спортивному программированию.
Исходные данные
В первой строке записано целое число N (1 ≤ N ≤ 100) — количество пикселей на стороне квадратного монитора. Далее идут N строк, в каждой по N целых чисел в пределах от 1 до 100, разделенных пробелом. Это изображение, которое выводит обычная видеокарта (как видно, глубина цветности у нового монитора небольшая, все равно нормальному программисту больше ста цветов и не надо).
Результат
На выходе преобразователя должна получиться последовательность для ввода в новый монитор. Пиксели нумеруются от левого верхнего угла, по диагоналям, слева-направо и снизу-вверх. Подробнее объяснять тут долго и неинтересно, посмотрите на пример, дальше сами догадаетесь.
Пример
исходные данные	результат
4
1 3 6 10
2 5 9 13
4 8 12 15
7 11 14 16
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1313/input.txt";
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
        int[][] arr = new int[N][N];
        for (int i=0; i<N; i++){
            for (int j=0; j<N;j++){
                arr[i][j] = in.nextInt();
            }
        }

//        for (int i=0; i<N; i++){
//            for (int j=0; j<N;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//        }
      //  System.out.println();
        for (int i=0; i<N; i++){
            for (int j=i; j>=0;j--){
                    System.out.print(arr[j][i-j] + " ");

            }
        }
        for (int i=1; i<N; i++){
            for (int j=N-1; j>=i; j--){
                System.out.print(arr[j][N-j+i-1] + " ");
            }
        }
    }
}