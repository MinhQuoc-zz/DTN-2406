package Exercise01.Question03.BacKend;

import Exercise01.Question03.Entity.News;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<News> listNews = new ArrayList<>();
    public static void main(String[] args) {
        while (true){
            System.out.println("=========Menu==========");
            System.out.println("== Lựa chọn chắc năng==");
            System.out.println("1. Insert news         ");
            System.out.println("2. View list new       ");
            System.out.println("3. Average rate        ");
            System.out.println("4. Exit                ");
            System.out.println("=======================");
            int menuChoose = scanner.nextInt();
            scanner.nextLine();
            switch (menuChoose){
                case 1:
                    System.out.println("Nhập vào title: ");
                    String title = scanner.nextLine();
                    System.out.println("Nhập vào publishDate: ");
                    String publishDate = scanner.nextLine();
                    System.out.println("Nhập author: ");
                    String author = scanner.nextLine();
                    System.out.println("Nhập content: ");
                    String content = scanner.nextLine();
                    System.out.println("Nhập vào đánh giá 1 ");
                    int rate1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập vào đánh giá 2 ");
                    int rate2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập vào đánh giá 3 ");
                    int rate3 = scanner.nextInt();
                    scanner.nextLine();
                    int[] rates = {rate1, rate2, rate3};
                    News news = new News(title,publishDate, author, content,rates);
                    listNews.add(news);
                    break;
                case 2:
                    for(News news1 : listNews){
                        news1.display();
                    }
                    break;
                case 3:
                    System.out.println("Đánh giá trung bình Rate ");
                    for(News news1 : listNews){
                        System.out.println("Title: " + news1.getTitle() + " RateAvg " + news1.calculate());
                    }
                    break;
                case 4:
                    return;

                default:
                    System.out.println("Mời bạn chọn đúng chuc năng menu ");
                    break;
            }
        }
    }
}
