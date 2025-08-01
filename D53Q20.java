public class D53Q20 {
    public static void main(String[] args) {
        int i = 8;
        float f = 3.27f;

        float n = i + f;
        //　int型 より float型 のほうが表現可能な範囲が広いため、
        // float型 に代入すればエラーにならない
        System.out.println(n);
    }
}
