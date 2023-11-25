package timus.task_1820;
// JUDGE_ID 368360HH
/*
1820. Уральские бифштексы
Ограничение времени: 0.5 секунды
Ограничение памяти: 64 МБ
После личного первенства довольные, но голодные программисты зашли в ресторан «Уральские бифштексы» и заказали себе n фирменных бифштексов. Для того чтобы приготовить бифштекс, повар должен прожарить каждую из его сторон на сковороде в течение одной минуты.
К сожалению, у повара есть только одна сковорода, и на ней можно одновременно жарить не более k бифштексов. Определите, сколько минут понадобится повару, чтобы выполнить заказ программистов.
Исходные данные
В единственной строке через пробел записаны целые числа n и k (1 ≤ n, k ≤ 1000).
Результат
Выведите минимальное количество минут, за которое повар сможет приготовить n бифштексов.
Пример
исходные данные	результат
3 2
                    3
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,k, result;
        n= in.nextInt();
        k=in.nextInt();
        if (k>=n) result =2;
        else if ((n*2)%k==0) result =n*2/k;
        else result = (n*2/k)+1;
        System.out.println(result);
    }
}