package Activities.Session1;

public class Activity1 {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.tyres =4;
        car1.doors=4;
        car1.make = 2014;
        car1.color="Black";
        car1.transmission="Manual";

        car1.displayCharacteristics();
       //--------------------------
        car1.brake();
     //------------------
        car1.accelarate();
    }
}
