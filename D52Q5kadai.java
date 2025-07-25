public class D52Q5kadai {
    public static void main(String[] args) {
        String majors = "+----"; //メモリ
        int LIMIT = 400; //整数の上限
        if (args.length == 0) return; //整数が一つも指定されていな場合はプログラムを終了
        int max = 0, i = 0; //初期値を設定
        int[] data = new int[args.length]; //
        for (String s : args) {
            data[i] = Integer.parseInt(s); //整数に変換
            if (data[i] <= 0 || data[i] >= LIMIT) return; //不正値チェック
            if (max < data[i]) { //見出し行を表示するための最大値
                max = data[i];
            }
            i++;
        }

        // メモリ表示
        int majormax = (max - 1) / 10 + 1; //メモリ行の長さを計算 (例：max=194ならmajormax=39)
        System.out.println("       "); //半角スペース7個分
        for (i = 0; i< majormax; i++) {
            System.out.print(majors.charAt(i % 5));
        }
        System.out.println(); //改行

        // グラフ表示
        for (i = 0; i < data.length; i++) {
            System.out.printf("%4d : ", data[i]); //揃えてdata[i]を出力
            int n = (data[i] - 1) / 10 + 1; //13なら3  45なら9
            for (int j = 0; j < n; j++) {
                System.out.print('*'); // 棒グラフの出力
            }
            System.out.println();
        }
    }
}
