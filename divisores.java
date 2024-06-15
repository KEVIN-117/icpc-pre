
import java.util.Scanner;

public class Competenica {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i = 0; i < n; i++) {
            int num = cin.nextInt();
            int sum = 0;
            int sum2 = 0;
            byte flag2 = 0;
            byte flag3 = 0;
            for (int j = 1; j < num; j++) {
                if (num % j == 0) {
                    sum += j;
                }
            }
            if (sum == num) {
                System.out.println(num + " " + "perfecto");
            } else {
                for (int j = 1; j < sum; j++) {
                    if (sum % j == 0) {
                        sum2 += j;
                    }
                }
                if (num == sum2) {
                    flag2 = 1;
                }
                if (sum > num) {
                    flag3 = 1;
                }

                if (flag2 != 0 && flag3 != 0) {
                    System.out.println(num + " " + "romantico" + " " + "abundante");
                } else if (flag2 != 0) {
                    System.out.println(num + " " + "romantico");
                } else if (flag3 != 0) {
                    System.out.println(num + " " + "abundante");
                } else {
                    System.out.println(num + " " + "complicado");
                }
            }

        }
    }

}
