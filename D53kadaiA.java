public class D53kadaiA {
    public static void main(String[] args) {
        int a = 0;
        if (args.length == 0) {
            System.out.println("Empty argument");
        } else {
            for (String arg : args) {
                a += Integer.parseInt(arg);
            }
            System.out.println("合計："+a);
        }
    }
}
