public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i ++) {
            System.out.println(i);
        }

        for (int o = 10; o > 0; o = o - 1) {
            System.out.println(o);
        }

        for (int a = 0; a <= 17; a = a + 2) {
            System.out.println(a);
        }

        for (int s = 10; s >= -10; s --) {
            System.out.println(s);
        }

        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        for (int seven = 7; seven <= 98; seven = seven + 7) {
            System.out.println(seven);
        }

        for (int d = 1; d <= 512; d = d * 2) {
            System.out.println(d);
        }

        int salary = 29000;
        int total = 0;
        for (int mounth = 1; mounth <= 12; mounth ++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + mounth + " сумма накоплений равна " + total + " рублей.");
        }

        int e = 2;
        int r = 1;
        for (int t = 1; t <= 10; t++) {
            r = t * 2;
            System.out.println(e + "*" + t + "=" + r);
        }
    }
}