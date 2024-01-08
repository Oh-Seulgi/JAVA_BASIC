package construct;

/*
* 매개변수랑 멤버변수랑 이름이 같을 경우 this로 처리한다.
* */
public class MemberInit {
    // 멤버변수
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {  // 매개변수
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
