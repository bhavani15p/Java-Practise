public class AbstractClass {
    public static void main(String[] args) {
    
    Cat myCat=  new Cat();
    myCat.animalSound();
    myCat.sleep();

    
    Pig myPig = new Pig();
    myPig.animalSound();
    myPig.sleep();

    }

}
abstract class Animal {
  
  public abstract void animalSound();

  public void sleep() {
    System.out.println("Zzz");
  }
}


class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Cat extends Animal {
  public void animalSound() {
    System.out.println("The cat says: meow meow");
  }
}

