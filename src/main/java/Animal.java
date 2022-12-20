public class Animal implements Comparable<Animal>{
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public int compareTo(Animal animal) {
        return getName().compareTo(animal.getName());
    }
    @Override
    public String toString(){return String.valueOf(name);}
}
