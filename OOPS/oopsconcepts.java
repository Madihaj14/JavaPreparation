public class oopsconcepts {
    /*
OBJECT ORIENTED PROGRAMMING SYSTEMS (OOPS) - JAVA

Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects.
It simplifies software development and maintenance by providing some concepts defined below:
*/

// 1. CLASS AND OBJECT

/*
Class:
A user-defined data type which defines its properties and functions.
Class is the only logical representation of the data.
Example: Human being is a class. The body parts are its properties, and the actions performed are functions.
The class does not occupy memory space until an object is instantiated.

Object:
A run-time entity. It is an instance of the class.
An object can represent a person, place, or any item.
An object can operate on both data members and member functions.
*/

// Example 1: Class and Object
class Student {
    String name;
    int age;

    public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
    }
}

/*
public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;
        s1.getInfo();

        Student s2 = new Student();
        s2.name = "Shradha";
        s2.age = 22;
        s2.getInfo();
    }
}
*/

// Example 2: Another Class Example
class Pen {
    String color;

    public void printColor() {
        System.out.println("The color of this Pen is " + this.color);
    }
}

/*
public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.color = "blue";

        Pen p2 = new Pen();
        p2.color = "black";

        Pen p3 = new Pen();
        p3.color = "red";

        p1.printColor();
        p2.printColor();
        p3.printColor();
    }
}
*/

/*
Note: When an object is created using the new keyword, space is allocated for the variable in the heap, and the starting address is stored in the stack memory.

'this' keyword: Refers to the current instance of the class.
- Pass the current object as a parameter to another method
- Refer to the current class instance variable
*/

// 2. CONSTRUCTORS

/*
Constructor:
A special method invoked automatically at the time of object creation.
Used to initialize the data members of new objects. (A constructors looks like a method but it has no return type)
Characteristics:
- Constructors have the same name as the class.
- Constructors don’t have a return type (not even void).
- Constructors are only called once, at object creation. So everytime an object is created, a constructor is called.
Types:
1. Non-Parameterized constructors
2. Parameterized constructors
3. Copy Constructors
*/

// Non-Parameterized Constructors Example
class Student1 {
    String name;
    int age;

    Student1() {
        System.out.println("Constructor called");
    }
}

// Parameterized Constructors Example
class Student2 {
    String name;
    int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Copy Constructors Example
class Student3 {
    String name;
    int age;

    Student3(Student3 s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

/*
Note: Unlike C++, Java has no Destructor. Instead, Java has an efficient garbage collector that deallocates memory automatically.
*/

// 3. POLYMORPHISM

/*
Polymorphism: The ability to present the same interface for differing underlying forms (data types).
Types:
1. Compile Time Polymorphism (Static) - Method Overloading
2. Runtime Polymorphism (Dynamic) - Method Overriding
*/

// Method Overloading Example
class Student4 {
    String name;
    int age;

    public void displayInfo(String name) {
        System.out.println(name);
    }

    public void displayInfo(int age) {
        System.out.println(age);
    }

    public void displayInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}

// Runtime Polymorphism Example (Method Overriding)
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2.0)*b*h);
    }
}
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

// 4. INHERITANCE

/*
Inheritance: A process in which one object acquires all the properties and behaviors of its parent object automatically.
Types:
1. Single Inheritance
2. Hierarchical Inheritance
3. Multilevel Inheritance
4. Hybrid Inheritance
*/

// Single Inheritance Example
class Shape1 {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle1 extends Shape1 {
    public void area(int h, int b) {
        System.out.println((1/2.0)*b*h);
    }
}

// Hierarchical Inheritance Example
class Shape2 {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle2 extends Shape2 {
    public void area(int h, int b) {
        System.out.println((1/2.0)*b*h);
    }
}
class Circle2 extends Shape2 {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

// Multilevel Inheritance Example
class Shape3 {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle3 extends Shape3 {
    public void area(int h, int b) {
        System.out.println((1/2.0)*b*h);
    }
}
class EquilateralTriangle extends Triangle3 {
    int side;
}

/*
Hybrid inheritance is a combination of simple, multiple inheritance and hierarchical inheritance.
*/

// 5. PACKAGE

/*
Package: A group of similar types of classes, interfaces, and sub-packages.
Built-in packages: java, util, io, etc.

import java.util.Scanner;
import java.io.IOException;
*/

// 6. ACCESS MODIFIERS

/*
Private: Access only within the class.
Default: Access only within the package.
Protected: Access within the package and outside the package through child class.
Public: Access everywhere.
*/

// Example of Access Modifiers
/*
package newpackage;

class Account {
    public String name;
    protected String email;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }
}
public class Sample {
    public static void main(String args[]) {
        Account a1 = new Account();
        a1.name = "Apna College";
        a1.setPassword("abcd");
        a1.email = "hello@apnacollege.com";
    }
}
*/

// 7. ENCAPSULATION

/*
Encapsulation: The process of combining data and functions into a single unit called class.
Attributes are kept private and public getter and setter methods are provided to manipulate these attributes.
Thus, encapsulation makes the concept of data hiding possible.
*/

// 8. ABSTRACTION

/*
Abstraction: Hiding the unnecessary details & showing only the essential parts/functionalities to the user.
Achieved in 2 ways:
1. Abstract class
2. Interfaces (Pure Abstraction)
*/

// Abstract Class Example
abstract class Animal {
    abstract void walk();
    void breathe() {
        System.out.println("This animal breathes air");
    }
    Animal() {
        System.out.println("You are about to create an Animal.");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Wow, you have created a Horse!");
    }
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Wow, you have created a Chicken!");
    }
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

/*getters and setters can be used to access private variables in the abstract class
example showing the use of getters and setters in an abstract class*/

class Human extends Animal {
    private String name;
    private int age;

    Human(String name) {
        this.name = name;
    }

    void walk() {
        System.out.println("Human walks on 2 legs");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    } 

}

/*
public class OOPS {
    public static void main(String args[]) {
        Horse horse = new Horse();
        horse.walk();
        horse.breathe();
    }
}
*/

// Interface Example
interface Animal2 {
    void walk();
}

class Horse2 implements Animal2 {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken2 implements Animal2 {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

/*
public class OOPS {
    public static void main(String args[]) {
        Horse2 horse = new Horse2();
        horse.walk();
    }
}
*/

// 9. STATIC KEYWORD

/*
Static can be:
- Variable (class variable)
- Method (class method)
- Block
- Nested class
*/

// Static Example
class Student5 {
    static String school;
    String name;
}

/*
public class OOPS {
    public static void main(String args[]) {
        Student5.school = "JMV";
        Student5 s1 = new Student5();
        Student5 s2 = new Student5();

        s1.name = "Meena";
        s2.name = "Beena";

        System.out.println(s1.school);
        System.out.println(s2.school);
    }
}
*/
}
