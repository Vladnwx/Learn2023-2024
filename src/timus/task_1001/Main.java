package timus.task_1001;

//JUDGE_ID 368360HH

//https://acm.timus.ru/problem.aspx?space=1&num=1001

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_1001/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        double[] nums= new double[100];
        long l = 0L;
        double d=0.0D;
        int i=0;

        long c=0;

        int j=0;


        try{
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine ="";

            Scanner in = oj ? new Scanner(new InputStreamReader(System.in)) :
                    new Scanner(new FileReader(inputFileName));

            // while((readLine =bufferedReader.readLine()) != null){
            while((readLine =bufferedReader.readLine()) != null){
                c++;
            }

            while((readLine =bufferedReader.readLine()) == null & j<3){
                j++;
            }
            c = inputFileName.codePoints().filter(Character::isDigit).count();
            while(i<(c+j)){
               // l = Long.parseLong(readLine);
                l = in.nextLong();
                d = Math.sqrt(l);
                nums[i] = d;
                i++;
            }
            while(i>0) {
                String s = String.format("%.4f",nums[i-1] );
                System.out.println(s);
                i--;}
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
