package lr6;

import java.util.Arrays;
import java.util.Random;

/*
Напишите программу с классом, в котором есть статические методы,
которым можно передавать произвольное количество целочисленных
аргументов (или целочисленный массив). Методы, на основании переданных
аргументов или массива, позволяют вычислить: наибольшее значение,
наименьшее значение, а также среднее значение из набора чисел.
 */
public class Example3 {

    public static class MinMax {
        private static int min, max, middle;
        public static void setArr(int... ints){
            Arrays.parallelSort(ints);
            min = ints[0];
            max = ints[ints.length-1];
            middle = ints[(ints.length-1)/2];
        }

//        public static void setArr(int[] arr){
//            Arrays.parallelSort(arr);
//            min = arr[0];
//            max = arr[arr.length-1];
//            middle = arr[(arr.length-1)/2];
//        }

        public void Print(){
            System.out.println("MIN = " + min);
            System.out.println("MIDDLE = " + middle);
            System.out.println("MAX = " + max);
        }
    }



    public static void main(String[] args) {

        System.out.println("Передача трех чисел");
        MinMax minmax1 = new MinMax();
        minmax1.setArr(1, 200, 35);
        minmax1.Print();

        System.out.println("Передача случайного количества элементов массива и заполнение массива псевдослучайными числами");
        Random random = new Random();

        int r = random.nextInt(1000);
        System.out.println("Число переданных аргументов = " + r);
        int[] tmpArr = new int[r];

        for (int i=0; i<r; i++){
            tmpArr[i]=random.nextInt(1000);
        }
        MinMax minmax2 = new MinMax();
        minmax2.setArr(tmpArr);
        minmax2.Print();

        System.out.println("Передача десяти чисел чисел");
        MinMax minmax3 = new MinMax();
        minmax3.setArr(1, 200, 35, 800, 500, 412, 25, 84 , 456, 279);
        minmax3.Print();

    }
}
