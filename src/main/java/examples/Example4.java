package examples;

class Car {
    private String brand;

    public Car(String b) {
        this.brand = b;
    }

    public boolean hasTheSameBrand(Car otherCar) {
        return this.brand == otherCar.brand;
    }

    public static void main(String[] args) {
        Car a = new Car("BMW");
        Car b = new Car("BMW");

        System.out.println(a.hasTheSameBrand(b));
        System.out.println(a.brand == b.brand);
    }
}
