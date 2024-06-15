import java.util.Scanner;

/**
 *
 * @author PC16
 */
public class factores {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String builder = "";
        int n = x.nextInt();
        int aux = n;
        for (int i = 2; i <= n / 2; i++) {
            while (aux % i == 0) {
                aux /= i;
                builder += "x" + i;
            }
        }
        if (builder.isEmpty()) {
            System.out.println(n);
        } else {
            System.out.println(builder.substring(1));
        }
    }
}