package lr5;

public class Example6 {
    public static class MaxMinInt{
        private int min, max;
        public void setInt(int min, int max){
            if (max>=min) {
                if (max>this.max){
                    this.max = max;
                }
                if (min<this.min || this.min==0){
                    this.min = min;
                }
            } else if (min>=max ) {
                if (min>this.max){
                    this.max = min;
                }
                if (max<this.min || this.min==0){
                    this.min = max;
                }
            } 
        }
        public void setInt(int i){
            if (i>this.max){
                this.max = i;
            } else if (i<this.min || this.min==0) {
                this.min = i;
            }
        }
        public String getInt(){
            return "MIN: " + min + " MAX: " + max;
        }
         public void printInt(){
            System.out.println(getInt());
        }

        public MaxMinInt(int i){
            setInt(i);
        }
        public MaxMinInt(int min, int max){
            setInt(min, max);
        }
        public MaxMinInt(){
            this.min=0;
            this.max=0;
        }
 
    }
  public static void main(String[] args) {
            System.out.println("Вывод через методы");

            System.out.println("maxMinInt1 10 20 ");
            MaxMinInt maxMinInt1 = new MaxMinInt();
            maxMinInt1.setInt(10, 20);
            maxMinInt1.printInt();

            System.out.println("maxMinInt1 Update 100 200 ");
            maxMinInt1.setInt(100, 200);
            maxMinInt1.printInt();

            System.out.println("maxMinInt1 Update 5 5 ");
            maxMinInt1.setInt(5, 5);
            maxMinInt1.printInt();

            System.out.println("maxMinInt1 Update 50 500 ");
            maxMinInt1.setInt(50, 500);
            maxMinInt1.printInt();

            System.out.println("maxMinInt1 Update 5000 500 ");
            maxMinInt1.setInt(5000, 500);
            maxMinInt1.printInt();
            
            System.out.println("maxMinInt2");
            MaxMinInt maxMinInt2 = new MaxMinInt();
            System.out.println("maxMinInt2 Update 100 ");
            maxMinInt2.setInt(100);
            maxMinInt2.printInt();

            System.out.println("Вывод через конструкторы");

            System.out.println("maxMinInt3 500");
            MaxMinInt maxMinInt3 = new MaxMinInt(500);
            maxMinInt3.printInt();

            System.out.println("maxMinInt3 500");
            MaxMinInt maxMinInt4 = new MaxMinInt(500, 5);
            maxMinInt4.printInt();
  }
}