public class D53Q5 {
    private static int[] taxes = {8,10}; // 食品とその他の消費税率を格納
    private static int FOODS = 0; // 食品等
    private static int OTHER = 1; // その他
    public static void main(String[] args) {
        int dataSize = Integer.parseInt(args[0]); // データ数
        String[] names = new String[dataSize]; // 商品名
        int[] prices = new int[dataSize]; //単価
        int[] nums = new int[dataSize]; //数量
        char[] types = new char[dataSize]; // タイプ

        int argsIdx = 1;
        for (int i = 0; i < dataSize; i++) {
            names[i] = args[argsIdx++];
            prices[i] = Integer.parseInt(args[argsIdx++]);
            nums[i] = Integer.parseInt(args[argsIdx++]);
            types[i] = args[argsIdx++].charAt(0);
        }

        System.out.println("商品名\t 税抜\t 税込み\t タイプ");
        for (int i = 0; i < dataSize; i++) {
            int zeinuki = prices[i] * nums[i]; //税抜価格
            int zeikomi, taxType; // 税込価格、タイプによる税率の違い
            taxType = types[i] == 'f' ? FOODS : OTHER;
            zeikomi = zeinuki * (taxes[taxType] + 100) / 100;
            System.out.print(names[i] + "\t" + zeinuki + "円\t");
            System.out.println(zeikomi + "円\t" + viewType(types[i]));
        }
    }

    private static String viewType(char c) {
        return c == 'f'? "食品等" : "その他";
    }
}
