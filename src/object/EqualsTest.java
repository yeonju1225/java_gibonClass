package object;

class StudentSchool {
    int studentID;
    String studentName;

    public StudentSchool(String studentName, int studentID) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public int hashCode() {
        return studentID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StudentSchool) {
            StudentSchool student = (StudentSchool) obj;
            if (this.studentID == student.studentID) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        StudentSchool student = new StudentSchool("임연주", 111);
        StudentSchool student1 = student;
        StudentSchool student2 = new StudentSchool("임연주", 111);

        /*if (student == student1) {
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
        }*/

        System.out.println("student의 hashCode : " + student.hashCode());
        System.out.println("student2의 hashCode : " + student2.hashCode());

        System.out.println("student의 실제 주소값 : " + System.identityHashCode(student));
        System.out.println("student2의 실제 주소값 : " + System.identityHashCode(student2));
    }
}
