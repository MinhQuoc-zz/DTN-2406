package Exercise02.question04;

public class program04 {
    public static void main(String[] args) {
        Department department1 = new Department("Dep1");
        Department department2 = new Department("Dep2");
        Department department3 = new Department("Dep3");
        Department department4 = new Department("Dep4");
        Department[] departments = {department1,department2,department3,department4};

        try {
            System.out.println(departments[10]);
        }catch (Exception e){
            System.out.println("Không tìm thấy phần tử thứ 10 trong mảng");
        }
    }

}

