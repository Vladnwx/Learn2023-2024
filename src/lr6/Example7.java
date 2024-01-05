package lr6;
/*
Напишите программу со статическим методом, аргументом которому
передастся символьный массив, а результатом возвращается ссылка
на целочисленным массив, состоящий из кодов символов из массива- аргумента.
 */
import java.util.Random;
import java.util.Arrays;

public class Example7 {

//Нужно добавить больше синтаксичесого схара и отрезать значения связанные с переносм строк и подобных,
//иначе биллибирда нормально не работает, но по условиям задачи этого не требуется
  
  public static int[] getCodes(char[] arrChar){
    
    int[] arrInt = new int[arrChar.length];
      for (int i=0; i<arrChar.length; i++){
      arrInt[i] = arrChar[i];
  }
    return arrInt;
  }
    
  public static void main(String[] args) {
      
      Random random = new Random();
      
      int r = random.nextInt(100);
  
  char[] arrChar = new char[r];
  
  for (int i=0; i<r; i++){
      arrChar[i] = (char) random.nextInt(22 , 255);
  }
  
  System.out.println("Размер массива = " + r);
  System.out.println("Массив символов: " + Arrays.toString(arrChar));
  
  
  int[] arrIntforChar = getCodes(arrChar);
  
  System.out.println("Массив соответствующих кодов символов: " + Arrays.toString(arrIntforChar));
  
    System.out.println("Массив попарных данных символ - код символа ");
  String[][] str = new String[r][2];
  
  for (int i=0; i<r; i++){
      str[i][0]= String.valueOf(arrChar[i]);
      str[i][1]= String.valueOf(arrIntforChar[i]);
  }
  
  for (int i=0; i<r; i++){
      for (int j=0; j<2; j++){
          System.out.print(str[i][j] +" ");
      }
      System.out.print("\n");
  }
  
 
  }
}
