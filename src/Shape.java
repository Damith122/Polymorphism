public class Shape {
    void draw(){
        System.out.println("Drawing"); //does not run this method
    }
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Trangle extends  Shape{
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }
}
class Test1{
    public static void main(String[] args) {
        Shape s;
        s= new Rectangle();
        s.draw();
        s =new Circle();
        s.draw();
        s = new Trangle();
        s.draw();

    }
}
