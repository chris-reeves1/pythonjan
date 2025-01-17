package MAbstracts;

public interface A {
    default void show() {
        System.out.println("A's default method");
    }
}
