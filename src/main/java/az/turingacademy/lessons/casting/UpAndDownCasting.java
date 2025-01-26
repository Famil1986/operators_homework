package az.turingacademy.lessons.casting;

public class UpAndDownCasting {
    public static void main(String[] args) {
        A obj = new B();
        obj.print();      //upcast - ancaq parent class-i gorur
        B obj1 = (B) obj;
        obj1.print();     //downcast - her iki classi gorur
        obj1.print2();

    }

}

 class A  {
    public void print () {
        System.out.println("In class A");
     }

}

class B extends A {
    public void print2 () {
        System.out.println("In class B");
    }
}
