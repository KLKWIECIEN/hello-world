public class Bike {
    private String name;
    private int wheel;
    private Boolean isRose;
    private String model;
    private float cost;

    public Bike(String name, int wheel, boolean isRose, String model, float cost) {
        this.name = name;
        this.wheel = wheel;
        this.isRose = isRose;
        this.model = model;
        this.cost = cost;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public Boolean getRose() {
        return isRose;
    }

    public void setRose(Boolean rose) {
        isRose = rose;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", wheel=" + wheel +
                ", isRose=" + isRose +
                ", model=" + model +
                ", cost=" + cost;
    }
}
