package lr4;

/*
Напишите программу, которая выводить в консольное окно прямоугольник,
размеры сторон которого, ширина: 23 колонки, высота: 11 строк;
 */
public class Example1 {
    public static void main(String[] args) {

int a=23, b=11;

for (int i=0; i<b;i++) {
if (i==0 || i==b-1) {
for (int j=0; j<a; j++) {
System.out.print("-");
if (j==a-1) {
    System.out.print("\n");
            }
                        }
                    } else {
    //System.out.println("\n");
    System.out.print("|");
    for (int k=0; k<a-1; k++)     {
        if (k==a-2) {
        System.out.print("|");
            System.out.print("\n");
                        
        } else System.out.print(" ");
                                }
                            }
}

    }
}
