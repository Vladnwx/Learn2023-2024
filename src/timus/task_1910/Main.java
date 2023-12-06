package timus.task_1910;
//JUDGE_ID 368360HH

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1910/input.txt";
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
a= in.nextInt();
int[] arr = new int[a];

for (int i=0; i<a; i++){
arr[i] = in.nextInt();
}

int result =0, count =0;

for (int i=1; i<a-1; i++)
{
int tmp = arr[i-1] + arr[i] + arr[i+1];

if (tmp>result){
result = tmp;
count = i;
}

}

System.out.println(result + " " + count);
    }
}
