package extends1.ex3;

/*
* extends Car = Car 부모 class를 상속받는다.
* 단일 상속만 가능하다. 다중 extends 사용 불가
*  */
public class ElectricCar extends Car {

    public void charge() {
        System.out.println("충전합니다.");
    }
}
