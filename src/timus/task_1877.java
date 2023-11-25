package timus.task_1877;

//JUDGE_ID 368360HH

//https://acm.timus.ru/problem.aspx?space=1&num=1877

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
int a = in.nextInt();
int b = in.nextInt();

if(a>0 & a%2==0) {
System.out.println("yes");
in.close();
return;
} 
else if (a==0){
System.out.println("yes");
in.close();
return;
}
else if(b>0 & b%2>0) {
System.out.println("yes");
in.close();
return;
}
else if (b==1) {
System.out.println("yes");
in.close();
return;
}
else System.out.println("NO");
in.close();
    }
}