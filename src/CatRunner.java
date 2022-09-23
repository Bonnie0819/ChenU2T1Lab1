public class CatRunner {
    public static void main (String [] args) {
        Cat cat1 = new Cat("Fish", 10,20.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("hehe", 5,15.2);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
