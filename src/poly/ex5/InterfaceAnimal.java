package poly.ex5;

/*
* interface - 순수 추상 클래스 (모두 abstract가 붙은 경우)
* 실행 로직을 전혀 가지고 있지 않다.
* 단지 다형성을 위한 부모 타입으로써 껍데기 역할만 제공할 뿐이다.
* */
public interface InterfaceAnimal {
    void sound(); // public abstract 생략
    void move();  // public abstract 생략
}
