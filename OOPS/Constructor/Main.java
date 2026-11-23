class Dog{
    String  name;
    void bark() {
        System.out.println(name + "bark");
    }
    public class Main{
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.name = "Rocky";
        obj.bark();
    }
    }

}