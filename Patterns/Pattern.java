package Patterns;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int num = 5;
        // for(int i=0;i<=num;i++){
        // for(int j=0;j<=i;j++){
        // System.out.print(num);
        // num--;
        // }
        // Sys tem.out.println();
        // }
        for (int i = num; i >= 1; i--) {
            for (int j = num; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}