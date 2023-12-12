package homework_12_12_23;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(250.5f, 2500, "White", new byte[]{0,0,0});


        Truck truck = new Truck(5600,new byte[]{100, 0, 100}, false );

       truck.setValues(150.5f, 6000, "Red", new byte[]{112,0,100}, true);
        System.out.println(truck.getValues());
    }
}
