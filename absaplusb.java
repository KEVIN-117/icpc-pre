import java.util.Scanner;

/**
 *
 * @author PC16
 */
public class absaplusb {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        while (x.hasNext()) {            
            long a =  x.nextLong();
            long b = x.nextLong();
            System.out.println(add(a, b));
        }
        
    }
    
    public static long add(long a, long b){
        return abs(a + b );
    }
    
    public static long abs(long a) {
        return (a < 0) ? -a : a;
    }
}