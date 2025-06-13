import java.util.Arrays;

public class D50Q5kadai {
    public static void main(String[] args) {
        int[] num = new int[args.length]; // 配列を作成しておく

        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]); // int型に変換
        }

        int tmp;
        for(int i = 1; i< num.length; i++) {
            for(int j= i-1; j >= 0 && num[j] > num[j+1]; j--) {
                tmp = num[j];     // 交換している
                num[j] = num[j+1]; // 交換している
                num[j+1] = tmp; // 交換している
                System.out.print("ソート途中:");
                for (int val: num) {// 拡張for文
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }

        System.out.println("-------------------");
        System.out.print("ソート結果:");
//        System.out.println(Arrays.toString(num));
        for (int val: num) {// 拡張for文
            System.out.print(val + " ");
        }
    }
}
