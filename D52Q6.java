public class D52Q6 {
    public static void main(String[] args) {
        Drink[] dr = {
                new Drink("Gomacola", 150),
                new Drink("MrPepper", 130),
                new Drink("SaltWater", 320),
        };
        VendingMachine vm = new VendingMachine(dr);
        vm.display();
        vm.execCom("i 100"); //硬化を自動販売機に投入
        vm.execCom("p 2"); //飲料水を購入
        vm.execCom("i 500");
        vm.execCom("p 3");
        vm.execCom("c 0"); //お釣りを払い出しす
    }
}

class Drink { //飲料水の名前と価格を管理クラス
    private String name;
    private int price;
    Drink(String name, int price) { //名前と価格の文字列を返す
        this.name = name;
        this.price = price;
    }
    public String getName() {return name;}
    public int getPrice() {return price;}
    public String toString() {
        return "[" + name + "]" + price + "円";
    }
}

class VendingMachine { //自動販売機をシミュレートするクラス
    private Drink[] drinks; //販売する飲料水一覧
    private int cash = 0;
    private int[] coins = {500, 100, 50, 10};
    VendingMachine(Drink[] drinks) { //コンストラクタ
        this.drinks = drinks;
    }

    public void display() { //飲料水を順に表示する
        int idx = 1; //1番目からなので初期値は1
        for (Drink drink : drinks) {
            System.out.println("[" + idx + "]" + drink);
            idx++; //商品番号を更新
        }
    }

    public void execCom(String command) { //引数のコマンドを解釈
        String[] s = command.split(" "); //半角スペースで分割
        switch (s[0]) { //コマンドを判定
            case "i": //iコマンドの処理
                if(isCoin(s[1])) cash += Integer.parseInt(s[1]); //金額を加算
                break;
            case "p": //pコマンド処理
                int idx = Integer.parseInt(s[1]) - 1;//指定する番号は1番からだが、配列は0番から始まるから　−1
                if (idx < 0 || idx >= drinks.length) return; //数値情報が１未満
                int price = drinks[idx].getPrice(); //該当する商品の価格をとる
                if(price <= cash) {
                    eject(idx);
                    cash -= price;
                    payChange(); //お釣りを出すメソッド
                } else {
                    System.out.println("お金が足りません");
                }
                break;
            case "c":
                payChange();
                break;
            default:
                break;
        }
    }

    private boolean isCoin(String s) { //自動販売機が受け付ける金額が正しい場合trueを返す
        int c = Integer.parseInt(s);
        for (int coin : coins) {
            if(c == coin) return true;
        }
        return false;
    }

    private void eject(int idx) { //指定された飲料水を排出したメソッド
        System.out.println(drinks[idx] + "が排出されました");
    }

    private void payChange() { //お釣りを払い出す
        if (cash == 0 ) {
            System.out.println("お釣り なし");
            return;
        }

        String s = "お釣り ";
        for (int coin : coins) {
            if (cash / coin > 0) {
                s += coin + "円:" + (cash / coin) + "枚";
                cash %= coin;
            }
        }
        System.out.println(s);
    }
}
