package lr6;
/*
Напишите программу с классом, в котором есть закрытое статическое
целочисленное ноле с начальным нулевым значением.
В классе должен быть описан статический метод, при вызове которого
отображается текущее значение статического поля, после чего
значение поля увеличивается на единицу.
 */
public class Example2 {

    public static class CouterOut{
        private static int i=0;
        public static void printToConsole(){
            System.out.println("Текущее значение счетчика вывода: " + i);
            i++;
        }
    }
    public static void main(String[] args) {

        CouterOut.printToConsole();

        CouterOut.printToConsole();

        CouterOut.printToConsole();

        CouterOut.printToConsole();

        CouterOut.printToConsole();


    }
}
