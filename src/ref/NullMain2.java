package ref;

/*
* NullPointerException - 참조할 객체 인스턴스가 존재하지 않을때 발생
* */
public class NullMain2 {

    public static void main(String[] args) {
        Data data = null;
        data.value = 10;    // NullPointerException 예외 발생
        System.out.println("1. data = " + data.value);
    }
}
