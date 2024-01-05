package ref;

/*
* NullPointerException - 참조할 객체 인스턴스가 존재하지 않을때 발생
* */
public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException 예외 발생
        System.out.println("bigData.data.value = " + bigData.data.value);   // -> bigData.data이 null이므로 에러발생
    }
}
