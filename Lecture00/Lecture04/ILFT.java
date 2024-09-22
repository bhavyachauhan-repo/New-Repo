package Lecture00.Lecture04;

import java.util.Scanner;

public class ILFT {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int k=n;k>=n-i;k--)
                System.out.print(' ');
            for(int j=i;j<=n;j++){
                System.out.print('*');
            }
            System.out.println();
        }

     }
}
