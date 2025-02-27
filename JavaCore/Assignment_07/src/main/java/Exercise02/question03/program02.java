package Exercise02.question03;

public class program02 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};

       try {
           System.out.println(numbers[10]);
       } catch (Exception e){
           System.out.println("Không có numbers thứ 10");
       } finally {
           System.out.println("Hoàn thành ");
       }
    }
}
