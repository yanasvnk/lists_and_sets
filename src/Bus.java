import java.util.Objects;

public class Bus extends Transport {
    private final int pitStopTime;
    private final int bestLapTime;
    private final int maxSpeed;
    private Capacity capacity;

    public Bus (String brand, String model, int engineCapacity, int pitStopTime, int bestLapTime, int maxSpeed, Capacity capacity) {
        super(brand, model, engineCapacity);


        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Модель - " + getModel()+ ", бренд - " + getBrand() + ", объём двигателя - " + getEngineCapacity() + ".";
    }
    @Override
    public int hashCode(){
        return Objects.hash (getModel(), getBrand(), getEngineCapacity());
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = capacity.getFrom()==0? "": " от " + capacity.getFrom();
            String to = capacity.getTo()==0? "": " до " + capacity.getTo() + " мест";
            System.out.println("Вместимость -" + from + to);
        }
    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + getModel() + " починен.");
    }
}