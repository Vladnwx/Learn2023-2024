package timus.task_1293;

//JUDGE_ID 368360HH

//lr1

//https://acm.timus.ru/problem.aspx?space=1&num=1293

/*
1293. Эния
Ограничение времени: 1.0 секунды
Ограничение памяти: 64 МБ
Неспокойно сейчас на стапелях шестого дока межгалактического порта планеты Торна.
Всего через месяц закончится реконструкция малого броненесущего корвета «Эния».
И снова этому боевому кораблю и его доблестной команде предстоят тяжёлые бои за контроль
над плутониевыми рудниками Сибелиуса. Работа не прекращается ни на секунду, лазерные
сварочные аппараты работают круглые сутки. От непрерывной работы плавятся шарниры
роботов-ремонтников. Но задержаться нельзя ни на секунду.
И вот в этой суматохе обнаруживается, что термозащитные панели корвета вновь требуют
срочной обработки сульфидом тория. Известно, что на обработку одного квадратного метра
панели требуется 1 нанограмм сульфида. Всего необходимо обработать N прямоугольных панелей
размером A на B метров. Вам необходимо как можно скорее подсчитать, сколько всего сульфида
необходимо на обработку всех панелей «Энии». И не забудьте, что панели требуют обработки с обеих сторон.
Исходные данные
Единственная строка содержит целые числа N (1 ≤ N ≤ 100), A (1 ≤ A ≤ 100), B (1 ≤ B ≤ 100).
Результат
Выведите вес необходимого для обработки сульфида тория в нанограммах.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, n;

        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();

        System.out.println(n*2*a*b);
        in.close();
    }
}
