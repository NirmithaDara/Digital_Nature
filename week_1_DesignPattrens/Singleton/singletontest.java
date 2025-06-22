package singletonpattern;

public class SingletonTest {
    public static void main(String[] args) {
        
        SingletonExample instance1 = SingletonExample.getInstance();
        instance1.displayMessage();

        
        SingletonExample instance2 = SingletonExample.getInstance();

        if (instance1 == instance2) {
            System.out.println("Both instances are the same (Singleton verified).");
        } else {
            System.out.println("Instances are different (Singleton failed).");
        }
    }
}
