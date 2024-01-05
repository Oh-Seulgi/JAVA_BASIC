package ref;


/*
* 기본형 변수 대입
* - 기본형은 변수에 들어 있는 실제 사용하는 값을 복사해서 대입한다.
* */
public class VarChange1 {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a: " + a + ", b: " + b);

        // a 변경
        a = 20;
        System.out.println("변경 a: " + a + ", b: " + b);

        // b 변경
        b = 30;
        System.out.println("변경 b: " + a + ", b: " + b);
    }
}
