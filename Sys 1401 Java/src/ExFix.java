import java.util.Locale;
import java.util.Locale;

public class ExFix {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;

        System.out.println("Products");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f %n", product2,price2);
        System.out.println();
        System.out.printf("Record %d years old, code 5290 and gender: %s %n", age,gender);
        System.out.println();
        System.out.printf("Measure with eigth decimal places: %.6f %n", measure);
        System.out.println();
        System.out.printf("Rounded (three decimal places): %.2f %n", measure);

        Locale.setDefault(new Locale("en", "US"));

        System.out.printf("US decimal point %.2f %n", measure );







    }
}
