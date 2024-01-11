/*
 * 総合問題_01_03
 * 2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し、
 * 2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成してください。
*/

import java.util.Scanner;

public class ComprehensiveBeginner01_03 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2次方程式 ax^2 + bx + c = 0 の係数a, b, c を入力");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        System.out.println("");
        System.out.println("2次方程式の解は");

        int ans = b * b - (4 * a * c);

        if (ans > 0) {
            System.out.println("2つの実数解");
        } else if (ans == 0) {
            System.out.println("重解");
        } else {
            System.out.println("2つの虚数解");
        }

        scanner.close();
    }
}
