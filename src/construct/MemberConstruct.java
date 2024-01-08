package construct;

/*
* 생성자
* - 생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자로 시작한다.
* - 생성자는 반환 타입이 없다. 비워두어야 한다.
* - 나머지는 메서드와 같다.
* */
public class MemberConstruct {
    // 멤버변수
    String name;
    int age;
    int grade;

    // 추가 (오버로딩)
    /*MemberConstruct(String name, int age) {  // 매개변수
        this.name = name;
        this.age = age;
        this.grade = 50;
    }*/

    // 추가 (오버로딩) - 위 코드를 아래처럼 중복 제거 할 수 있다.
    // this()는 생성자 코드의 첫줄에만 작성 할 수 있다.
    MemberConstruct(String name, int age) {  // 매개변수
        this(name, age, 50);
    }

    // 생성자
    MemberConstruct(String name, int age, int grade) {  // 매개변수
        System.out.println("생성자 호출 name: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
