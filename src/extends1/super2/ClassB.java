package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        this(a, 0); // this를 호출해도 되지만 한번은 super를 호출해야한다.
//        super();    // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super();    // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}
