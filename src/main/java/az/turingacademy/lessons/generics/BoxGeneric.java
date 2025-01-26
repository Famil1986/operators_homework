package az.turingacademy.lessons.generics;

public class BoxGeneric <T> {
    private T object;
    public BoxGeneric (T object) {
        this.object = object;
    }
    public T getObject() {
        return object;
    }

    public void setObject (T object) {
        this.object = object;
    }
}
