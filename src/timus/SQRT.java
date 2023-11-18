package timus;

import java.util.Scanner;

//https://acm.timus.ru/problem.aspx?space=1&num=1001

//JUDGE_ID 368360HH
/*
1001. Обратный корень
Ограничение времени: 2.0 секунды
Ограничение памяти: 64 МБ
Эта задача настолько проста, что авторы даже поленились сочинить для нее условие!
Исходные данные
Входной поток содержит набор целых чисел Ai (0 ≤ Ai ≤ 10^18), отделённых друг от
друга произвольным количеством пробелов и переводов строк. Размер входного потока не превышает 256 КБ.
Результат
Для каждого числа Ai, начиная с последнего и заканчивая первым, в отдельной строке вывести его
квадратный корень не менее чем с четырьмя знаками после десятичной точки.
*/
public class SQRT {
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);


        //int maxLenght = 256 * 1024 / 8;
        int maxLenght = 5;
        double[] nums = new double[maxLenght];

long l = 0L;
int i=0;
int j=0;
double d=0.0D;

      if (nums.length>0){
          while (i+j<maxLenght) {
            if (in.hasNext(" "))
            {

                j++;
                System.out.println(j);
            }

              if (in.hasNext()){
                in.next().trim();
              l = in.nextLong();
              d = Math.sqrt(l);
              nums[i] = d;
              i++;}
            else {j++;}
                                  }
          in.close();
          }


          while(i>0) {
              String s = String.format("%.4f",nums[i-1] );
              System.out.println(s);
              i--;
          }
      }
    }

