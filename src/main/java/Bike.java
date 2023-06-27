public class Bike {
    private String name;
    private int wheel;
    private Boolean isRose;
    private String model;
    private float cost;

    public String getName() {
        return name;
    }

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
}