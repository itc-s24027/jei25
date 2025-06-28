public class D51Q21kadai {
    public static void main(String[] args) {
        int a = 0b1101;
        // 2進数 : 0b1101　-> 8*1 + 4*1 + 2*0 + 1*1 = 13
        // 各桁に2の累乗をかける　-> 2の3乗　2の2乗　2の1乗　2の0乗(2の0乗 = 1)
        int b = 0x33;
        // 16進数 : 0x33 -> (16 * 3) + 3 = 51
        System.out.println(a + b);
        //13 + 51 = 64

    }

}
