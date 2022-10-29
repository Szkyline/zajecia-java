public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.weight = 12.4;
        dog.isAlive = true;
        System.out.println(dog.name);

        dog.feed();

        dog.takeForAWalk();

        Car passerati = new Car("VW", "Passat");
        passerati.milalge = 80000.0;

        System.out.println(passerati.producent);
        System.out.println(passerati.model);
        System.out.println(passerati);
    }
}