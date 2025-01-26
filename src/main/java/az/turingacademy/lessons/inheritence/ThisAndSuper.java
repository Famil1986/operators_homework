package az.turingacademy.lessons.inheritence;


class A {
    public A () {
        super();                      //super hemishe var default olaraq
        System.out.println("In A");
    }
    public A (int n){
        super();
        System.out.println("In A int");
    }
}

class B extends A {

    public B () {
        super();
        System.out.println("In B");
    }

    public B (int n) {
        this();                    //burda super evezine this() yazilsa eyni classdaki bosh konstructor cagirilacaq
        System.out.println("In B int");
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {

        B obj = new B(6);

    }
}
