package poly.ex4;

/*
* 순수 추상 클래스 (모두 abstract가 붙은 경우)
* abstract가 붙은 경우는 실행로직과 섞어서 사용 가능하다
* 실행 로직을 전혀 가지고 있지 않다.
* 단지 다형성을 위한 부모 타입으로써 껍데기 역할만 제공할 뿐이다.
* */
public abstract class AbstractAnimal {
    public abstract void sound();
    public abstract void move();
}
