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

        double[] nums;
        double d=0.0D;
        int i=0;

String out="";

        try{
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine ="";

          while(i<100) {
              readLine = bufferedReader.readLine();

              if (readLine != null) {
                  readLine = readLine.replaceAll("\\s+", " ");
                  out = out + " " + readLine;
                  i++;
              }
              else i++;

          }
            out = out.replaceAll("\\s+", " ");


          int j = out.length();

            nums = new double[j];

          Scanner in =new Scanner(out);

          i=0;
          while (in.hasNextLong()){

              nums[i] = Math.sqrt(in.nextLong());
              i++;
          }
in.close();
            while(i>0) {
                String s = String.format("%.4f",nums[i-1] );
                System.out.println(s);
                i--;}
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}