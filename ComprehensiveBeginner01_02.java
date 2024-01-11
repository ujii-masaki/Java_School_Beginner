/*
 * 総合問題_01_02
 * 整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）に並んでいるか判定し、
 * 小さい順に並んでいる場合はOK、そうなっていない場合はNGと表示するプログラムを作成してください。
 */

import java.util.Scanner;

public class ComprehensiveBeginner01_02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("整数を3つ、昇順に入力してください＞");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a <= b) {
            if (b <= c) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        } else {
            System.out.println("NG");
        }

        scanner.close();
    }
}
