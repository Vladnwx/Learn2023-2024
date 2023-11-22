package timus.task_1001;

//JUDGE_ID 368360HH

//https://acm.timus.ru/problem.aspx?space=1&num=2100

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_2100/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int marshalAndLili =2;
        try{
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine ="";
            int numberOfFriends =0;
            int numberofPairs=0;
            while((readLine =bufferedReader.readLine()) != null){
                if (numberOfFriends==0){
                    numberOfFriends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")) {
                    numberofPairs++;
                }
            }
            int result;
            int guest = marshalAndLili +numberOfFriends +numberofPairs;
            if(guest== 13){
                result = (guest*100)+100;
            }
            else {
                result = guest*100;
            }
            System.out.println(result);
        } catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
