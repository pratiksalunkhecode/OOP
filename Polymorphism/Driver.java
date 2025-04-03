package Polymorphism;

import javax.swing.Box;

public class Driver {
    
       public static void main(String[] args) {
        
                    shapes a = new shapes();

                   
                    a.area();

                   shapes c = new circle(); // left side reponsible for the access method 
                   //variable etc and right side responsible for the run 

                    c.area();


       }

// late binding 
// -compile time is done at the time of run application that time decide which method can run is called late binding 

// early binding 
// - suppose you have use final at the create method and try to ovrride that time compiler said you cant ovveride the method is called early binding.


// you can create class as final that time impliciatly said inside class all the final
// you cant create class as final
}
