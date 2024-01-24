package poly.ex6;

/*
* 하나의 클래스에서 여러 인터페이스
* extends를 통한 상속은 하나만 할 수 있고
* implements를 통한 인터페이스는 다중 구현 할 수 있음
* 따라서 둘이 함께 나온 경우 extends가 먼저 나와야 한다.
* */
public class Bird extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
