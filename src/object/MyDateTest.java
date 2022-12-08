package object;

class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int hashCode() {
        return day * 10 + month * 101 + year * 102;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyDate) {
            MyDate myDate = (MyDate)obj;
            if (this.day == myDate.day
                    && this.month == myDate.month
                    && this.year == myDate.year) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(25,12,2022);
        MyDate myDate2 = new MyDate(25,12,2022);

        System.out.println(myDate1.equals(myDate2));
        System.out.println(myDate1.hashCode());
        System.out.println(myDate2.hashCode());
    }
}
