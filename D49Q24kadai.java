public class D49Q24kadai {
    public static void main(String[] args) {
        int values[] = {10,20,30,40};
        int sum = 0;

        for (int i= 0; i < values.length; i++){
            sum += values[i];
        }
        System.out.println("配列の合計数:" + sum);
        System.out.println("配列の要素数:" + values.length);
    }
}
