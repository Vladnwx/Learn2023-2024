package timus.task_1100;
//JUDGE_ID 368360HH
//https://acm.timus.ru/problem.aspx?space=1&num=1100


import java.io.FileNotFoundException;
import java.io.FileReader;
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
        int N;
        N = in.nextInt();
        int[][] arr = new int[N][2];

        for (int i =0; i<N;i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        

  /*      int count=N;

      while (count>0){
          for (int i=0; i<count-1; i++){
              if (arr[i][1]<arr[i+1][1]){
                  int tmp1 = arr[i+1][1];
                  int tmp2 = arr[i+1][0];
                  arr[i+1][1] = arr[i][1];
                  arr[i+1][0] = arr[i][0];
                  arr[i][1] = tmp1;
                  arr[i][0] = tmp2;
              } else continue;
          }
          count--;

      }

*/
        for (int i=0; i<N; i++){
            System.out.print(arr[i][0]+ " "+ arr[i][1] + "\n");
        }

    }
}
