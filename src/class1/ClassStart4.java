package class1;

/*
* 배열 도입
* */
public class ClassStart4 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        // Student2은 Student의 인스턴스이다.
        Student student2 = new Student();   // 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }
}
