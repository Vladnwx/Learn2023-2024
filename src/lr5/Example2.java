package lr5;

public class Example2 {
        public static class CodeTable {
            private char c1, c2;

            public void printSymbols() {
                for (int i = (int) c1; i <= (int) c2; i++) {
                    System.out.println((char) i + " ");
                }
            }

            public void setChar(char c1, char c2) {
                this.c1 = c1;
                this.c2 = c2;
            }
        }

        public static void main(String[] args) {
            CodeTable codetable = new CodeTable();
            codetable.setChar('A', 'a');
            codetable.printSymbols();
        }
    }