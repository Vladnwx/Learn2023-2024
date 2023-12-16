package timus.task_1001;

//JUDGE_ID 368360HH

//https://acm.timus.ru/problem.aspx?space=1&num=1001

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputFileName = "src/timus/task_1001/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        Scanner in = null;

        try {
            in = oj ? new Scanner(System.in) : new Scanner(new FileReader(inputFileName));

        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        double[] d = new double [256*1024];
        int c=0;
        while (in.hasNextLong()){
            d[c] = Math.sqrt(in.nextLong());
            c++;
        }
        for (int i=c-1; i>=0; i--){
            System.out.println(String.format("%.4f", d[i]));
        }
    }
}
