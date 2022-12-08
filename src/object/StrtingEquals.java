package object;

public class StrtingEquals {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        // 서로 다른 인스턴스를 가리키고 있기 때문에 결과값은 false
        System.out.println(str1 == str2);
        /*
            equals 메서드가 인스턴스 주소값을 비교하여 값을 확인하지만,
            String클래스와 Integer클래스에서는 이미 재정의가 되어있다.
            String클래스에서는 equals()메서드가 같은 문자열인 경우 true, 아닐경우 false를 반환하도록 정의되어있음.
        */
        System.out.println(str1.equals(str2));

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        // 서로 다른 인스턴스를 가리키고 있기 때문에 결과값은 false
        System.out.println(i1 == i2);
        // Integer클래스에서는 equals()메서드가 같은 정수 값인 경우 true, 아닐경우 false를 반환하도록 정의되어있음.
        System.out.println(i1.equals(i2));
    }
}
