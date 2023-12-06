package lr4;
/*
Напишите программу, которая выводит в консольное окно прямоугольный треугольник;
 */
public class Example2 {
    public static void main(String[] args) {
        int a=10;

        for (int i=0; i<a; i++){
            switch (i) {
                case 0:
                    System.out.println("|\\");
                    break;
                default:
                    System.out.print("|");
                    for (int j=0; j<i; j++){
                    System.out.print(" ");}
                    System.out.print("\\");
                    System.out.print("\n");
                    break;
                    case 9:{
                    for (int j=0; j<a;j++) {
                        System.out.print("-");
                    }
                    break;}


            }
        }


    }
}
