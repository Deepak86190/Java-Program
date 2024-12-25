class Animal{
    void eat(){
        System.out.println("Eating..");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Barking...");
    }
}
public class TestInheritence {
    public static void main (String []args){
        Dog d1=new Dog();

        d1.eat();
    }

}
