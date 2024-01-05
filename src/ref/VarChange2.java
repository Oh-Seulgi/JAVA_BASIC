package ref;

/*
* 참조형 변수 대입
* - 참조형은 참조값의 주소를 복사한 것이므로 value를 바꿔도 결국 dataA와 dataB는 같다.
* */
public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // 변수에 들어있는 참조값만 복사해서 전달한다.

        System.out.println("dataA 참조값: " + dataA);
        System.out.println("dataB 참조값: " + dataB);
        System.out.println("dataA.value: " + dataA.value);
        System.out.println("dataB.value: " + dataB.value);

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value: " + dataA.value);  // -> 20
        System.out.println("dataB.value: " + dataB.value);  // -> 20

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value: " + dataA.value);  // -> 30
        System.out.println("dataB.value: " + dataB.value);  // -> 30
    }
}
