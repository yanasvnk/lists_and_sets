public class Car extends Transport {

    private final int pitStopTime;
    private final int bestLapTime;
    private final int maxSpeed;
    private TypeOfBody typeOfBody;

    public Car(String brand, String model, int engineCapacity, int pitStopTime, int bestLapTime, int maxSpeed, TypeOfBody typeOfBody) {
        super(brand, model, engineCapacity);


        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public String toString() {
        return "Модель - " + getModel()+ ", бренд - " + getBrand() + ", объём двигателя - " + getEngineCapacity() + ".";
    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова - " + typeOfBody);
        }
    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + getModel() + " починена.");
    }

}