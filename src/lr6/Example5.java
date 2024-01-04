package lr6;
/*
Напишите программу со статическим методом, которым вычисляется
сумма квадратов натуральных чисел 12 + 22 + 32 + ... + п2.
Число п передается аргументом методу. Для проверки результата
можно использовать формулу
12 + 22 +32+…+n2=(n+l) (2n + 1)/6
 */
public class Example5 {

    public static long summaSquare(int n){
       int i=1;
       long result=0;
       while (i<=n){
           result = result+i*i;
           i++;
       }

       return result;
    }

    public static void main(String[] args) {

        int n=8; //Числонатуральных чисел

        System.out.println("Вычисление: ");
        System.out.println(summaSquare(n));

        System.out.println("Проверка по формуле: ");
        int j=n*(n+1)*(2*n+1)/6;
        System.out.println(j);

    }
}
