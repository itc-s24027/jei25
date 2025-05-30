public class D50Q18kadai {
    public static void main(String[] args) {
        int num = 0;
        while (num++ < 10) {
            System.out.println(num);
            // 0は評価に使われたら表示される前に1になってしまう
        }
    }
}
