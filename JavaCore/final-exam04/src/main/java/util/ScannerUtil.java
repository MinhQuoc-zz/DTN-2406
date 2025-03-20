package util;

import java.util.Scanner;

public class ScannerUtil {
    private static  final Scanner SCANNER = new Scanner(System.in);

    public static String inputString(){
        return SCANNER.nextLine().trim().replaceAll("\\s{2,}", "");
    }

    public static int inputInt(){
        while (true){
            try {
                String input = inputString();
                return Integer.parseInt(input);
            }catch (NumberFormatException exception){
                System.err.println("Yêu cầu nhập lại số nguyên");
                System.out.println("Nhập lại: ");
            }
        }
    }
    public static String inputEmail(){
        while (true){
            String input = inputString();
            if(input.contains("@")){
                return input;
            }else {
                System.err.println("Yêu cầu nhập lại email có chứ @");
                System.err.println("Nhập lại: ");
            }
        }
    }

    public static String inputPassword(){
        while (true){
            String input = inputString();
            int length = input.length();
            if(length < 6 || length >12){
                System.err.println("Yêu cầu nhập lại password từ 6 đến 12 ký tự");
                System.err.println("Nhập lại: ");
            } else if (hasAnyUpperCaseCharacter(input)) {
                return input;
            }else {
                System.err.println("Yêu cầu nhập lại email có chứa 1 ký tự viết hoa");
                System.err.println("Nhập lại: ");
            }
        }
    }

    private static boolean hasAnyUpperCaseCharacter(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }

    public static String inputFullName(){
        while (true){
            String input = inputString();
            if(hasAllAlphabeticCharacter(input)){
                return input;
            }else {
                System.err.println("Yêu cầu nhập lại full name chỉ chứa chữ");
                System.err.println("Nhập lại: ");
            }
        }
    }

    private static boolean hasAllAlphabeticCharacter(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(Character.isWhitespace(c)){
                continue;
            }
            if (Character.isAlphabetic(c)){
                return false;
            }
        }
        return true;
    }
}
