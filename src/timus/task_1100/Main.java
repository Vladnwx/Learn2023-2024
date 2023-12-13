package timus.task_1100;
//JUDGE_ID 368360HH
//https://acm.timus.ru/problem.aspx?space=1&num=1100


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1100/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        Scanner in =
                null;
        try {
            in = oj ? new Scanner(System.in) :
                    new Scanner(new FileReader(inputFileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int a;

        a = in.nextInt();
        int[][] arr = new int[a][2];
        for (int i =0; i<a;i++){
                arr[i][0] = in.nextInt();
                arr[i][1] = in.nextInt();
        }

        int max=0, min=0;

        for (int i =0; i<a; i++)
        {
            if (arr[i][1]>max){
                max=arr[i][1];
            }
            else if (arr[i][1]<min){
            min=arr[i][1];
                                    }
        }


        for (int i=0; i<a; i++){
            System.out.print(arr[i][0]+ " "+ arr[i][1] + "\n");
        }






        Integer [] arr2 = new Integer[a];
        for (int i =0; i<a; i++){
            arr2[i]=arr[i][1];
        }
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));

        for (int i=0; i<arr2.length; i++){

        }


    }
}
