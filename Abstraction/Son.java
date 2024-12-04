package Polymorphism.Abstract;

public class Son extends Parent {

    Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();  //using super onvoke from son class and using son class access in the main method
    }

    @Override
    public void Carrier() {
        System.out.println("coding is my carrier");
    }

    @Override
    public void Partener() {
        System.out.println("my partner is my laptop");
    }


// 1) in our class their is method called abstract then we need to create class as abstract
// 2) we cant create obect of abstract class 
// 3) in abstract class not a abstract static method
// 4) abstract constructor not in class 
// 5) in abstract class their is static method, normal method, variable, constructor are allowed
// 6) we cant create abstract method is final

}
