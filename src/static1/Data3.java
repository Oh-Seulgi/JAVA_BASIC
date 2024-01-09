package static1;

/*
* static
* - static이 붙은 멤버 변수는 메서드 영역에서 관리한다.
* */
public class Data3 {
    public String name;
    public static int count;    // static (정적 변수)

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
