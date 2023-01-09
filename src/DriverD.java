public class DriverD <D extends Bus> extends Driver {


    public DriverD(String name, boolean hasLicense, int experience) {
        super(name, hasLicense, experience);
    }
    @Override
    String start() {
        return "Автобус стартовал";
    }
    @Override
    String stop() {
        return "Автобус остановился";
    }
    @Override
    String refuel() {
        return "Автобус заправляется";
    }
    public String getCarMessage (Bus bus) {
        return "Водитель " + getName() + " за рулём автобуса " + bus.getBrand() + ", " + bus.getModel() + " примет участие в гонке.";
    }

}