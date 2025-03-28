public class Vehicle {
    public String brand;
    public String model;
    public int year;



    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year of Manufacturing: " +year);
    }

    class Car extends Vehicle {
        public void displayInfo() {
            System.out.println("Brand: " +brand);
            System.out.println("Model: " +model);
            System.out.println("Year of Manufacturing: " +year);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Vehicle v = new Vehicle("Toyota", "Camry", 1990 );
            Car c = new Car("Mitsubishi", "Pajero", 1995);

            c.displayInfo();
        }
    }

}
