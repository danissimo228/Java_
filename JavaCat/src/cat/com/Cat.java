package cat.com;

public class Cat {
    float sumfeed = 0;
    String name;
    int age;
    float weight;
    String sex;
    final float minweight = 0.2f;
    final float maxweight = 20.0f;
    final int eyes = 2;

    private static int count;

    public Cat(String name, int age, float weight, String sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public String getSex() {
        return sex;
    }

    public void showCat() {
        System.out.println
                (
                        "Your cat: \n" +
                        "name: " + getName() + "\n" +
                        "age: " + getAge() + "\n" +
                        "weight: " + getWeight() + "\n" +
                        "sex: " + getSex() + "\n" +
                        "The number of eyes a cat has: " + eyes + "\n" +
                        "Color is: " + CatColor.Grey.name()
                );
    }

    public void eat() {
        if (weight > maxweight || weight < minweight) {
            System.out.println("The " + getName() + " is died");
        }else {
            sumfeed += 0.5f;
            setWeight(weight + 0.5f);
            System.out.println("The " + getName() + " has eaten!");
        }
    }

    public void drink() {
        if (weight > maxweight || weight < minweight) {
            System.out.println("The " + getName() + " is died");
        }else {
            setWeight(weight + 0.5f);
            System.out.println("The " + getName() + " has drank!");
        }
    }

    public void pee() {
        if (weight > maxweight || weight < minweight) {
            System.out.println("The " + getName() + " is died");
        }else {
            setWeight(weight - 0.4f);
            System.out.println("The " + getName() + " went to the toilet");
        }
    }

    public void totalFeed() {
        System.out.println("Total amount of feed eaten " + getName() + ": " + sumfeed + " kg");
    }
}
