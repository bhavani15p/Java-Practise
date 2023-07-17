public class DeepCopyAndShallowCopy {
    public static void main(String[] args) {

        Person person1 = new Person(1, "Bhavani");

        //shallow copy example : just referencing
        Person person2 = person1;

        //changing the name in the "person2" also reflects to "person1"
        person2.name = "Kavana";
        System.out.println(person1.name);

        //deep copy example : completely copying and creating new object
        Person person3 = new Person(person1.id, person1.name);

        //changing the name in the "person3" does not reflects to "person1"
        person3.name = "Liki";
        System.out.println(person3.name);

    }
    
}
class Person{
    int id;
    String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}
