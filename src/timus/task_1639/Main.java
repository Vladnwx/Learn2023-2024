package timus.task_1639;
//https://acm.timus.ru/problem.aspx?space=1&num=1639
// JUDGE_ID 368360HH

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m,n;

        m= in.nextInt();
        n= in.nextInt();

        int result=(m*n)%2;

        // System.out.println(result);

        if (result==0){
            System.out.println("[:=[first]");
        }
        else System.out.println("[second]=:]");

        in.close();
    }

}