package lr4;
/*
Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст.
Используете кодовую таблицу символов. При запуске программы в консоль необходимо
вывести сообщение: «Введите текст для шифрования», после ввода текста, появляется
сообщение: «Введите ключ».
После того как введены все данные, необходимо вывести преобразованную строку с сообщением
«Текст после преобразования : ». Далее необходимо задать вопрос пользователю:
«Выполнить обратное преобразование? (y/n)», если пользователь вводит «y»,
тогда выполнить обратное преобразование. Если пользователь вводит «n»,
того программа выводит сообщение «До свидания!». Если пользователь вводит что-то другое,
отличное от «y» или «n», то программа ему выводит сообщение: «Введите корректный ответ».
 */
public class Example8 {

    public static void main(String[] args) {
        
      Scanner in = new Scanner (System.in);
        System.out.println("Введите текс для шифрования:");
        String s = "";
        s = in.next();
        System.out.println("Введите ключ:");
        int key = in.nextInt();
        if (key>255){
            key-=255;
        }
        int l=s.length();
        char[] c = new char[l];
        System.out.println("Текст после преобразования:");
        for (int i=0; i<l; i++){
            c[i] = s.charAt(i);
            int tmp = c[i];
            tmp +=key;
            c[i] = (char) tmp;
            System.out.print(c[i]);
        }
        System.out.println("\nВыполнить обратное преобразование");
        
        char c1;
        while (true){
            System.out.println("Введите \"y\" или \"n\" :");
            c1 = (char) in.next().charAt(0);
        //System.out.println(c);
            if (c1 == 'y'){
                System.out.println("\nТекст после преобразования");
               // System.out.println(s);
                for (int i=0; i<l; i++){
            int tmp = c[i];
            tmp -=key;
            c[i] = (char) tmp;
            System.out.print(c[i]);
        }
                System.out.println("\n");
                return;
               // break;
            } else if(c1== 'n') {
                System.out.println("До свидания!");
            return;
            }
            else System.out.println("Введите корректный ответ");
        }
        
      //  System.out.println("\nДешифрованный текст");
        
    }



}
