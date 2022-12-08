package object;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}

//객체를 복제해도 된다는 의미로 Cloneable인터페이스 함께 선언.
class Circle implements Cloneable{
    Point point;
    int radius;

    Circle(int x, int y, int radius) {
        this.radius = radius;
        point = new Point(x, y);
    }

    public String toString() {
        return "원점은 " + point + "이고, 반지름은 " + radius + "입니다.";
    }

    @Override
    public Object clone() throws CloneNotSupportedException { // clone메서드를 사용할 때 발생할 수 있는 오류 예외 처리
        return super.clone();
    }
}
public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10, 20, 30);
        // clone 메서드를 사용하여 circle 인스턴스를 copyCircle에 복제
        Circle copyCircle = (Circle) circle.clone();

        System.out.println(circle);
        System.out.println(copyCircle);
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));
    }
}
