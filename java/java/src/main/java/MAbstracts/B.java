package MAbstracts;

public interface B {
    default void show() {
        System.out.println("B's default method");
    }
}
