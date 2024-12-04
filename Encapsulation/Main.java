public class Main {

    public static void main(String[] args) {

        // Box work1 = new Box();

        // System.out.println(work1.l+ " " + work1.h+ " "+ work1.w);

        // Box onePara = new Box(5);

        // System.out.println(onePara.l+ " " + onePara.h+ " " + onePara.w);

        BoxWeight box1 = new BoxWeight();

        System.out.println(box1.Weight);

        Box b = new BoxWeight(); // static is not dependant on object thats why is run Box greeting
        // static method we can not ovveride
        // static method you can inherite but you cant ovveride
        b.greeting();




        // Box box2 = new Box();
        // System.out.println(box2.Weight); // in case create parent class object then
        // we cant access child class member

        // Box box5 = new BoxWeight(2,23,3,45);
        // System.out.println(box5.Weight); only left side ref variable you can access
        // not child class only access parent class member

        // BoxWeight box6 = new Box(1,2,3);
        // System.out.println(box6.Weight); // java tell or say dont know which classs
        // present in below then how can you access thats why this issue is come.

    }

}
