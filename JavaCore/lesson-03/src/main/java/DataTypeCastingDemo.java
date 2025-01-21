public class DataTypeCastingDemo {
    public static void main(String[] args) {
        // Widening
        // byte -> short -> int -> long -> float -> double
        int a = 100;
        long b =  a ;

        // Narrowing
        // double -> float -> int -> short -> byte
        long c = 1000L;
        int d =(int) c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // áp dụng
        int x = 1;
        int y = 2;
        System.out.println(x / y);
        System.out.println((float) (x / y));
        System.out.println((float) x / y);
        System.out.println(x / (float) y);
        System.out.println((float) x / (float) y);

    }
}
