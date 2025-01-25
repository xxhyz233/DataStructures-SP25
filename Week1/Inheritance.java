public class Inheritance {
    // Parent class
    public static class Animal {
        String name;

        // Constructor
        Animal(String name) {
            this.name = name;
        }

        // Method to display basic info
        void eat() {
            System.out.println(name + " is eating.");
        }

        void sleep() {
            System.out.println(name + " is sleeping.");
        }
    }

    // Child class
    public static class Dog extends Animal {

        // Constructor
        Dog(String name) {
            super(name); // Call the constructor of the parent class
        }

        // Method specific to Dog
        void bark() {
            System.out.println(name + " is barking: Woof! Woof!");
        }
    }

    // Main class to test the inheritance
    public static void main(String[] args) {
            // Create an instance of Dog
        Dog myDog = new Dog("Buddy");

            // Call methods from Animal class
        myDog.eat();
        myDog.sleep();

            // Call method from Dog class
        myDog.bark();
    }
}
