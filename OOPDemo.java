// OOPDemo.java
// Simple class demonstrating OOP

class Person {
    String name;
    int age;

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alice";
        p.age = 21;
        p.sayHello();
    }
}
