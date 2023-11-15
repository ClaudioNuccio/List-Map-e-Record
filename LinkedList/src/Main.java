import java.util.ArrayList;
import java.util.LinkedList;

public class Main{
    public static void main (String [] args){
        LinkedList<Fruit> fruits = new LinkedList<>();
        Fruit fruit1 = new Fruit("Apple");
        Fruit fruit2 = new Fruit("Banana");
        Fruit fruit3 = new Fruit("Peach");
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);
        System.out.println(fruits);
        Fruit fruit4 = new Fruit("Pear");
        Fruit fruit5 = new Fruit("Cherry");
        fruits.addFirst(fruit4);
        fruits.addLast(fruit5);
        System.out.println(fruits);
    }
}
