package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10);    // 기본 생성자가 없는 경우 직접 지정 호출 해줘야 함.
        System.out.println("ClassC 생성자");
    }
}
