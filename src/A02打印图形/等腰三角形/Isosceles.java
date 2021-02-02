package A02打印图形.等腰三角形;

public class Isosceles {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i+2; k++) {
                System.out.print("#");
            }
            for (int m = 0; m < i; m++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}