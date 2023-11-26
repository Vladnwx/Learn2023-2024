package timus.task_1409;

//JUDGE_ID 368360HH

//lr2

//https://acm.timus.ru/problem.aspx?space=1&num=1409

/*
1409. Два бандита
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ
Бандиты Гарри и Ларри отдыхали на природе. Решив пострелять, они выставили на бревно несколько банок из-под пива (не больше 10). Гарри начал простреливать банки по порядку, начиная с самой левой, Ларри — с самой правой. В какой-то момент получилось так, что они одновременно прострелили одну и ту же последнюю банку.
Гарри возмутился и сказал, что Ларри должен ему кучу денег за то, что тот лишил его удовольствия прострелить несколько банок. В ответ Ларри сказал, что Гарри должен ему еще больше денег по тем же причинам. Они стали спорить кто кому сколько должен, но никто из них не помнил сколько банок было в начале, а искать простреленные банки по всей округе было неохота. Каждый из них помнил только, сколько банок прострелил он сам.
Определите по этим данным, сколько банок не прострелил Гарри и сколько банок не прострелил Ларри.
Исходные данные
В единственной строке записано 2 числа — количество банок, простреленных Гарри и Ларри соответственно.
Результат
Выведите 2 числа — количество банок, не простреленных Гарри и Ларри соответственно.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int garry;
        int larry;

        garry = in.nextInt();
        larry = in.nextInt();


        System.out.println((larry-1) + " " + (garry-1));
        in.close();

    }
}
