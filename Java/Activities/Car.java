package Activities.Session1;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public void displayCharacteristics(){
        System.out.println("Number of doors of car :"+doors);
        System.out.println("Number of tyres of car :"+tyres);
        System.out.println("Make of the car :"+make);
        System.out.println("transmission of car :"+transmission);
        System.out.println("color of car :"+color);
    }
    public void accelarate(){
        System.out.println("Car is moving forward.");
    }
    public void brake(){
        System.out.println("Car has stopped.");
    }
}
