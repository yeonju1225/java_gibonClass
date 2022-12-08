package object;

// 나 혼자 코딩 - toString메서드
class Student {
    String studentName;
    Long studentID;

    public Student(String studentName, Long studentID) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String toString() {
        return studentName + ", " + studentID;
    }
}

public class ToStringStudent {
    public static void main(String[] args) {
        Student student = new Student("임연주", 2018132029L);
        Student student1 = student;
        Student student2 = new Student("김유경", 324204920L);

        if (student == student1) {
            System.out.println("student와 student1의 주소는 같습니다.");
        } else {
            System.out.println("student와 student1의 주소는 다릅니다.");
        }

        if (student.equals(student1)) {
            System.out.println("student와 student1의 주소는 같습니다.");
        } else {
            System.out.println("student와 student1의 주소는 다릅니다.");
        }

        if (student == student2) {
            System.out.println("student1과 student2의 주소는 같습니다.");
        } else {
            System.out.println("student1과 student2의 주소는 다릅니다.");
        }

        if (student.equals(student2)) {
            System.out.println("student와 student2의 주소는 같습니다.");
        } else {
            System.out.println("student와 student2의 주소는 다릅니다.");
        }

        System.out.println(student);
        System.out.println(student.toString());
    }
}
