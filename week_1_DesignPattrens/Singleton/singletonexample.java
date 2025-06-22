package singletonpattern;
public class SingletonExample {
    private static SingletonExample uniqueInstance;
    private SingletonExample() {
        System.out.println("Singleton object created.");
    }
    public static SingletonExample getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonExample();
        }
        return uniqueInstance;
    }
    public void displayMessage() {
        System.out.println("This is a method inside the Singleton class.");
    }
}
