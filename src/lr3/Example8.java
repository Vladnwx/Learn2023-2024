package lr3;

import java.util.Arrays;

/*
Напишите программу, в которой создается символьный массив из 10 элементов.
Массив заполнить большими (прописными) буквами английского алфавита.
Буквы берутся подряд, но только согласные (то есть гласные буквы ’ А',1Е' и ' I'
при присваивании значений элементам массива нужно пропустить).
Отобразите содержимое созданного массива в консольном окне.
 */
public class Example8 {
    public static void main(String[] args) {
        char [] arr = new char[10];
        int a = (int) 'A';
        for (int i = 0; i< arr.length; i++)
        {
            for (int c=1; c<10;c++){
                if (((c+a) == (int) 'A') | ((c+a) == (int) 'E') | ((c+a) == (int) 'I') | ((c+a) == (int) 'O') | ((c+a) == (int) 'U') | ((c+a) == (int) 'Y')){
                }
                else {
                    a=a+c;
                    break;
                }
            }
                arr[i]=(char) (a);
        }
        System.out.println(Arrays.toString(arr));
    }
}
