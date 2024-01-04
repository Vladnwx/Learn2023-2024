package lr6;

import java.util.Arrays;
import java.util.Random;

/*
Напишите программу со статическим методом, которому аргументом передается
целочисленный массив и целое число. Результатом метод возвращает ссылку
на новый массив, который получается из исходного массива
(переданного первым аргументом методу), если в нем взять несколько начальных элементов.
Количество элементов, которые нужно взять из исходного массива,
определяются вторым аргументом метода. Если второй аргумент метода больше длины массива,
переданного первым аргументом, то методом создается копия исходного массива
и возвращается ссылка на эту копию.
 */
public class Example6 {

    public static int[] arrResize (int[] arrSource, int c){
        int [] arrresult = new int[c];
if (arrSource.length>c){
    for (int i=0; i<c;i++){
        arrresult[i]=arrSource[i];
    }
} else arrresult = arrSource.clone();
        return arrresult;

    }


    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(5);
        int [] arrSource = new int[r];
        for (int i=0; i<r;i++){
            arrSource[i] = random.nextInt(1000);
        }

        int newSize = 10;

        System.out.println("Ссылка на массив новый: " + arrResize(arrSource, newSize));
        System.out.println("Состав массива:");
        System.out.println(Arrays.toString(arrResize(arrSource, newSize)));

        System.out.println("Ссылка на массив исходный: " + arrSource);
        System.out.println("Состав массива:");
        System.out.println(Arrays.toString(arrSource));


    }
}
