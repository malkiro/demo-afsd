public class Demo1 {
    public static void main(String[] args) {
        Demo1_Animal animal1 = new Demo1_Animal();
        animal1.name = "blacky";
        animal1.favouriteFood = "chicken";
        animal1.color = "black";
        animal1.leg = 4;

        Demo1_Animal animal2 = new Demo1_Animal();
        animal2.name = "pinky";
        animal2.favouriteFood = "bisciut";
        animal2.color = "white";
        animal2.leg = 2;

        System.out.println(animal1.leg);
    }
}
