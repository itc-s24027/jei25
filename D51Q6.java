import java.util.Comparator;

public class D51Q6 {
    public static void main(String[] args) {
        Item[] li = {
                new Item("AA", "魚類"),
                new Item("BB", "肉類")};
        Item[] si = {
                new Item("A1", "さば"),
                new Item("A2", "さんま"),
                new Item("B1", "牛肉"),
                new Item("B2", "鶏肉"),
                new Item("B3", "豚肉"),
                new Item("B4", "加工肉")};
        ItemMaster im = new ItemMaster(li, si);
        String lcode = args[0].substring(0,2);
        String scode = args[0].substring(2, 4);
        String datails = args[0].substring(4);

        String lname = im.getItemName(im.MAJOR, lcode); //大分類コードから商品名を取り出す
        String sname = im.getItemName(im.MINOR, scode); //小分類コードから商品名を取り出す
        System.out.println("商品コード:" + args[0]);
        System.out.println("大分類名:" + lname);
        System.out.println("小分類名:" + sname);
        System.out.println("詳細コード:" + datails);
    }
}

class Item { // 項目を記録するためのクラス
    private String code;
    private String name;
    Item(String code, String name) { //コンストラクタ
        this.code = code;
        this.name = name;
    }
    public String getCode() { return code; }
    public String getName() { return name; }
}

class ItemMaster {
    public int MAJOR = 0;
    public int MINOR = 1;
    private Item[][] items;
    ItemMaster(Item[] major, Item[] minor) { // コンストラクタ
        items = new Item[2][]; // MAJOR=0 MINOR=1 の2分類と決まっているため
        items[MAJOR] = major;
        items[MINOR] = minor;
    }

    public String getItemName(int codeLevel, String code) {
        for (int i = 0; i < items[codeLevel].length; i++) {
            if (code.equals(items[codeLevel][i].getCode())) { // 指定のコードと一致したら
                return items[codeLevel][i].getName();
            }
        }
        return "(不明)";
    }
}
