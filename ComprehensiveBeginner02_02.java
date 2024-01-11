/*
 * 総合問題_02_02
 * ジャンケンプログラムを作成してください。
 *  1, "ジャンケン"と表示させる
 *  2, "0:グー 1:チョキ 2: パー ＞数字を入力してください" 左記の数字が入力された場合、後続の処理に進み、
 *  3, それ以外の数字が入力された場合、エラーとして説明した後に 1.  に戻るようにする
 *  4, 今までに作成してきたジャンケンプログラムを参考に、ジャンケン処理を実装する
*/

import java.util.Scanner;
import java.util.Random;

public class ComprehensiveBeginner02_02 {

    public static void main(String[] args) {
        System.out.println("ジャンケン");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("0:グー 1:チョキ 2: パー ＞数字を入力してください");
            int pleyer = scanner.nextInt();

            if (pleyer >= 0 && pleyer <= 2) {
                if (pleyer == 0) {
                    System.out.println("あなたはグーを出しました。");
                } else if (pleyer == 1) {
                    System.out.println("あなたはチョキを出しました。");
                } else if (pleyer == 2) {
                    System.out.println("あなたはパーを出しました。");
                }
                janken(pleyer);
                break;
            } else {
                System.out.println("エラーです。");
                System.out.println("入力された数字が違います。");
            }
        }
        scanner.close();
    }
    
    private static void janken(int pleyer) {
        int cpu = new Random().nextInt(3);

        if (cpu == 0) {
            System.out.println("cpuはグーを出しました。");
        } else if (cpu == 1) {
            System.out.println("cpuはチョキを出しました。");
        } else if (cpu == 2) {
            System.out.println("cpuはパーを出しました。");
        }
    
        if (pleyer == 0) {
            if (cpu == 1) {
                System.out.println("あなたの勝ちです");
            } else if (cpu == 2) {
                System.out.println("cpuの勝ちです");
            } else if (cpu == 0) {
                System.out.println("あいこです");
            }
        } else if (pleyer == 1) {
            if (cpu == 1) {
                System.out.println("あいこです");
            } else if (cpu == 2) {
                System.out.println("あなたの勝ちです");
            } else if (cpu == 0) {
                System.out.println("cpuの勝ちです");
            }
        } else if (pleyer == 2) {
            if (cpu == 1) {
                System.out.println("cpuの勝ちです");
            } else if (cpu == 2) {
                System.out.println("あいこです");
            } else if (cpu == 0) {
                System.out.println("あなたの勝ちです");
            }
        }
    }
}
