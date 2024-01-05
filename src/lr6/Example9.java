package lr6;
/*
Напишите программу со статическим методом, аргументом которому
передается одномерный символьный массив. В результате вызова метода
элементы массива попарно меняются местами: первый — с последним,
второй — с предпоследним и так далее.
 */
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class Example9 {
    
     static boolean CHEATCODE = true;
  
  public static void reverseArray(char[] arrChar){
   if (CHEATCODE){
       
       Collections.reverse(Arrays.asList(arrChar));
       
   } 
   else {
       
       
   }

  }
  
  public static void main(String[] args) {
      
Random random = new Random();
int r = random.nextInt(50);

char[] arrChar = new char[r];

for (int i =0; i<arrChar.length; i++){
    arrChar[i] = (char) random.nextInt(1000);
}
System.out.println("Массив символов: \n" + Arrays.toString(arrChar));
//reverseArray(arrChar);
 Collections.reverse(Arrays.asList(arrChar));
System.out.println("Массив символов перевернутый : \n" + Arrays.toString(arrChar));
  
  }
}

