package oops;
abstract class language
{
    public void display()
    {
        System.out.println("Learning ...");
    }
}

class abstractClass extends language
{
    public static void main(String[] args)
    {
        abstractClass obj = new abstractClass();
        obj.display();
    }
}