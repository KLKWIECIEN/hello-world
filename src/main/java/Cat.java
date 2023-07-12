public class Cat {
    private Object age;

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
    private int size;
    public boolean isSmall;


    public String getAnimalSound() {
        return "The cat says: MiauMiau";
    }
    private static final int CAT_AGE_RATIO = 9;

    public int getHumanAge() {
        int age = 9;
        return CAT_AGE_RATIO * age;
    }
}


