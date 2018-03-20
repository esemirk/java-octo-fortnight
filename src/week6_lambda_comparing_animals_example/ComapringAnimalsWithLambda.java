package week6_lambda_comparing_animals_example;

import java.util.ArrayList;
import java.util.Comparator;

public class ComapringAnimalsWithLambda {

    static ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Animal cat = new Animal("Missy", 23, 1000);
        Animal Dog = new Animal("Pepsi", 7, 10000);
        Animal horse = new Animal("Grace", 13, 17000);
        animals.add(Dog);
        animals.add(cat);
        animals.add(horse);

        Comparator orderByAgeAscending = (Comparator<Animal>) (Animal o1, Animal o2) -> o1.age - o2.age;

        animals.sort(orderByAgeAscending);

        System.out.println("age Ascending");

        for (Animal a : animals) {
            System.out.println("Age: " + a.age + " Name: " + a.name);
        }
        System.out.println("******************************************\n");

        Comparator orderByAgeDescending = (Comparator<Animal>) (Animal o1, Animal o2)
                -> o2.age - o1.age;

        animals.sort(orderByAgeDescending);

        System.out.println("age Descending");
        for (Animal a : animals) {
            System.out.println("Age: " + a.age + " Name: " + a.name);
        }
        System.out.println("******************************************\n");

        Comparator orderByPriceDescending = (Comparator<Animal>) (Animal o1, Animal o2)
                -> o2.price - o1.price;

        Comparator orderByPriceAscending = (Comparator<Animal>) (Animal o1, Animal o2)
                -> o1.price - o2.price;

    }

}
