package Polymorphism.Abstract;

public abstract class Parent {


    int age;

    Parent(int age){
        this.age = age;
    }

    void normal(){
        System.out.println("this is my normal method present in the abstract class using sub-class i can access");
    }

    static void name(){
        System.out.println("my name is the coder");
    }

    abstract void Carrier();

    abstract void Partener();
    
}
