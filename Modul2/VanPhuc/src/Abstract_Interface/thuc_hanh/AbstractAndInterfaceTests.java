package Abstract_Interface.thuc_hanh;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Chicken();
        animal[1] = new Tiger();
        for (Animal animal1 : animal) {
            System.out.println(animal1.makeSound());

            if (animal1 instanceof Chicken) {
                System.out.println(((Chicken) animal1).howToEat());
            }
        }
        Fruit[] fruits=new Fruit[2];
        fruits[0]= new Apple();
        fruits[1]= new Orange();
        for (Fruit fruit: fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
