public class Loader {
    public static void main(String[] args) {
        String str = "Hi!";
        Dog cat1 = new Dog();
        System.out.printf("Вес кошки N1: %.2f %n", cat1.getWeight());
        cat1.feed(200.0);
        cat1.woof();
        System.out.printf("Вес кошки N1 после кормежки: %.2f %n", cat1.getWeight());
    }


}
