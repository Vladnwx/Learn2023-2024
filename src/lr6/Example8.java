package lr6;
/*
Напишите программу со статическим методом, аргументом которому
передается целочисленный массив, а результатом возвращается среднее
значение для элементов массива (сумма значений элементов, деленная
на количество элементов в массиве).
 */

import java.util.Random;
import java.util.Arrays;

public class Example8 {
  
  public static int getSrednee(int[] arrInt){
    int result=0;
    
    for (int i=0; i<arrInt.length; i++){
        result += arrInt[i];
    }
    result = result/arrInt.length;
    
    return result;
  }
  
  public static void main(String[] args) {
      
Random random = new Random();
int r = random.nextInt(50);

int[] arrInt = new int[r];

for (int i =0; i<arrInt.length; i++){
    arrInt[i] = random.nextInt(1000);
}
System.out.println("Массив чисел: " + Arrays.toString(arrInt));
System.out.println("Среднее значение = " + getSrednee (arrInt));
  
  }
}