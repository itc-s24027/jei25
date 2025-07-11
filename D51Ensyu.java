public class D51Ensyu {
    public static void main(String[] args) {

        D51Student std = new D51Student(args[0], args[1]);
        System.out.println("学籍番号：" + std.getid());
        System.out.println("名前：" + std.getName());

    }
}

class D51Student{
        private String id;
        private String name;

        public D51Student(String id, String name){
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String getid() {
            return id;
        }
    }