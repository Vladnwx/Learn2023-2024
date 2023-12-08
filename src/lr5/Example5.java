package lr5;

public class Example5 {
    public static class GeniusInt{
        private int i;
        public void setInt(){
            i=0;
        }
        public void setInt(int i){
            if (i>=100){
                this.i =100;
            } else {
                this.i = i; 
            }
        }
        public GeniusInt(){
            i=0;
        }
        public GeniusInt(int i){
            if (i>=100){
                this.i =100;
            } else {
                this.i = i; 
            }
        }
        public int getInt(){
            return i;
        }
         public void printInt(){
            System.out.println(getInt());
        }
 
    }
  public static void main(String[] args) {
    GeniusInt geniusInt1 = new GeniusInt();
            geniusInt1.printInt();
    GeniusInt geniusInt2 = new GeniusInt(150);
            geniusInt2.printInt();
    GeniusInt geniusInt3 = new GeniusInt(50);
            geniusInt3.printInt();      
    GeniusInt geniusInt4 = new GeniusInt();
            geniusInt4.setInt();
            geniusInt4.printInt();
    GeniusInt geniusInt5 = new GeniusInt();
              geniusInt5.setInt(120);
            geniusInt5.printInt();
    GeniusInt geniusInt6 = new GeniusInt();
            geniusInt6.setInt(20);
            geniusInt6.printInt();       

  }
}