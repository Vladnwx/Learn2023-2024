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
       // int block =3;
        int count =0;
        int number=0;
        int result=0;
        int [] arr1 = new int[4000];
        int [] arr2 = new int[4000];
        int [] arr3 = new int[4000];

        for (int block =0; block <3; block++){
            count = in.nextInt();
            for (int i=0; i<count; i++){
                number = in.nextInt();
                switch (block) {
                    case 0:
                        arr1[i]=number;
                        break;
                    case 1:
                        arr2[i]=number;
                        break;
                    case 2:
                        arr3[i]=number;
                        break;
                }
                }
            }
        int [] arr11 = new int[4000];
                in.close();
        }



    }

