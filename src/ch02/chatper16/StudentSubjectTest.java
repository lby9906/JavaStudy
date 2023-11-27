package ch02.chatper16;

public class StudentSubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");

        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        Student studentKim = new Student(1002, "kim");
        studentKim.addSubject("국어", 70);
        studentKim.addSubject("수학", 85);
        studentLee.addSubject("영어", 100);

        studentLee.showScoreInfo();
        System.out.println("=====================");
        studentKim.showScoreInfo();
    }
}
