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
        private int min, max, middle;
        public void setArr(int... ints){
            Arrays.parallelSort(ints);
            this.min = ints[0];
            this.max = ints[ints.length-1];
            this.middle = ints[(ints.length-1)/2];
        }

        public void Print(){
            System.out.println("MIN = " + min);
            System.out.println("MIDDLE = " + middle);
            System.out.println("MAX = " + max);
        }
    }



    public static void main(String[] args) {

        System.out.println("Передача трех чисел");
        MinMax minmax = new MinMax();
        minmax.setArr(1, 200, 35);
        minmax.Print();

        System.out.println("Передача случайного количества аргументов и заполнение псевдослучайными числами");
        Random random = new Random();

        int r = random.nextInt(1000);

        int[] tmpArr = new int[r];

        for (int i=0; i<r; i++){
            tmpArr[i]=random.nextInt(1000);
        }
        MinMax minmax2 = new MinMax();
        minmax2.setArr(tmpArr);
        minmax2.Print();

    }
}
