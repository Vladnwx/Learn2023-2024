package timus.task_1877;

//JUDGE_ID 368360HH

//https://acm.timus.ru/problem.aspx?space=1&num=1877

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
int a = in.nextInt();
int b = in.nextInt();

//System.out.println(a);
//System.out.println(b);

//System.out.println(a%2);
//System.out.println(b%2);

if(a%2==0 & a<10000) {
System.out.println("yes");
in.close();
return;
} 

else if(b%2>0 & b<10000) {
System.out.println("yes");
in.close();
return;
}
else {System.out.println("no");
in.close();
return;}

    }
}