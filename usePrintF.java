import java.util.Calendar;
import java.util.Locale;

public class usePrintF
{
    public static void main(String[] args)
    {
        int n = 461012;
        
        System.out.printf("%d%n", n);
        System.out.printf("%08d%n", n);
        System.out.printf("%+8d%n", n);
        System.out.printf("%,d%n", n);
        System.out.printf("%+,8d%n%n", n);
        System.out.println("*Nathan Dilla's Work*");
        
        double pi = Math.PI;
        
        System.out.printf("%f%n", pi);
        System.out.printf("%.3f%n", pi);
        System.out.printf("%10.3f%n", pi);
        System.out.printf("%-10.3f%n", pi);
        System.out.printf(Locale.FRANCE, "%.3f%n%n", pi);
        
        Calendar c = Calendar.getInstance();
        System.out.printf("%tB, %te, %tY%n", c, c, c);
        
        System.out.printf("%tl:%tM %tp%n", c, c, c);
        
        System.out.printf("%tD%n", c);
        
        System.out.println("*Nathan Dilla's Work*");
        
    }
}
