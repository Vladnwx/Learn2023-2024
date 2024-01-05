package lr6;
/*
Напишите программу со статическим методом, аргументом которому
передается одномерный символьный массив. В результате вызова метода
элементы массива попарно меняются местами: первый — с последним,
второй — с предпоследним и так далее.
 */
import java.util.*;

public class Example9 {
    
     static boolean CHEATCODE = false;
  
  public static void reverseArray(char[] arrChar){
   if (CHEATCODE){

       List<Character> list = new ArrayList<Character>();
       for (char c: arrChar){
           list.add(c);
       }
      Collections.reverse(list);
       System.out.println("Массив символов перевернутый : \n" + list);
   } 
   else {
       for (int start=0, finish =arrChar.length-1; start<finish; start++, finish--){
           char tmp = arrChar[start];
           arrChar[start] = arrChar[finish];
           arrChar[finish] = tmp;
       }
       System.out.println("Массив символов перевернутый : \n" + Arrays.toString(arrChar));
   }

  }
  
  public static void main(String[] args) {
      
Random random = new Random();
int r = random.nextInt(10, 50);

char[] arrChar = new char[r];

for (int i =0; i<arrChar.length; i++){
    arrChar[i] = (char) random.nextInt(22, 255);
}
System.out.println("Массив символов: \n" + Arrays.toString(arrChar));
reverseArray(arrChar);

  
  }
}

