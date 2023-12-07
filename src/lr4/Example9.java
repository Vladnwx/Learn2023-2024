package lr4;
/*
(дополнительная задача). Напишите программу «Шифр Цезаря»,
в которой необходимо реализовать собственный алфавит,
остальные условия идентичны задаче 8.
 */
public class Example9 {

  
  public static void main(String[] args) {
        
      Scanner in = new Scanner (System.in);
        System.out.println("Введите текс для шифрования:");
        String s = "";
        s = in.next();
        System.out.println("Введите ключ:");
        int key = in.nextInt();
        while (key>256){
            key-=256;
        }
        
        int l=s.length();
        
        char[] c = new char[l];
        
        //Генерация алфавита
        
        Random random = new Random();
            char [] alphavit = new char [256];
            for (int i=0; i<256; i++)
        {
            alphavit[i]= (char) random.nextInt(256);
        }
        
        //System.out.println(Arrays.toString(alphavit));
            
        
        
        System.out.println("Текст после преобразования:");
        for (int i=0; i<l; i++){
            c[i] = s.charAt(i);
            int tmp;
            tmp = c [i] + alphavit [i] +key;
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
            int tmp;
            tmp = c[i] - alphavit[i] -key;
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
