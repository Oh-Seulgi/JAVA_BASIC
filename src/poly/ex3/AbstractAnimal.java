package poly.ex3;

/*
* 추상클래스 (Abstract)
* 실체인 인스턴스가 존재하지 않고, 대신에 상속을 목적으로 사용되고, 부모 클래스 역할을 담당한다.
* 추상클래스는 클래스를 선언할 때 앞에 추상이라는 의미의 Abstract 키워드를 붙여주면 된다.
* 추상 클래스는 기존 클래스와 완전히 같다. 다만 new AbstractAnimal()와 같이 직접 인스턴스를 생성하지 못하는 제약이 추가된 것이다.
* */
public abstract class AbstractAnimal {

    /*
    * 추상 메서드 (Abstract)
    * 추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.
    * 추상 메서드는 바디가 없다. 바디 = {}
    * 추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 한다.
    * 오버라이딩 하지 않으면 자식 클래스도 추상클래스로 선언해야 한다.
    * */
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

}
