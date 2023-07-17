public class Constructors {
    public static void main(String[] args) {
       
        Dog dog1 = new Dog();
        dog1.print();

        Dog dog2 = new Dog("Cookky", 4);
        dog2.print();

        Dog dog3 = new Dog(dog2);
        dog3.print();

    }

}

class Dog{
    String name;
    int age;

    //default constructor
    public Dog(){
        name = "no name";
        age = 0;
    }

    //parameterized constructor
    public Dog(String name, int age){
        this.name = name;
        this.age =  age;
    }

    //copy constructor
    public Dog(Dog dog){
        this.name = dog.name;
        this.age = dog.age;
    }


    public void print(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

}


