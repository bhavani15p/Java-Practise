public class oopsConcepts {
    public static void main(String[] args) {

        Person p1 = new Person(); //here p1 is a object created from the 'Person' class.

        p1.setName("Bhavani");
        p1.getName();
        
        p1.setAge(21);
        p1.getAge();

    }
    
}

class Person{ //here Person is a class
    private String name; // name and age are data members
    public int age;

    void setName(String newName){ // setName, setAge, getAge, getName are member functions
        name = newName;
    }

    void getName(){
        System.out.print("Your name is "+ name);
    }

    void setAge(int newAge){
        age = newAge;
    }
    void getAge(){
        System.out.print(" and your age is " + age);
    }
}

/*
 
Quick Revision Notes:
---------------------

                                OOPS Concepts in Java
                            ---------------------------

    --> Object-Oriented Programming  is a methodology or paradigm to design a program 
        using classes and objects.

    --> Class : class is a user-defined data type which define its properties and its functions.

    --> Object: Object is a run-time entity. It is an instance of the class.

    --> Data members: data members is also known as instance variables that store data associated 
        with an object.

    --> Member functions: Also known as methods, defines the behavior that objects of a class can perfom.
        it encapsulates the logic associated with the class.

    --> get: to return the value

    --> set: to modify the value 

    --> "this": this keyword is used to refer to the current object

    --> "static" keyword: The static keyword in Java is used to create variables and methods that are shared by all instances of a class. 
         This means that there is only one copy of the static variable or method, regardless of how many instances of the class are created.


                                Four major pillars of OOPS
                               ----------------------------

           1. Encapsulation
           2. Inheritance
           3. Abstraction
           4. Polymorphism


    [1]. Encapsulation: Encapsulation is defined as the wrapping of data(properties) and methods(functions) under a single unit.
                        It also implements data hiding (done by using access specifiers).  
     
     Packages: 
     ----------
     Package is a group of similar type of classes, interfaces and sub-packages. Packages can be built-in otr user defined.

     Eg: 
               import java.util.*;
               import java.lang.*;
               import java.io.*;

    Access Modifiers in Java:
    -------------------------
    1. Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
    
    2. Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
    
    3. Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
    
    4. Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.


     Constructors:
     --------------

     Constructor is a special method which is invoked automatically at the time of object creation.

     Ex: 
          Pen p1 = new Pen();


          --> Constructors have the same name as class or structure.

          --> Constructors don't have a return type.(not even void)

          --> Constructors are only called once, at object creation.

          --> Memory allocation happens when constructor is called.

     Types of Constructors:
     -----------------------
            
        (1). Default Constructor/non - parameterized constructor
        (2). Parameterized constructor
        (3). Copy Constructor

        1. Default Constructor: 
           --------------------
        
           --> A default constructor is a constructor that has no parameters, it is invoked at the time 
               of creating an object. 
           
           --> If we dont create one then it is created by default for us. 
           
           --> The default constructor initialize all the instance variables of our class to their default values.

        2. Parameterized Constructor:
           --------------------------
           
           --> A parameterized constructor is a constructor that has parameters.

           --> We can use to initialize the instance variables of our class to specific values.

        3. Copy Constructor:
           -----------------

           --> Copy Constructor initialize a new object by copying the values of the instance varaibles
               from another object of the same calss.

           --> Creates a new object with the same values as an existing object.   
           
              shallow copy: reference, changes will reflect to original.

              deep copy: completely copying existing object and creating new object, changes does not reflect to original.

    Destructor:
    -----------
    There is no destructor in java like C++. Instead java uses garbage collector that deallocates memory automatically.


    [2]. Inheritance: Inheritance is when properties and methods of base class are passed on to a derived class.
       
       --> It is a process in which one object acquires all the properties and behaviors of its parent object automaticaly,
           in such a way, you can reuse, extend or modify the attributes and behaviors which are defined in other classes.

       --> The class whose members are inherited from another class is called base class(also known as super class).

       --> The class which inherits the members of another class is called derived class(also known as sub class, extended class, or child child).
           Sub class can add its own fields and methods in addition to superclass fields and methods.

           "extends" keyword: used to indicate that a class is inheriting from another class.

           "super" keyword: The super keyword in Java is used to refer to the parent class of the current class. 
                            It can be used to access the parent class's methods, variables, and constructors.

        Types of Inheritance:
        ---------------------

        1. Single Inheritance
        2. Multi level Inheritance
        3. Hierarchical Inheritance
        4. Hybrid Inheritance

    1. Single Inheritance: sub classes inherits the features of one superclass.

    2. Multi level Inheritance: A derived class will be inheriting a base class and as well as the derived also act as 
       the base class to other class.

    3. Hierarchical Inheritance: One class serves as a superclass(base class) for more than one subclass(derived class).

    4. Hybrid Inheritance(Through Interfaces): It is a mix of two or more of above types of inheritance. Since java doesn't
       support hybrid inheritance. It can be achieved only through interfaces.
    
    5. Multiple inheritance: One class can have more than one superclass and inherit fetures from all parent classes.
       Since java doesn't support multiple inheritance with classes. It can also be achieved through interfaces.

       Why Multiple inheritance are not supported in java?

       To reduce the complexity and simplify the language, multiple inheritance is not supported in java

    [3]. Abstraction: Abstraction means hiding lower-level details and exposing only the essential and relevant details 
         to the users.

         Data binding: Data binding is a process of binding the application UI and business logic. Any change made in the business
         logic will reflect directly to the application UI.

         Abstraction is achieved in 2 ways:
              1. Abstract class
              2. Interfaces (Pure Abstraction) 

         1. Abstract Class:

            --> An abstract class must be declared with an abstarct keyword.
            --> It can have abstract and non-abstract methods.
            --> It cannot be instantiated.
            --> It can have constructors and static methods also.
            --> It can have final methods which will force the subclass not to change the body of the method.

         2. Interfaces: 
            
            Interface is a blueprint of a behaviour and it is a mechanism to achieve 100% abstraction and multiple inheritance.
            It conatins static constants and abstarct methods.
            
            --> All the fields in interfaces are public, static and final by default.
            --> All methods are public & abstract by default.
            --> A class that implements an interface must implement all the methods declared in the interface.
            --> Interfaces support the functionality of multiple inheritance.

            instancof Operator: The instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).

    [4]. Polymorphism: Polymorphism is the ability to present the same interface for differing underlyiing forms(data types).
         With polymorphism, ecah of these classes will have different underlying data.

         Poly means "many" and morphism means "forms"

         Types of Polymorphism:

            1. Compile Time Polymorphism (Static)
            2. Runtime Polymorphism (Dynamic)
        
        1. Compile Time Polymorphism(Static): It is implemented at the compile time. 
           Eg: Method Overloading.

           Method Overloading: It is a technique which allows you to have more than one function with the same function name but with diffrent functionality.
           It is possible on the following basis,

              1. The type of parameters passed to the function.
              2. The number of parameters passed to the function.

        2. Runtime Polymorphism (Dynamic): It is also known as dynamic polymorphism, implemented at runtime.
           Eg: Method Overriding.

           Method Overriding: When the child class contains the method which is already present in the parent class. Hence the child class
           overrides the method of the parent class. In case parent and child classes both contain the same function with a different definition.
           The call to the function is determined at runtime.



     

 */
