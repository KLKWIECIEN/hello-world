public class Animal {
    public String getAnimalSound() {
        return "The animal makes a sound" ;
    }
    public static void makeSound (Animal animal) {
    System.out.println(animal.getAnimalSound());
    }
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
