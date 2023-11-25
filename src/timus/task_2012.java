package timus.task_2012;

//JUDGE_ID 368360HH

//https://acm.timus.ru/problem.aspx?space=1&num=2012

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int tasks=12;
int hours =5;
int interval =45;
int minutes =hours*60;
int firstHours= 60;
        int a = 0;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
int result = minutes - firstHours -(tasks -a)*interval;

if(result>0) {System.out.println("YES");}
else System.out.println("NO");
in.close();
    }
}