package assignments.backend;

import assignments.entity.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNews {

    private static Scanner scanner = new Scanner(System.in);
    private static List<News> newsList = new ArrayList<>();
    public static void main(String[] args) {
        while (true){
            System.out.println("==== Menu ====");
            System.out.println("1. Insert news ");
            System.out.println("2. View List News");
            System.out.println("3. Average rate ");
            System.out.println("0. Exit");
            System.out.println("Mời bạn chọn chức năng");
            int chooseMenu = scanner.nextInt();
            scanner.nextLine();
            switch (chooseMenu){
                case 1:
                    inserNew();
                    break;
                case 2:
                    viewListNews();
                    break;
                case 3:
                    averageRate();
                    break;
                case 0:
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Chọn chức năng 0-3 ");
                    break;
            }
        }
    }

    private static void averageRate() {
        System.out.println("Chức năng tính điểm đánh giá và hiển thị danh sách news: ");
        for (News news : newsList) {
            news.caculate();
            news.display();
        }
    }

    private static void viewListNews() {
        System.out.println("Chức năng hiển thị danh sách news: ");
        for (News news : newsList) {
            news.display();
        }
    }

    private static void inserNew() {
        System.out.println("Nhập title: ");
        String title = scanner.nextLine();
        System.out.println("Nhập publishDate");
        String publishDate = scanner.nextLine();
        System.out.println("Nhập Author ");
        String author = scanner.nextLine();
        System.out.println("Nhập Content ");
        String content = scanner.nextLine();
        System.out.println("Nhập 3 đánh giá cho news: ");
        int[] rates = new int[3];
        for (int i = 0; i < rates.length; i++) {
            System.out.println("Đánh giá " + (i+1) + ": ");
            int rate = scanner.nextInt();
            scanner.nextLine();
            rates[i] = rate;
        }
        News news = new News(title,publishDate,author,content,rates);
        newsList.add(news);
        System.out.println("Thêm thành công");
    }
}
