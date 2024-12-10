package az.turingacademy.lessons.abstraction;

public class Wrangler extends SUV {
    Car wrangler = new Car() {

        @Override
        public void drive() {

        }

        @Override
        public boolean stop() {
            return false;
        }
    };

}
