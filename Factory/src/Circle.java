public class Circle implements Shape{
    @Override
    public String toString() {
        return "Circle{}";
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing a circle!");
    }
}
