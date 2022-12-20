import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Monkey");
        Animal animal2 = new Animal("Cat");
        Animal animal3 = new Animal("Dog");
        Animal animal4 = new Animal("Mouse");
        Animal animal5 = new Animal("Wolf");

       ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(animal1, animal2, animal3, animal4, animal5));
        Collections.sort(animals);

        for (Animal i: animals) {
            System.out.println(i);
        }


    }
}
