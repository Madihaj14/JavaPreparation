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
Any class we use in java belongs to a package. 

Object:
A run-time entity. It is an instance of the class.
An object can represent a person, place, or any item.
An object can operate on both data members and member functions.

*/

/*
Naming Convention for java programming:
1. Class name should start with an uppercase letter.
2. If multiple words are used to name a class, then each new word should start with an uppercase letter (CamelCase).
3. Class name should be relevant to the functionality of the class.
4. No special characters or spaces should be used in the class name.
5. class and interface names should start with an uppercase letter.
6. variable and method names should start with a lowercase letter.
7. constant names should be in uppercase letters.
8. keywords should not be used as class names.
9. Class names, method names, and variable names cannot be the same as Java reserved keywords.
10. keywords are case sensitive.
11. CamelCase notation should be used for class names and method names.
12. A constructor name should be the same as the class name.
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

/*Anonymous Object: If an object is not assigned to a reference variable, it is known as an anonymous object.
Example: new Student().getInfo();
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

    public Student1() {
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

//Super Keyword: Refers to the immediate parent class object.
// It is used to access parent class variables and methods.
// It can also be used to invoke parent class constructor.

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent {
    Child() {
        super(); // Invoking parent class constructor
        System.out.println("Child Constructor");
    }
}

// 3. POLYMORPHISM

/*
Polymorphism: The ability to present the same interface for differing underlying forms (data types).
Poly - Many
Morphism - Behaviour
Types:
1. Compile Time Polymorphism (Static) - Method Overloading
    When a class has multiple methods with the same name but different parameters (different type or number of parameters).
    That is, when the behavior of a method is determined at compile time, it is known as compile time polymorphism.

2. Runtime Polymorphism (Dynamic) - Method Overriding
    When a subclass has a method with the same name and same parameters as a method in its superclass.
    That is, when the behavior of a method is determined at runtime, it is known as runtime polymorphism.
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

//Dynamic Method Dispatch Example
class Shape4 {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle4 extends Shape4 {
    public void area() {
        System.out.println("Area of Triangle");
    }
}
class Circle4 extends Shape4 {
    public void area() {
        System.out.println("Area of Circle");
    }
}

/* Dynamic Method Dispatch: The process in which a call to an overridden method is resolved at runtime rather than compile-time.
It is also known as runtime polymorphism.
public class OOPS {     
    public static void main(String args[]) {
        Shape4 s;
        s = new Triangle4(); // Upcasting
        s.area();

        s = new Circle4(); // Upcasting
        s.area();
    }
}
/*

/* 
Final Keyword: Used to restrict the user.The final keyword can be used with variables, methods, and classes.
Examples:
1. Final Variable: A variable declared with the final keyword is a constant variable, and its value cannot be changed once initialized. (Basically, making a variable constant)
2. Final Method: A method declared with the final keyword cannot be overridden by subclasses. (Basically, preventing/stopping method overriding)
3. Final Class: A class declared with the final keyword cannot be subclassed. (Basically, preventing/stopping inheritance)

*/

// 4. INHERITANCE

/*
Inheritance: A process in which one object acquires all the properties and behaviors of its parent object automatically.
Why it is used? To reduce redudndancy in your code.
Types:
1. Single Inheritance
2. Hierarchical Inheritance
3. Multilevel Inheritance
4. Hybrid Inheritance
*/

