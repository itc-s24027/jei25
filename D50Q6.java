public class D50Q6 {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        if(max < min) {
            int tmp = max;
            max = min;
            min = tmp;
        }
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.initializePrimeNumbers(max);
        int[] part = primeNumbers.getPart(min, max);

        for (int prime : part) {
            System.out.printf("%d, ", prime);
        }
    }
}

class PrimeNumbers {
    boolean[] isPrimeNumbers;

    void initializePrimeNumbers(int max) {
        isPrimeNumbers = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isPrimeNumbers[i] = true; // trueで初期化
        }
         for (int p = 2; p <= Math.sqrt(max); p++) { //
             if(isPrimeNumbers[p]) {
                 for (int m = p * 2; m <= max; m += p) {
                     isPrimeNumbers[m] = false;
                 }
             }
         }
    }
    int[] getPart(int min, int max) { //素数判定配列から素数を抜き出し、結果を配列で返す
        int count = 0;
        for (int n = min; n <= max; n++) { // 範囲内にある素数の数をカウント
            if(isPrimeNumbers[n]) {
                count++;
            }
        }
        int[] part = new int[count]; // 配列partの作成、要素数はcount
        int index = 0;
        for (int n= min; n <= max; n++) {
            if(isPrimeNumbers[n]) {
                part[index++] = n;
            }
        }
        return part;
    }
}
