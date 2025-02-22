package Exercise01.Question01;

import java.util.ArrayList;
import java.util.Scanner;


public class demo {
    private  static Scanner scanner = new Scanner(System.in);
    private  static ArrayList<News> newsList = new ArrayList<>();
    public static void main(String[] args) {

        while (true){
            System.out.println("Menu: ");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("0. Exit");
            System.out.println("Choose an option: ");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    InserNew();
                    break;
                case 2:
                    ViewList();
                    break;
                case 3:
                    AverageRate();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Không có trong lựa chọn.Vui lòng chọn lại");

            }
        }
    }

    private static void AverageRate() {
        for (News n : newsList) {
            n.Calculate();
            n.Display();
            System.out.println("--------------------");
        }
    }

    private static void ViewList() {
        for (News n : newsList) {
            n.Display();
            System.out.println("--------------------");
        }
    }

    private static void InserNew() {
        News news = new News();
        System.out.print("Enter title: ");
        news.setTitle(scanner.nextLine());
        System.out.print("Enter publish date: ");
        news.setPublishDate(scanner.nextLine());
        System.out.print("Enter author: ");
        news.setAuthor(scanner.nextLine());
        System.out.print("Enter content: ");
        news.setContent(scanner.nextLine());

        int[] rates = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter rate " + (i + 1) + ": ");
            rates[i] = scanner.nextInt();
        }
        scanner.nextLine(); // Consume newline

        news.setRates(rates);
        newsList.add(news);
        System.out.println("News inserted successfully!");

    }
}
