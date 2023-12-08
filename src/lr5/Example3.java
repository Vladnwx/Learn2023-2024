package lr5;

import java.util.Random;

public class Example3 {

        public static class IntCostructor {
            private int i1, i2;

            IntCostructor() {
                Random random = new Random();
                i1 = random.nextInt(1000);
                i2 = random.nextInt(1000);
            }

            IntCostructor(int c1) {
                Random random = new Random();
                i1 = c1;
                i2 = random.nextInt(1000);
            }

            IntCostructor(int c1, int c2) {
                Random random = new Random();
                i1 = c1;
                i2 = c2;
            }

            public void Print() {
                System.out.println("INT1 = " + i1 + " INT2 = " + i2);
            }
        }

        public static void main(String[] args) {
            IntCostructor intConstructor1 = new IntCostructor();
            intConstructor1.Print();
            IntCostructor intConstructor2 = new IntCostructor(1);
            intConstructor2.Print();
            IntCostructor intConstructor3 = new IntCostructor(2, 3);
            intConstructor3.Print();
        }
    }