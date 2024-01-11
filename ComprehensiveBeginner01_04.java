/*
 * 総合問題_01_04
 * とある美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、20人以上の団体なら一人500円である。
 * 人数を入力し、入場料の合計を計算するプログラムを作成してください。
*/

import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    
    public static void main(String[] args) {
        System.out.println("人数を入力してください＞");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("入場料は");
        if (n < 5) {
            System.out.println(600 * n + "円です");
        } else if (n >= 5 && n < 20) {
            System.out.println(550 * n + "円です");
        } else if (n >= 20) {
            System.out.println(500 * n + "円です");
        }

        scanner.close();
    }    
}
