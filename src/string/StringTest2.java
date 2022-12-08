package string;

public class StringTest2 {
    public static void main(String[] args) {
        String javastr = new String("java");
        String androidstr = new String("android");

        System.out.println(javastr);
        System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(javastr));

        javastr = javastr.concat(androidstr);

        System.out.println(javastr);
        System.out.println("연결된 문자열 주소 값 : " + System.identityHashCode(javastr));
    }
}
