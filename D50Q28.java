public class D50Q28 {
    public static void main(String[] args) {
        // argsはコマンドラインから渡される文字列の配列
        int[] num = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            // 文字列を整数に変換
            num[i] = Integer.parseInt(args[i]);
        }

        int tmp;
        // 配列の2番目から比較を始める
        for (int i = 1; i < num.length; i++) {
            for (int j = i -1; j >= 0 && num[j] > num[j + 1]; j--) {
                tmp = num[j];
                num[j] = num[j + 1];
                num[j + 1] = tmp;
            }
        }

        for (int val : num) {
            System.out.print(val + " ");
        }
    }
}
