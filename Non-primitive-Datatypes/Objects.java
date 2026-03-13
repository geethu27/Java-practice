class Car {
    String model;;
    int year;

    Car(String mmodel, int year) {
        this.model = mmodel;
        this.year = year;

    }
}

public class Objects {
    public static void main(String[] args) {
        Car myCar = new Car("Honda", 2021);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
    }
}