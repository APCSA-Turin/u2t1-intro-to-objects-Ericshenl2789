public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Sir Wiggles", 2, 22.2);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Not a dog", 5, 10.5);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
