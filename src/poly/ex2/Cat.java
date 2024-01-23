package poly.ex2;

/*
* 다형적 참조를 사용한 메서드 오버라이딩 예제
* */
public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("냐옹");
    }
}
