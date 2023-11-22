public class Square implements Shape{
    @Override
    public String toString() {
        return "Square{}";
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing a square!");
    }
}
