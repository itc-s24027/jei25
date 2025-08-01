public class D53Q25kadai {
    public static void main(String[] args) {
//        char[] ch = {'A', 'B', 'C'};
//        String s1 = new String("ABC");
//        String s2 = new String(ch);

        // インスタンスを別で生成するとアドレスが違うため
        // == で比較するとfalseになる
        // 両方ともtrueにするにはs1とs2の参照を同じにする必要がある
        String s1 = "ABC";
        String s2 = "ABC";

        boolean b1 = s1 == s2;
        boolean b2 = s1.equals(s2);

        System.out.print(b1 + " + " + b2);
    }
}
