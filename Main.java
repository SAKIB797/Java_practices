class Car {
    private String model;

    // Constructor
    public Car(String model) {
        this.model = model;
    }

    public void getModel() {
        System.out.println(this.model);
    }

    // Method to create and return a new Engine object
    public Engine createEngine() {
        return new Engine();
    }

    // Inner class representing the Engine of the Car
    class Engine {
        public void start() {
            System.out.println("Engine started");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.getModel();
        // Create an Engine object using the createEngine method
        Car.Engine myEngine = myCar.createEngine();
        myEngine.start(); // Output: Engine started
        

    }
    
}
