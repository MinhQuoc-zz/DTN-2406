package assignment.exercise2.question1;

class MyMath {
    // Khai báo biến final PI
    public static final float PI = 3.14f;

    // Method tính tổng của a và PI
    public static int min(int a, int b){
        return a < b ? a : b;
    }

    public static int sum(int a, int b){
        return a + b;
    }
    public static float sum(int a){
        return a + PI;
    }
        // Thử thay đổi giá trị của PI (sẽ gây lỗi)
        // math.PI = 3.15; // Lỗi biên dịch: cannot assign a value to final variable 'PI'

}
