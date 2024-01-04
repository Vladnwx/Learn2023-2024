package lr6;

import java.util.Random;

/*
Напишите программу, в которой описан статический метод для
вычисления двойного факториала числа, переданного аргументом методу.
По определению, двойной факториал числа п (обозначается как n!!) —
это произведение через одно всех чисел, не больших числа п.
То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1
для нечетного п и равен 2 для четного n).
Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
 */
public class Example4 {

    public static class Factorial {
        private static int n;
        private static int result;
        static boolean Chetnost =false;

        private static void CheckChetnost(int n){
            if (n%2==0){
                Chetnost = true;
            }
            else Chetnost=false;
        }

        public static void SetFactorial(int c){
           n = c;
            CheckChetnost(n);
            ResultFactorial();
        }

        public static void ResultFactorial(){
           if (Chetnost){
               ResultFactorialChetniy();
           }
           else ResultFactorialNEChetniy();
        }

        public static void ResultFactorialChetniy(){
            result=1;
            int c=0;
            while(n-c>=2){
                result = result*(n-c);
                c+=2;
            }
        }
        public static void ResultFactorialNEChetniy(){
            result=1;
            int c=0;
            while(n-c>=1){
                result = result*(n-c);
                c+=2;
            }
        }


        public static void Print ()
        {
            System.out.println("Четность - " + Chetnost);
            System.out.println(n + "!! = " + result);
        }

    }

    public static void main(String[] args) {

        Random random = new Random();
        int r = random.nextInt(10,15);
        System.out.println("Количество вычисляемых факториалов = " + r);
        Factorial[] factorials = new Factorial[r];

        for (int i=0; i<r; i++){
            int c = random.nextInt(5,10);
            Factorial.SetFactorial(c);
            Factorial.Print();
        }

        Factorial.SetFactorial(6);
        Factorial.Print();
        Factorial.SetFactorial(5);
        Factorial.Print();

    }

    }
