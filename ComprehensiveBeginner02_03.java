/*
 * 総合問題_02_03
 * 以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。
 *  1, buyDrink() メソッドを持つ、Coffee クラスを使用する
 *  2, buyDrink() メソッドを持つ、Juice クラスを使用する
 
 *  バヤリース の オレンジ 味です。130 円になります。
 *  午後の紅茶 の レモンティー 味です。150 円になります。
 *  ボス の甘さは 控え目、 ミルク 無しです。 110 円になります。
 *  ジョージア の甘さは 甘め、ミルク 入りです。 120 円になります。
*/

class Juice {
    String name = "商品名";
    
    public void tasteDrink() {
        System.out.print(
            switch (name) {
                case "バヤリース" -> "オレンジ";
                case "午後の紅茶" -> "レモンティー";
                default -> "特定出来ませんでした。";
            }
        );
    }

    public void buyDrink() {
        System.out.print(
            switch (name) {
                case "バヤリース" -> "130";
                case "午後の紅茶" -> "150";
                default -> "特定出来ませんでした。";
            }
        );
    }
}

class Coffee {
        String name = "商品名";

    public void sweetnessDrink() {
        System.out.print(
            switch (name) {
                case "ボス" -> "控え目";
                case "ジョージア" -> "甘め";
                default -> "特定出来ませんでした。";
            }
        );
    }

    public void milkDrink() {
        System.out.print(
            switch (name) {
                case "ボス" -> "無し";
                case "ジョージア" -> "有り";
                default -> "特定出来ませんでした。";
            }
        );
    }

    public void buyDrink() {
        System.out.print(
            switch (name) {
                case "ボス" -> "110";
                case "ジョージア" -> "120";
                default -> "特定出来ませんでした。";
            }
        );
    }
}

public class ComprehensiveBeginner02_03 {

    public static void main(String[] args) {
        Juice a001 = new Juice();
        a001.name = "バヤリース";
        System.out.print(a001.name + "の");
        a001.tasteDrink();
        System.out.print("味です。");
        a001.buyDrink();
        System.out.print("円になります。");
        System.out.println("");

        Juice a002 = new Juice();
        a002.name = "午後の紅茶";
        System.out.print(a002.name + "の");
        a002.tasteDrink();
        System.out.print("味です。");
        a002.buyDrink();
        System.out.print("円になります。");
        System.out.println("");

        Coffee b001 = new Coffee();
        b001.name = "ボス";
        System.out.print(b001.name + "の甘さは");
        b001.sweetnessDrink();
        System.out.print("、ミルク");
        b001.milkDrink();
        System.out.print("です。");
        b001.buyDrink();
        System.out.print("円になります。");
        System.out.println("");

        Coffee b002 = new Coffee();
        b002.name = "ジョージア";
        System.out.print(b002.name + "の甘さは");
        b002.sweetnessDrink();
        System.out.print("、ミルク");
        b002.milkDrink();
        System.out.print("です。");
        b002.buyDrink();
        System.out.print("円になります。");
    }
}