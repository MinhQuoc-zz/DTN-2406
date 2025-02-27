package Exercise02.question07;

public class Position {
    public static int COUNT = 0;
    private int id;
    private PositionName name;

    @Override
    public String toString() {
        return "Positon{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
    public Position(){
        super();
        this.id = ++COUNT;
        System.out.println("Chọn vị trí muốn nhập 1.Dev, 2.Test, 3.Scrum_Master, 4.PM  ");
        while (true){
            int choosePos = ScannerUltis.inputIntPositive();
            switch (choosePos) {
                case 1:
                    this.name = PositionName.DEV;
                    return;

                case 2:
                    this.name = PositionName.TEST;
                    return;

                case 3:
                    this.name = PositionName.SCRUM_MASTER;
                    return;

                case 4:
                    this.name = PositionName.PM;
                    return;
                default:
                    System.err.println("Chọn lại: ");
            }

        }
    }
}
