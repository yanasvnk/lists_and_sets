public class DriverC <С extends Lorry> extends Driver {


    public DriverC(String name, boolean hasLicense, int experience) {
        super(name, hasLicense, experience);
    }
    @Override
    String start() {
        return "Грузовик стартовал";
    }
    @Override
    String stop() {
        return "Грузовик остановился";
    }
    @Override
    String refuel() {
        return "Грузовик заправляется";
    }
    public String getCarMessage (Lorry lorry) {
        return "Водитель " + getName() + " за рулём грузовика " + lorry.getBrand() + ", " + lorry.getModel() + " примет участие в гонке.";
    }

}

