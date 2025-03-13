package oops;

class Polygon{
    public void Render()
    {
        System.out.println("rendering polygon");
    }
}

class Circle extends Polygon
{
    public void render()
    {
        System.out.println("rendering the circle");
    }
}

class Square extends Polygon 
{
    public void render()
    {
        System.out.println("rendering the square..");
    }
}


public class Polymorphism {
    public static void main(String[] args) 
    {
        Circle c = new Circle();
        c.render();

        Square s = new Square();
        s.render();
    }
}
