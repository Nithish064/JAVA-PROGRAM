class Animal {
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}

    class Dog extends Animal {
        public void display() {
            System.out.println("Name : " + name);
        }
    }


public class sample {
    public static void main(String[] args) {
        Dog laborator = new Dog();
        laborator.name = "rohu";
        laborator.display();
        laborator.eat();
    }

}
