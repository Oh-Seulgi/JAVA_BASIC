package extends1.overriding;

/*
* Override - 부모(Car)의 기능을 자식(ElectricCar)이 새로 재정의하는 것을 메서드 오버라이딩이라고 한다.
*  */
public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
