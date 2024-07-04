package section15;

// Abstract class with an abstract method
abstract class My {
    abstract public void show();
}

// Main class
public class Local {
    public static void main(String[] args) {
        // Creating an instance of Outer and calling display method
        Outer o = new Outer();
        o.display();
    }
}

// Outer class with a method that creates an instance of My as an anonymous inner class
class Outer {
    public void display() {
        My m = new My() {
            // Implementing the abstract method
            public void show() {
                System.out.println("Hello");
            }
        };
        // Calling the show method
        m.show();
    }
}
