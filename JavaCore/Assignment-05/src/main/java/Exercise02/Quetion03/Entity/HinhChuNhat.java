package Exercise02.Quetion03.Entity;

public class HinhChuNhat {
    protected float a;
    protected float b;


   public float TinhDienTich(){
       return a*b;
   }

   public float TinhChuVi(){
       return 2*(a+b);
   }

    public HinhChuNhat(float a, float b) {
        super();
        this.a = a;
        this.b = b;
    }
}
