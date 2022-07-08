package cat.com;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 2, 17.4f, "male");
        Cat cat2 = new Cat("Barsik", 2, 17.4f, "male");
        Cat ca3t = new Cat("Barsik", 2, 17.4f, "male");
        Cat cat4 = new Cat("Barsik", 2, 17.4f, "male");
        Cat cat5 = new Cat("Barsik", 2, 17.4f, "male");
        cat.showCat();
        cat.eat();
        cat.eat();
        cat.eat();
        cat.eat();
        cat.showCat();
        cat.totalFeed();

        System.out.println(cat.getCount());
        System.out.println(Cat.getCount());
    }
}