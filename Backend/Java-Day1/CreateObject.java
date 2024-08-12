import java.util.Scanner;

class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}

public class CreateObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car year: ");
        int year = scanner.nextInt();

        Car car1 = new Car(model, year);
        car1.display();
    }
}
