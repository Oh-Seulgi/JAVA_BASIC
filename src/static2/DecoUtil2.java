package static2;

/*
* static 정적 메서드
* - 인스턴스 생성이 필요없는 경우에 사용
* */
public class DecoUtil2 {

    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
