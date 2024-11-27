package az.turingacademy.lessons.encapsulation;

public class CarApp {

    public static void main(String[] args) {

        Car mercedes = new Car("mercedes", "white", 250);
        Car tesla=new Car("tesla","black",10);
        String teslaModel=tesla.getModel();
        System.out.println(teslaModel);
        System.out.println("1-"+tesla);
        tesla.setModel("tesla S");
        System.out.println("2-"+tesla);
        tesla.setSpeed(40);
        System.out.println("3-"+tesla);


//        System.out.println(tesla);

    }
}
