public class DriverB <B extends Car> extends Driver {

    DriverB(String name, boolean hasLicense, int experience) {
        super(name, hasLicense, experience);
    }
    @Override
    String start() {
        return "Машина стартовала";
    }
    @Override
    String stop() {
        return "Машина остановилась";
    }
    @Override
    String refuel() {
        return "Машина заправляется";
    }
    public String getCarMessage (Car car) {
        return "Водитель " + getName() + " за рулём автомобиля " + car.getBrand() + ", " + car.getModel() + " примет участие в гонке.";
    }
}

