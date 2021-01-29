package 打印图形.平行四边形;

public class Parallelogram {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10-i; j++) {
                System.out.print(" ");
            }
            for (int m = 0; m < 10; m++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
