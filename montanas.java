import java.util.Scanner;

/**
 *
 * @author PC16
 */
public class montanas {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String x = cin.next();
        int acum = 0; 
        int index = 0;
        int acumPrev = 0;
        int i = 0;
        while (i < x.length()) {            
            if (x.charAt(i) == '+') {
                acum++;
            }else{
                acum--;
            }
            if (acum > acumPrev) {
                index = i;
                acumPrev = acum;
            }
            i++;
        }
        System.out.println(index+1);
    }
}