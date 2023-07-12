public class Dog {
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSmall() {
        return isSmall;
    }

    public void setSmall(boolean small) {
        isSmall = small;
    }

    public String colour;
    public int size;
    public boolean isSmall;

    public String getAnimalSound() {
        return "The dog says: HauHau";
    }
    private static final int DOG_AGE_RATIO = 7;

    public int getHumanAge() {
        int age = 7;
        return DOG_AGE_RATIO * age;

    }
}