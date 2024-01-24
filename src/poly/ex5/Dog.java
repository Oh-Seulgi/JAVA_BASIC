package poly.ex5;

/*
* interface를 참조할 경우 extends가 아닌 implements를 사용한다.
* */
public class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
