/**
 * workRevise
 */

public class Box {

    double l;
    double h;
    double w;
    double weight = 1;

    static void greeting(){
        System.out.println("hey im in a box class. greeting");
     }

    Box(){
         // super(); ref immidiate parent class // to call the contructor // object class is baap of all the class
          this.l=-1;
          this.h=-1;
          this.w=-1;
    }

    Box (double side){
            
              this.l=side;
              this.h=side;
              this.w=side;
    }

    Box(double l , double h, double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }

    Box(Box work){
        this.l=work.l;
        this.h=work.h;
        this.w=work.w;
    }


    public void information(){
        System.out.println("Running the box");
    }


}
