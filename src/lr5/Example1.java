//
public static class User {
        
        private char symbol;
        
        public void setSymbol (String symbol)
        {
            this.symbol = (char) symbol.charAt(0);
        }
        
        public char getSymbol ()
        {
            return symbol;
        }
        
         public void printSymbol ()
        {
            System.out.println("Символ: " + getSymbol());
        }
        
         public void printValue ()
        {
            System.out.println("Код символа: " + (int) getSymbol());
        }
        
        
        public int getValue ()
        {
            return (int) symbol;
        }
        
        
        public void printSymbolAndValue ()
        {
            System.out.println("Символ: " + getSymbol() + " Код символа: "  + (int) getSymbol());
        }
        
        
    }
  
  
  public static void main(String[] args) {
    
    
    
    User user = new User();
    user.setSymbol("a");
    user.printSymbol();
    user.printSymbolAndValue();
    
  }