/*
 * 総合問題_02_01
 * スロットマシーンプログラムを作成してください。
 *  1, "ゾロ目で大当たり！チャンスは30回"と表示させる
 *  2, "begin と入力してください> " と入力すると、開始するようにする
 *  3, ランダムな3つの自然数を、"〇回目：xxx" というように表示させる
 *  4, 大当たり(ゾロ目)"〇回目で大当たりです。おめでとうございます！" と表示させる
 *  5, 30回のうちに大当たりが出なかった場合、"残念でした。終わります。" と表示させる
*/

import java.util.Scanner;
import java.util.Random;

public class ComprehensiveBeginner02_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ゾロ目で大当たり!チャンスは30回");

        while (true) {
            System.out.print("begin と入力してください> ");
            String inpuString = scanner.nextLine();
            
            if (inpuString.equals("begin")) {
                break;
            } else {
                System.out.println("再入力してください");
            }
        }
        surotto();
        scanner.close();
    }

    private static void surotto() {
        for (int i = 0; i < 30; i++) {
            int a = new Random().nextInt(9) + 1;
            int b = new Random().nextInt(9) + 1;
            int c = new Random().nextInt(9) + 1;
            System.out.println( i + 1 + "回目：" + a + b + c);

            if (a == b && a == c) {
                System.out.println(i + 1 + "回目で大当たりです。おめでとうございます！");
                break;
            } else if (i == 29) {
                System.out.println("残念でした。終わります。");
            }
        }
    }
}
