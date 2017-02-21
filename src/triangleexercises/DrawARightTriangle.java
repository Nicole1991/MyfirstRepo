package triangleexercises;

import java.util.Scanner;

/**
 * Created by zhaoqiaoying on 2017/2/20.
 */
public class DrawARightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number:");
        int n = sc.nextInt();
        drawTriangle(n);
    }
    public static void drawTriangle(int n){
        for(int i = 0;i < n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
