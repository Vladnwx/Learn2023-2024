package timus.task_1880;
// JUDGE_ID 368360HH

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//https://acm.timus.ru/problem.aspx?space=1&num=1880
public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1880/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        Scanner in =
                null;
        try {
            in = oj ? new Scanner(System.in) :
                    new Scanner(new FileReader(inputFileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
       
        int a, b,c;
        
        a=in.nextInt();
        int [] arrA = new int[a];
        for (int i=0; i<a; i++){
            arrA[i]=in.nextInt();
        }
        b=in.nextInt();
        int [] arrB = new int[b];
        for (int i=0; i<b; i++){
            arrB[i]=in.nextInt();
        }
        c=in.nextInt();
        int [] arrC = new int[c];
        for (int i=0; i<c; i++){
            arrC[i]=in.nextInt();
        }
        int result=0;
        
        for (int i=0; i<a; i++) {
            for (int j=0;j<b; j++){
                for (int k=0; k<c; k++){
                    if (arrA[i]==arrB[j] & arrA[i]==arrC[j])  {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
        }
   }