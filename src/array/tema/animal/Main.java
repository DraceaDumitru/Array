package array.tema.animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animal behaviors ");
        Animal animal =new Animal();
        animal.sleep();
        animal.walk();
        animal.eat();
        animal.makeSounds();
        System.out.println();
        System.out.println("Dog :");
        Dog dog = new Dog();
        dog.walk();
        dog.eat();
        dog.sleep();
        dog.makeSounds();
        System.out.println();
        System.out.println("Cat");
        Cat cat = new Cat();
        cat.walk();
        cat.eat();
        cat.sleep();
        cat.makeSounds();
        System.out.println();
        System.out.println("Cat test behavior");
        Animal catTest = new Animal();
        catTest.walk();
        catTest.eat();
        catTest.sleep();
        catTest.makeSounds();
        System.out.println();

    }
}
