package az.turingacademy.lessons.abstraction;

public class CarApp {
    public static void main(String[] args) {

    }
    Car car = new Car() {

        @Override
        public void drive() {
            System.out.println("Car is driving");
        }

        @Override
        public boolean stop() {
            return false;
        }

        Car Wrangler = new Car() {
            @Override
            public void drive() {

            }

            @Override
            public boolean stop() {
                return false;
            }
        };
    };
}
