import java.util.Scanner;

class Carmove {
    String name;
    int x;
    int y;

    public Carmove(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveX(int o) {
        this.x += o;
    }

    public void moveY(int e) {
        this.y += e;
    }
}

public class Qd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("차 이름을 입력하세요: ");
            String name = sc.next();
            System.out.print("초기 x 좌표를 입력하세요: ");
            int x = sc.nextInt();
            System.out.print("초기 y 좌표를 입력하세요: ");
            int y = sc.nextInt();

            Carmove c = new Carmove(name, x, y);

            System.out.println("차 이름: " + c.name);
            System.out.println("초기 위치 : (" + c.getX() + ", " + c.getY() + ")");

            while (true) {
                System.out.print("차를 이동시키겠습니까? (yes/no): ");
                String d = sc.next();

                if (d.equalsIgnoreCase("no")) {
                    break;
                }

                System.out.print("이동할 x 좌표를 입력하세요! : ");
                int moveX = sc.nextInt();
                c.moveX(moveX);

                System.out.print("이동할 y 좌표를 입력하세요! : ");
                int moveY = sc.nextInt();
                c.moveY(moveY);

                System.out.println("움직인 후의 위치 : (" + c.getX() + ", " + c.getY() + ")");
            }

            System.out.println("최종 위치는 : (" + c.getX() + ", " + c.getY() + ")");
        }
    }
}
