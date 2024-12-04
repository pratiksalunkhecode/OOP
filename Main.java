package Polymorphism.Abstract;

public class Main {

    public static void main(String[] args) {

        Son son = new Son(23);

        son.normal();

        son.Carrier();

        Dughter dug = new Dughter(25);

        dug.Carrier();

        dug.Partener();

        // Parent mom = new Parent(); // you can not create object of abstract class

        Parent.name();
    }

}
