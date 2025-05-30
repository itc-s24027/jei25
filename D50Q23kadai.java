public class D50Q23kadai {
    String code;
    public static void main(String[] args) {
        D50Q23kadai obj = new D50Q23kadai();
        String code = obj.setCode("Code");
        System.out.println(code);
    }

    String setCode(String c) {
        code = c;
        return code;
    }
}
