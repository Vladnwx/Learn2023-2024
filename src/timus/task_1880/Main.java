package timus.task_1880;
// JUDGE_ID 368360HH
//https://acm.timus.ru/problem.aspx?space=1&num=1880

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

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

        int[] arr = new int[a+b+c];

        for (int i=0; i<arr.length; i++){
            if (i<a){
                arr[i]=arrA[i];
            } else if (i<a+b) {
                arr[i]=arrB[i-a];
            } else {
                arr[i]=arrC[i-a-b];
            }
        }

       // System.out.println(Arrays.toString(arr));

        Arrays.parallelSort(arr);

      //  System.out.println(Arrays.toString(arr));

        for (int i=1; i<arr.length-1; i++)
        {
            if (arr[i-1]==arr[i+1] && arr[i]==arr[i+1]){
                result++;
            }
        }

        System.out.println(result);
        }
   }