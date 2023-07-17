
public class HierarchicalInheritance {
    public static void main(String[] args) {

        Pigeon pijjie = new Pigeon();
        pijjie.fly();
        pijjie.layEggs();

        Peacock peafowl = new Peacock();
        peafowl.fly();
        peafowl.layEggs();
        peafowl.beauty();

        Eagle hunter = new Eagle();
        hunter.fly();
        hunter.layEggs();
        hunter.eye();
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

class Peacock extends Bird {
    public void beauty() {
        System.out.println("A work of art!");

    }
}

class Eagle extends Bird {
    public void eye(){
        System.out.println("Shap eyesight!");
    }
}
