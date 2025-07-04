public class D51Q26kadai {
    public static void main(String[] args) {
        int n = 1;
        String s = "";
        switch (n) {
            case 1:
                s += "one";
                break;
            case 2:
                s += "two";
                break;
            case 3:
                s += "?";
                break;
        }
        System.out.println(s);
    }
}

/*
case とは
if文ののように条件分岐を行うことができる
switch(式) の()内の式の値と一致するcaseが実行される
 */

/*
break とは
ループ文やswitch文の処理を終了させて、ループを抜ける
 */

/*
fall-through とは
switch文において、あるcase文の処理が完了した後、続けて次のcase文の処理も実行してしまう現象
多くの場合はbreak文の書き忘れによって起こるバグ
 */