import java.util.Date;

public class DemoStringFormat {

    public static void main(String[] args) {

        String[] dish = new String[] {"Spätzle", "Palatschinken"};
        double[] price = new double[] {8.4, 7.2};
        double discount = 0.1;

        System.out.println(dish[0] + " " + price[0] * (1 - discount) + "€");
        System.out.println(dish[1] + " " + price[1] * (1 - discount) + "€");
        System.out.println();

        System.out.format("%-20s %.2f€\n", dish[0], price[0] * (1 - discount));
        System.out.format("%-20s %.2f€\n", dish[1], price[1] * (1 - discount));

        System.out.format("%th %tM\n", new Date(), new Date());
        System.out.println();

        String input = "Java";
        double zahl = 33434.123456;
        String s = String.format("|%.8f %.16s|", zahl, input);
        System.out.println(s);


    }
}
