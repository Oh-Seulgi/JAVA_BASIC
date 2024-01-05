package ref;


/*
* 변수와 초기화
* */
public class InitMain {

    public static void main(String[] args) {
        InitData data = new InitData(); // -> new로 생성된 멤버 변수는 자동으로 초기화 된다.
        System.out.println("value1 = " + data.value1);  // -> value1은 초기값 지정하지 않았지만 멤버 변수라 0으로 초기값 세팅
        System.out.println("value2 = " + data.value2);
    }
}
