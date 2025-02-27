    package Exercise01_abstraction.entity;

    import java.util.ArrayList;
    import java.util.Scanner;

    public class TuyenSinh implements ITuyenSinh{

        private Scanner scanner;
        private ArrayList<Student> listStudent;

        public TuyenSinh(){
            scanner = new Scanner(System.in);
            listStudent = new ArrayList<>();
        }
        @Override
        public void addStudent() {
            System.out.println("Nhập tên thí sinh: ");
            String name = scanner.nextLine();
            System.out.println("Nhập địa chỉ thí sinh: ");
            String address = scanner.nextLine();
            System.out.println("Nhập mức độ ưu tiên: ");
            int priority = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Nhập vào khối thí sinh chọn A, B , C: ");
            String block = scanner.nextLine();
            Student student = new Student(name,address,priority,new Block(block));
            listStudent.add(student);
            System.out.println("Nhập thí sinh thành công");
        }

        @Override
        public void showInfoStudent() {
        for (Student student : listStudent){
            System.out.println(student);
        }
        }

        @Override
        public void findById(int id) {

        }
    }
