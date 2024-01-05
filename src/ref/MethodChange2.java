package ref;


/*
* 참조형 메서드 호출
* */
public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value);
        System.out.println("dataA 참조값: " + dataA);
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value);
    }

    private static void changeReference(Data dataX) {
        System.out.println("dataX 참조값: " + dataX);
        dataX.value = 20;
    }
}
