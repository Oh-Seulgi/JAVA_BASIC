package class1;

/*
* 배열 도입
* */
public class ClassStart5 {

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
        Student[] students = new Student[]{student1, student2};
//        Student[] students = {student1, student2}; // new Student[] 생략가능
        for(int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }

        for(int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        // 향상된 for문 (iter 단축키!!!)
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
