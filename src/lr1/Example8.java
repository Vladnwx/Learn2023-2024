package lr1;

//Напишите программу, в которой Пользователь последовательно вводит название текущего дня недели, название месяца и дату (номер дня в месяце).
// Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).
public class Example8 {

    public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("Введите день недели");

String nameDay = in.nextline();


System.out.println("Введите месяц");

String mounth = in.nextline();

System.out.println("Введите номер дня в месяце");

String day = in.nextline();

System.out.println(nameDay +" " + day +" " +mounth);
 
in.close();

    }
}