// Single Inheritance Example
class Shape1 {    //parent class
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle1 extends Shape1 {     //child class
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
Every class in Java is by default a subclass of Object class. 
That means Object class is the parent class of all the classes in Java.
So, Object class is the super class of all the classes in Java.
*/

/*
Hybrid inheritance is a combination of simple, multiple inheritance and hierarchical inheritance.
*/

// 5. PACKAGE

/*
Package: A group of similar types of classes, interfaces, and sub-packages.
Built-in packages: java, util, io, etc.
User-defined packages: Can be created by the user.
To use a package in your program, you need to import it using the import keyword.

For Example:
    - import java.util.*; // imports all the classes from the util package
    - import java.util.Scanner; // imports only the Scanner class from the util package
    - import java.io.IOException; // imports only the IOException class from the io package

Any class we use in java belongs to a package. 
    - If we do not import any package, then the class belongs to the default package.
    - The default package contains classes that are automatically imported by the Java compiler.
    - The default package is also known as the unnamed package.
    - It is not a good practice to use the default package in your program.
    - It is better to create your own package and use it in your program.
To create a user-defined package, use the package keyword at the top of your Java source file.
For Example:
    - package mypackage; // creates a package named mypackage
    - package com.apnacollege; // creates a package named com.apnacollege
By default, every java file has some package imported in it, like java.lang package.
*/

// 6. ACCESS MODIFIERS

/*
Private: Access only within the class.
Default: Access only within the package.
Protected: Access within the package and outside the package through child class.
Public: Access everywhere.

You cannot have 2 public classes in a single file.
Try to keep your class public, so that it can be accessed from anywhere.
If a class is not declared public, it is accessible only within the package.
Try to keep instance variables private, so that they cannot be accessed directly from outside the class.
If an instance variable is not declared private, it can be accessed directly from outside the class.
If a class is declared public, the file name should be the same as the class name.
If a class is not declared public, the file name can be different from the class name.
Try to avoid using default access modifier, as it can be accessed only within the package.
If a class is declared protected, it can be accessed only within the package and outside the package through child class.

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
1. Abstract class: Can have both abstract and non-abstract methods. You cannot create an object of an abstract class.
- Abstract methods are declared without an implementation.
- If a class has at least one abstract method, then the class must be declared abstract.
- A subclass of an abstract class must implement all the abstract methods of the parent class, or else it must be declared abstract.
- An abstract class can have constructors and static methods also. 

2. Interfaces (Pure Abstraction): Can have only abstract methods (until Java 7). From Java 8 onwards, it can have default and static methods also.
- All the methods in an interface are implicitly abstract and public.
- A class can implement multiple interfaces, but it can extend only one class.
- An interface cannot have instance variables. The variables in an interface are implicitly public, static, and final. 
- You cannot create an object of an interface.
Types of Interface:
1. Normal Interface: An interface that contains only abstract methods.
2. Marker Interface: An interface that contains no methods. It is used to mark a class for a specific purpose.
3. Functional Interface: An interface that contains only one abstract method. It can have multiple default and static methods. It is used in lambda expressions.
- From Java 8 onwards, interfaces can have default and static methods.
- Default methods are declared using the default keyword and have a body.
- Static methods are declared using the static keyword and have a body.
- A class that implements an interface must implement all the abstract methods of the interface, or else it must be declared abstract.
- An interface can extend another interface, but a class cannot extend an interface.
- An interface can extend multiple interfaces.
- A class can implement multiple interfaces.
- An abstract class can implement an interface, but an interface cannot implement a class.

*/

/*class --> class --> extends
interface --> interface --> extends
class --> interface --> implements
interface --> class --> Not possible
*/

/*
Note: An abstract class can have instance variables and concrete methods, but an interface cannot have instance variables and can have only abstract methods (until Java 7).
Inner Class: A class defined within another class.
Types of Inner Class:
1. Non-static Inner Class (Instance Inner Class): Can access all the members of the outer class, including private members.
2. Static Inner Class (Static Nested Class): Can access only static members of the outer class.
3. Local Inner Class: Defined within a method of the outer class. Can access all the members of the outer class, including private members.
4. Anonymous Inner Class: A class without a name, defined and instantiated in a single statement.

 */

//Interface vs Abstract Class
/*
- An interface can only have abstract methods (until Java 7).
- An abstract class can have both abstract and concrete methods.
- A class can implement multiple interfaces, but it can extend only one abstract class.
- An interface cannot have instance variables, while an abstract class can have instance variables.
- An interface is a contract that a class must follow, while an abstract class can provide some default behavior.
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

//Interfaces Example
abstract class Computer //interface can also be used here (interface Computer)
{
    public abstract void code();
}
class Laptop extends Computer //interface can also be used here (implements Computer)
{

    public void code() 
    {
        System.out.println("code, compile and run");
    }
}
class Desktop extends Computer //interface can also be used here (implements Computer)
{
    public void code() 
    {
        System.out.println("code, compile and run: faster");
    }
}
class Developer 
{
    public void develop(Computer lap) 
    {
        lap.code();
    }
}
public class OOPS
{
    public static void main(String args[]) 
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer madiha = new Developer(); //interface can also be used here (Developer madiha = new Developer();)
        madiha.develop(lap);
        madiha.develop(desk);
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

/*
Type Casting: Converting a variable of one data type to another data type. 
There are 2 types of type casting:
1. Widening (Implicit) Type Casting: Converting a variable of a smaller data type to a larger data type.
Example: int to float, char to int, etc.
2. Narrowing (Explicit) Type Casting: Converting a variable of a larger data type to a smaller data type.
Example: float to int, int to char, etc.
Example of Type Casting 
public class OOPS {
    public static void main(String args[]) {
        // Widening Type Casting
        int a = 10;
        float b = a; // int to float
        System.out.println(b);

        // Narrowing Type Casting
        float x = 10.5f;
        int y = (int)x; // float to int
        System.out.println(y);
    }


//UPCASTING AND DOWNCASTING
It is related to Inheritance and Polymorphism. It is used to achieve Runtime Polymorphism.
It is basically used to refer to the parent class object by the child class reference variable and vice-versa.

For Example:
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class OOPS {
    public static void main(String args[]) {
        Animal a;
        Dog d = new Dog();
        Cat c = new Cat();

        // Upcasting
        a = d;
        a.sound(); // Dog barks

        a = c;
        a.sound(); // Cat meows

        // Downcasting
        Animal a2 = new Dog();
        Dog d2 = (Dog) a2;
        d2.sound(); // Dog barks
    }

 */

 

 /*WRAPPER CLASSES
Wrapper classes are used to convert primitive data types into objects.
For Example: int to Integer, char to Character, etc.
Autoboxing: Converting a primitive data type to a wrapper class object automatically.
Unboxing: Converting a wrapper class object to a primitive data type automatically.
parseInt: It is a feature by wrapper class where string to int conversion is done.
public class OOPS {
    public static void main(String args[]) {
        // Autoboxing
        int a = 10;
        Integer i = a; // int to Integer
        System.out.println(i);

        // Unboxing
        Integer j = new Integer(20);
        int b = j; // Integer to int
        System.out.println(b);

        // parseInt
        String s = "30";
        int c = Integer.parseInt(s); // String to int
        System.out.println(c);
    }
}

*/

/*
 Enumeration (enum) is a special data type that enables for a variable to be a set of predefined constants.
The variable must be equal to one of the values that have been predefined for it.
Usually if-else and switch-case iis used with enums but we prefer switch-case as they look better in case of enums.
Enums are used when we know all possible values at compile time, such as choices on a menu, rounding modes, command line flags, etc.
Enums are defined using the enum keyword.
Enums can have constructors, methods, and variables.
By default, enums are static and final.
*/
//For Example:
public class OOPS {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String args[]) {
        Day day = Day.WEDNESDAY;

        switch (day) {
            case SUNDAY:
                System.out.println("It's Sunday!");
                break;
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            case THURSDAY:
                System.out.println("It's Thursday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday!");
                break;
        }
    }
}


/*
Annotations: A form of metadata that provides data about a program but is not part of the program itself.
Annotations have no direct effect on the operation of the code they annotate.
They can be used to provide information to the compiler, to generate code, or to provide runtime processing.
For Example:
@interface MyAnnotation {
    String value();
    int number() default 0;
}
public class OOPS {
    @MyAnnotation(value = "Hello", number = 5)
    public void myMethod() {
        System.out.println("This is my method");
    }
}

*/


}
