    // polymorphism with method overriding

    class Shape{
    void draw(){System.out.println("drawing...");}
    }
    class Rectangle extends Shape{
    void draw(){System.out.println("drawing rectangle...");}
    }
    class Circle extends Shape{
    void draw(){System.out.println("drawing circle...");}
    }
    class Triangle extends Shape{
    void draw(){System.out.println("drawing triangle...");}
    }
    class TestShapePolymorphism{
    public static void main(String args[]){
    Shape s; // create object for parent class

    s=new Rectangle();  // upcasting
    s.draw();

    s=new Circle();
    s.draw();

    s=new Triangle();
    s.draw();
    }
    }
