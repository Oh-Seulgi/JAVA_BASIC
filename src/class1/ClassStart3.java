package class1;

/*
* 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
* */
public class ClassStart3 {

    public static void main(String[] args) {
        Student Student1;
        Student1 = new Student();
        Student1.name = "학생1";
        Student1.age = 15;
        Student1.grade = 90;

        // Student2은 Student의 인스턴스이다.
        Student Student2 = new Student();   // 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
        Student2.name = "학생2";
        Student2.age = 16;
        Student2.grade = 80;

        System.out.println("이름: " + Student1.name + " 나이: " + Student1.age + " 성적: " + Student1.grade);
        System.out.println("이름: " + Student2.name + " 나이: " + Student2.age + " 성적: " + Student2.grade);
    }
}
