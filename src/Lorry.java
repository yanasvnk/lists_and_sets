public class Lorry extends Transport {
    private final int pitStopTime;
    private final int bestLapTime;
    private final int maxSpeed;
    private LiftCapacity liftCapacity;

    public Lorry (String brand, String model, int engineCapacity, int pitStopTime, int bestLapTime, int maxSpeed, LiftCapacity liftCapacity) {
        super(brand, model, engineCapacity);


        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
        this.liftCapacity = liftCapacity;
    }

    public LiftCapacity getLiftCapacity() {
        return liftCapacity;
    }

    public void setLiftCapacity(LiftCapacity liftCapacity) {
        this.liftCapacity = liftCapacity;
    }

    @Override
    public String toString() {
        return "Модель - " + getModel()+ ", бренд - " + getBrand() + ", объём двигателя - " + getEngineCapacity() + ".";
    }

    @Override
    public void printType() {
        if (liftCapacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = liftCapacity.getFrom()==null? "": " от " + liftCapacity.getFrom();
            String to = liftCapacity.getTo()==null? "": " до " + liftCapacity.getTo() + " тонн";
            System.out.println("Грузоподъёмность -" + from + to);
        }
    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + getModel() + " починен.");
    }
}
