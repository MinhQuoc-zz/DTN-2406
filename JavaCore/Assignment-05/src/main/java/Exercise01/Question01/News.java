package Exercise01.Question01;

public class News implements INews{
    private int Id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] Rates = new int[3];

    public int[] getRates() {
        return Rates;
    }

    public void setRates(int[] rates) {
        Rates = rates;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(float averageRate) {
        this.averageRate = averageRate;
    }

    @Override
    public void Display() {
        System.out.println("title = " + title);
        System.out.println("publishDate = " + publishDate);
        System.out.println("author = " + author);
        System.out.println("content = " + content);
        System.out.println("averagaRate = " + averageRate);
    }

    @Override
    public float Calculate() {
        // khai báo mảng
        int sum = 0;
        for (int rate : this.Rates) {
            sum += rate;
        }
        this.averageRate = (float) sum / this.Rates.length;
        return this.averageRate;
    }
}

