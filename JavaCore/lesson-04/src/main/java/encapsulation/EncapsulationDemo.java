package encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Tính đóng gói
        // sử dụng để che giấu dữ liệu
        //1. sử dụng private cho thuộc tính
        //2. thêm getter/setter
        Account account = new Account(1000);
        account.setBalance(2000);
        System.out.println("account.getBalance() = " + account.getBalance());
    }
}
