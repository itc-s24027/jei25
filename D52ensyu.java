public class D52ensyu {
    public static void main(String[] args) {
        Animal tama = new Cat();
        Animal ao = new Horse();
        Animal a = new Animal();

        tama.bark();
        ao.bark();
        a.bark();
    }
}

class Animal {
    public void bark() {
        System.out.println("動物の鳴き声");
    }
}

class Cat extends Animal {
    @Override
    public void bark() {
        System.out.println("猫の鳴き声");
    }
}

class Horse extends Animal {
    @Override
    public void bark() {
        System.out.println("馬の鳴き声");
    }
}


