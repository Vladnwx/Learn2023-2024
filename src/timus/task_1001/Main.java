package timus.task_1001;

//JUDGE_ID 368360HH

//https://acm.timus.ru/problem.aspx?space=1&num=1001

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputFileName = "src/timus/task_1001/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        byte[] bytes =  System.in.readNBytes(256);
        System.out.println("Text [Byte Format] : " + bytes);
  /*      try{
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine ="";
            String out ="";

            int i=0;
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
            String[] strings = out.split(" ", 100);
            int ccc =strings.length;
            double [] nums = new double[100];
            for (int c=0; c<strings.length;c++) {
                if (strings[c].isEmpty()){
                    nums[c] = -1.0D;
                    continue;
                }
                else {
                    nums[c] = Math.sqrt(Double.parseDouble(strings[c]));
                }
            }

            while(ccc>0) {
                if(nums[ccc-1]>=0){
                String s = String.format("%.4f",nums[ccc-1] );
                System.out.println(s);
                ccc--;}
                else ccc--;
            }
        } catch (IOException exception){
            exception.printStackTrace();
        }*/
    }
}
