package triangleexercises;

import java.util.Scanner;

/**
 * Created by zhaoqiaoying on 2017/2/20.
 */
public class DrawAVerticalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number:");
        int n = sc.nextInt();
        drawLine(n);
    }
    public static void drawLine(int n){
        for(int i = 0;i < n;i++){
            System.out.println("*");
        }
        System.out.println();
    }
}
