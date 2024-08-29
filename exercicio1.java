import java.util.Scanner;

public class estudo {
    public static void main(String[] args) {
        int x, y, s;
        Scanner dado;
        dado = new Scanner(System.in);
        x = dado.nextInt();
        y = dado.nextInt();

        s = x + y;
        System.out.println(s);

        dado.close();

    }

}
