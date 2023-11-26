package timus.task_1197;
// JUDGE_ID 368360HH

/*
1197. Один в поле воин
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ
Условие этой задачи очень простое: вам всего лишь надо определить, сколько клеток находится
под боем шахматного коня, одиноко стоящего на шахматной доске. На всякий случай напомним, что
конь ходит буквой «Г» — на две клетки по горизонтали или вертикали в любом направлении, и потом
на одну клетку в направлении, перпендикулярном первоначальному.
Исходные данные
В первой строке находится единственное число N, 1 ≤ N ≤ 64 — количество тестов. В каждой из
последующих N строк содержится очередной тест: два символа (маленькая латинская буква от 'a' до 'h' и
цифра от 1 до 8) — стандартное шахматное обозначение клетки, на которой стоит конь. При этом буква
обозначает вертикаль, а цифра — горизонталь.
Результат
Выведите N строк: в каждой из них должно находиться единственное число — количество клеток шахматной
доски, находящихся под боем коня.
Пример
исходные данные	            результат
3
a1
d4
g6
                                2
                                8
                                6
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_1197/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        Scanner in =
                null;
        try {
            in = oj ? new Scanner(System.in) :
                    new Scanner(new FileReader(inputFileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Scanner in = new Scanner(System.in);
        int N;
       // int[][] board = {{1, 2, 3, 4, 5, 6, 7, 8}, {1, 2, 3, 4, 5, 6, 7, 8}};
        N= in.nextInt();

        for (int i=0; i<N;i++){
            String coordinatetemp = in.next();
            String coordinateYtemp = String.valueOf(coordinatetemp.charAt(0));
            int coordinateY;
             switch (coordinateYtemp) {
                 case "a" :
                            coordinateY =1;
                                break;
                 case "b" :
                     coordinateY =2;
                     break;
                 case "c" :
                     coordinateY =3;
                     break;
                 case "d" :
                     coordinateY =4;
                     break;
                 case "e" :
                     coordinateY =5;
                     break;
                 case "f" :
                     coordinateY =6;
                     break;
                 case "g" :
                     coordinateY =7;
                     break;
                 case "h" :
                     coordinateY =1;
                     break;
                 default: coordinateY =0;
            };
            int coordinateX = Integer.parseInt(String.valueOf(coordinatetemp.charAt(1)));
         //   System.out.println("Координата Х: " + coordinateX + " Координата Y: " + coordinateY);
            int count=0;
            if((coordinateX+2) <=8)
            {
                if((coordinateY+1) <=8){
                    count++;
                }
                if ((coordinateY-1) >0)
                {
                    count++;
                }
            }
            if((coordinateX+1) <=8)
            {
                if((coordinateY+2) <=8){
                    count++;
                }
                if ((coordinateY-2) >0)
                {
                    count++;
                }
            }
            if((coordinateX-2) >0)
            {
                if((coordinateY+1) <=8){
                    count++;
                }
                if ((coordinateY-1) >0)
                {
                    count++;
                }
            }
            if((coordinateX-1) >0)
            {
                if((coordinateY+2) <=8){
                    count++;
                }
                if ((coordinateY-2) >0)
                {
                    count++;
                }
            }
           // System.out.println("Количество клеток под боем коня: " + count);
            System.out.println(count);
        }


    }
}
