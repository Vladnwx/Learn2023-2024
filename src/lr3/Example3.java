package lr3;

import org.graalvm.nativeimage.c.struct.SizeOf;

import java.util.Arrays;
import java.util.Scanner;

/*
Напишите программу, которая выводит последовательность чисел Фибоначчи.
Первые два числа в этой последовательности равны 1,
а каждое следующее число равно сумме двух предыдущих
(получается по-следовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
Количество чисел в последовательности вводится пользователем.
Предложите версии программы, использующие разные операторы цикла.
 */
public class Example3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long a=0, b=0, c=0, result;

        System.out.println("Введите целое число - количество цифр в последовательности Фибонначи");
        if (in.hasNextLong())
        {
            a= in.nextLong();
        } else {System.out.println("Вы ввели не чиcло или число выходящее за" + "9 223 372 036 854 775 807");
            return;
        }
        System.out.println("Числа Фибоначчи черз for");
        for (int i=0; i<=a; i++)
        {
            if (i>2)
            {
                result = b+c;
                System.out.print("," + result );
                b=c;
                c=result;

            }
            else {
                if (i==0) System.out.print(1);
                if(i==1) {System.out.print("," +1);
                b=1;
                c=1;}
            }
        }
        System.out.println("\nЧисла Фибоначчи черз while");
        int i=0;
        while (i<=a){
            if (i>2)
            {
                result = b+c;
                System.out.print("," + result );
                b=c;
                c=result;
                i++;
            }
            else {
                if (i==0) {System.out.print(1);};
                if(i==1) {System.out.print("," +1);
                    b=1;
                    c=1;
                }
                i++;
            }
        }
        System.out.println("\nЧисла Фибоначчи черз массив");

        long [] arr = new long[(int) a];

for (int k =0; k<a; k++){
    if (k>1) {
        arr[k]=arr[k-1]+arr[k-2];
    }
    else if (k==0) arr[k]=1;
    else if (k==1) arr[k]=1;
}
        System.out.println(Arrays.toString(arr));
    }
}
