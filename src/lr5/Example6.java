package lr5;

public class Example6 {
    public static class MaxMinInt{
        private int min, max;

        public void setInt(int min, int max){
            if (max>=min && (max>this.max || this.max==0 )) {
                this.max = max;
                if ( min<this.min || this.min==0){
                this.min =min;    
                }
                
            } else if (max<min && ( max<this.min || this.min==0)) {
                this.min = max; 
               if ( min<this.max || this.max==0){
                this.max =min;    
                } 
            } 
        }
        
        
        
        public String getInt(){
            String s = "MIN: " + min + " MAX: " + max;
            return s;
        }
         public void printInt(){
            System.out.println(getInt());
        }
 
    }
  public static void main(String[] args) {
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
            maxMinInt2.setInt(100, 20);
            maxMinInt2.printInt();
            
            
    

  }
}