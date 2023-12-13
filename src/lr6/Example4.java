package lr6;

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
        private  int n;
        private int result;
        boolean Chetnost =false;

        private void Sum(){
            if (n%2==0){
                Chetnost = true;
            }
            else Chetnost=false;
        }
        private void Sum1(){
            if (Chetnost==true){
                for (int i=0; i<n;i++){
                    if (i%2==0){
                        result *= (n-i) ;
                    } else continue;
                }
                result*=2;
            }
            else {
                for (int i=0; i<n;i++){
                    if (i%2!=0){
                        result *= (n-i) ;
                    } else continue;
                }
            }
        }

        public static Factorial SetFactorial(int n){
            Factorial factorial = new Factorial();
            return factorial;
        }
        public static void Print ()
        {
            System.out.println(Factorial.class.getSimpleName());
        //    System.out.println("n= " + n);
          //  System.out.println("n!!= " + result);

        }

    }


    public static void main(String[] args) {
Factorial f1 = Factorial.SetFactorial(5);
       // Factorial.SetFactorial(5);
        Factorial.Print();
      //  Factorial.SetFactorial(10);
       // Factorial.Print();

    }
}
