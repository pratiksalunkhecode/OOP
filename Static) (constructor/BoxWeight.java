public class BoxWeight extends Box {

   double Weight;

   BoxWeight() {
      this.Weight = -1;
   }


   static void greeting(){
      System.out.println("hey im in a boxWeiting class. greeting");
   }

   BoxWeight(double l, double h, double w, double Weight){
            super(l, h, w); // what is this ? call the parent class contructor
            // used ini value present in parent class
           

           System.out.println(super.weight);

           this.Weight=Weight;
   }



}
