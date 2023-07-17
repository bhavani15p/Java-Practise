public class MultilevelInheritance {
    public static void main(String[] args) {
        Peacock peafowl = new Peacock();
        peafowl.fly();
        peafowl.layEggs();
        peafowl.feathers();
        peafowl.beauty();

    }
}

class Bird {
    public void fly() {
        System.out.println("flying high...");
    }

    public void layEggs() {
        System.out.println("Lays eggs, new beginnings!");

    }

}

class Pigeon extends Bird {
    public void feathers() {
        System.out.println("Colorful feathers, dazzle our eyes");
    }
}

class Peacock extends Pigeon {
    public void beauty() {
        System.out.println("A work of art!");

    }
}