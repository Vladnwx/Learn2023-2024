package lr1;
//Напишите программу, в которой пользователю предлагается ввести название месяца и количество дней в этом месяце.
// Программа выводит сообщение о том, что соответствующий месяц содержит указанное количество дней.
public class Example9 {
    public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("Введите название месяца: ");

String s = in.nextline();

System.out.println("Введите количество дней в месяце: ");

int i= in.nextInt();

System.out.println( "Месяц " +s +" " +"Содержит " +i +" дней" );
in.close();




    }
}
