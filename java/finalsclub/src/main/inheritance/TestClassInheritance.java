package main.inheritance;

public class TestClassInheritance {
    public static void main(String[] args) {

        A a = new A();
        a.methodA();

        B b = new B();
        b.methodB();

        A assignFromChild = new B();
        assignFromChild.methodA();

    }
}
