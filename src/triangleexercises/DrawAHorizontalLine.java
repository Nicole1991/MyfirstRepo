package triangleexercises;

import java.util.Scanner;

/**
 * Created by zhaoqiaoying on 2017/2/20.
 */
public class DrawAHorizontalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number:");
        int n = sc.nextInt();
        drawLine(n);
	    System.out.println("some little change!");
    }
    public static void drawLine(int n){
        for(int i = 0;i < n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
