package week6_lambda_comparing_animals_example;

public class Animal implements Comparable<Animal> {

    String name;
    Integer age;
    Integer price;

    public Animal(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\nprice" + price + "\n";
    }

    @Override
    public int compareTo(Animal o) {
        return o.age.compareTo(this.age);
    }

}
