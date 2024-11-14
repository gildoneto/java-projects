public class _01_Classes {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("OUTRO");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        car.describeCar();
    }
}

