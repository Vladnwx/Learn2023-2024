import java.util.Random;
import java.lang.Math;

public class Main
{
    public static class CharAndInt{
        private int i;
        private char c;
 
 CharAndInt (){
     Random random = new Random();
     i = random.nextInt(1000);
     c = 'a';
 }
 CharAndInt (double d){
     this.i =  (int) Math.floor(Math.abs(i));
     String s = String.valueOf(d%1);
    // System.out.println(s);
     s = s.substring(2, 4);
    // System.out.println(s);
     int k = (int) Integer.parseInt(s);
     this.c = (char) k;
 }
 CharAndInt (int i, char c){
     Random random = new Random();
     this.i = i;
     this.c = c;
 }
 public void Print (){
     System.out.println("INT = " + i + " CHAR = " + c);
 }
    }
  public static void main(String[] args) {
  CharAndInt charAndInt1 = new CharAndInt();
  charAndInt1.Print();
  CharAndInt charAndInt2 = new CharAndInt(112.75);
  charAndInt2.Print();
  CharAndInt charAndInt3 = new CharAndInt(2, 'T');
  charAndInt3.Print();
  }
}