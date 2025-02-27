package Exercise01_abstraction.backend;

import Exercise01_abstraction.entity.News;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
    private Scanner scanner;
    private ArrayList<News> listNews;

    public MyNews(){
        scanner = new Scanner(System.in);
        listNews = new ArrayList<>();
    }
    public void question01(){
        loadMenu();
    }

    private void loadMenu() {
        while (true){
            System.out.println("===========Menu===========");
            System.out.println("== Lua chon chuc nang ====");
            System.out.println("1. Insert New");
            System.out.println("2. View New list");
            System.out.println("3. Average rate");
            System.out.println("0. Exit");
            System.out.println("==========================");
            int chosseMenu = scanner.nextInt();
            scanner.nextLine();
            switch (chosseMenu){
                case 1:
                    insertMenu();
                    break;
                case 2:
                    viewListNew();
                    break;
                case 3:
                    avarageRate();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Moi bạn chọn đúng chức năng");
                    break;
            }
        }
    }

    private void avarageRate() {
        System.out.println("Tính avarageRate: ");
        for (News news : listNews){
            news.Calculate();
        }
    }

    private void viewListNew() {
        System.out.println("Chức năng hiển thị: ");
        for (News news : listNews){
            news.Display();
        }
    }

    private void insertMenu() {
        System.out.println("Nhập title: ");
        String title = scanner.nextLine();
        System.out.println("Nhập publishDate" );
        String publishDate = scanner.nextLine();
        System.out.println("Nhập author: " );
        String author = scanner.nextLine();
        System.out.println("Nhập Content: ");
        String content = scanner.nextLine();

        System.out.println("Nhap 3 đánh giá cho rate: ");
        int[] rates = new int[3];
        for (int i =0; i<rates.length;i++){
            System.out.println("Đánh gia: " + i + ": ");
            int rate = scanner.nextInt();
            scanner.nextLine();
            rates[i] = rate;
        }
        News news = new News(title,publishDate,author,content,rates);
        listNews.add(news);
        System.out.println("Thêm thành cong!");
    }

}
