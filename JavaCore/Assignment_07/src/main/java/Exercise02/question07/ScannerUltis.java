package Exercise02.question07;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerUltis {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.next().trim());
            } catch (Exception e) {
                System.err.println("Nhập lại:");
            }
        }
    }

    public static int inputIntPositive() {
        while (true) {
            try {
                int intPositive = Integer.parseInt(sc.next());
                if (intPositive >= 0) {
                    return intPositive;
                } else {
                    System.err.println("Nhập lại:");
                }

            } catch (Exception e) {
                System.err.println("Nhập lại:");
            }

        }
    }

    public static Float inputFloat(String mes) {
        while (true) {
            try {
                return Float.parseFloat(sc.next());
            } catch (Exception e) {
                System.err.println("Nhập lại:");
            }
        }
    }

    public static Double inputDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.next());
            } catch (Exception e) {
                System.err.println("Nhập lại:");
            }
        }
    }

    public static String inputString() {
        while (true) {
            String string = sc.nextLine().trim();
            if (!string.isEmpty()) {
                return string;
            } else {
                System.err.println("Nhập lại:");
            }
        }
    }

    public static LocalDate inputLocalDate() {
        System.out.println("Nhập theo định dạng yyyy-MM-dd");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        while (true) {
            String localdate = sc.next().trim();
            try {
                if (format.parse(localdate) != null) {
                    LocalDate lc = LocalDate.parse(localdate);
                    return lc;
                }
            } catch (Exception e) {
                System.err.println("Nhập lại:");
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập 1 số nguyên: ");
        int intvalue = ScannerUltis.inputInt();
        System.out.println("Số nguyên đã nhập là: " + intvalue);
    }

}
