public class AnimalTest {
    public static void playWithAnimal(Animal animal) {
        animal.move();
        animal.eat();
        animal.sleep();
    }

    public static void main(String[] args) {
        Animal eagle = new Eagle();
        Animal shark = new Shark();
        Animal alligator = new Alligator();

        playWithAnimal(eagle);
        playWithAnimal(shark);
        playWithAnimal(alligator);
    }
}
