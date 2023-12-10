package lr6;
/*
Напишите программу с классом, в котором есть два поля:
символьное и текстовое. В классе должен быть перегруженный
метод для присваивания значений полям. Если метод вызывается
с символьным аргументом, то соответствующее значение присваивается
символьному полю. Если метод вызывается с текстовым аргументом,
то он определяет значение текстового ноля. Методу аргументом также
может передаваться символьный массив. Если массив состоит из одного
элемента, то он определяет значение символьного поля. В противном
случае (если в массиве больше одного элемента) из символов массива
формируется текстовая строка и присваивается значением текстовому полю.
 */
public class Example1 {

    private static class TextWrapper{

        char c;
        String s;

        public void setTextWrapper(char c){
            this.c =c;
        }
        public void setTextWrapper(String s){
            this.s =s;
        }

        public void setTextWrapper(char[] c){
            if (c.length==1){
                this.c =c[0];
            } else {
                this.s =String.valueOf(c);
            }
        }

        public String getc (){
            return String.valueOf(c);
        }
        public String gets (){
            return s;
        }

        public void getAll(){
            System.out.println("c = " + getc() + "\n" + "s = " + gets());
        }
    }

    public static void main(String[] args) {
        System.out.println("Передача символа");
        TextWrapper textWrapper1 = new TextWrapper();
        textWrapper1.setTextWrapper('a');
        textWrapper1.getAll();

        System.out.println("Передача строки");
        TextWrapper textWrapper2 = new TextWrapper();
        textWrapper2.setTextWrapper("ЭТО СТРОКА");
        textWrapper2.getAll();

        System.out.println("Передача массива символов");
        char [] arrchar = {'Э', 'Т','О',' ','М','А','С','С','И','В',' ','С','И','М','В','О','Л','О','В'};
        TextWrapper textWrapper3 = new TextWrapper();
        textWrapper3.setTextWrapper(arrchar);
        textWrapper3.getAll();

    }
}
