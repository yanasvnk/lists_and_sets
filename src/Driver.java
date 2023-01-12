public abstract class Driver {
    private final String name;
    private final boolean hasLicense;
    private final int experience;

    protected Driver(String name, boolean hasLicense, int experience) {
        this.name = name;
        this.hasLicense = hasLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean HasLicense() {
        return hasLicense;
    }

    public int getExperience() {
        return experience;
    }

    abstract String start();
    abstract String stop();
    abstract String refuel();

}
