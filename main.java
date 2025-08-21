import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sg = new Scanner(System.in);

        System.out.println("Hi, Plz Enter Your Name:");
        String str = sg.nextLine();

        System.out.println("Hey " + str + ",");
        System.out.println(
            "1. Dal Fry - 40\n" +
            "2. Paneer Butter Masala - 100\n" +
            "3. Chicken Curry - 120\n" +
            "4. Fish Fry - 100\n" +
            "5. Tomato Curry - 30\n" +
            "6. Mutton Biryani - 150\n" +
            "7. Veg Pulao - 80\n" +
            "8. Egg Curry - 60\n" +
            "9. Butter Naan - 20\n" +
            "10. Gobi Manchurian - 90"
        );
        System.out.println("Select Your Menu:");
        int a = sg.nextInt();

        int b, price;

        switch (a) {
            case 1:
                System.out.println("Please Enter Quantity:");
                b = sg.nextInt();
                System.out.println("You Selected Dal Fry. Pay " + 40 * b + " Rupees");
                price = sg.nextInt();
                if (price == 40 * b) {
                    System.out.println("Order Placed. Kindly Wait.");
                } else {
                    System.out.println("You Entered Wrong Amount");
                }
                break;

            case 2:
                System.out.println("Please Enter Quantity:");
                b = sg.nextInt();
                System.out.println("You Selected Paneer Butter Masala. Pay " + 100 * b + " Rupees");
                price = sg.nextInt();
                if (price == 100 * b) {
                    System.out.println("Order Placed. Kindly Wait.");
                } else {
                    System.out.println("You Entered Wrong Amount");
                }
                break;

            case 3:
                System.out.println("Please Enter Quantity:");
                b = sg.nextInt();
                System.out.println("You Selected Chicken Curry. Pay " + 120 * b + " Rupees");
                price = sg.nextInt();
                if (price == 120 * b) {
                    System.out.println("Order Placed. Kindly Wait.");
                } else {
                    System.out.println("You Entered Wrong Amount");
                }
                break;

            case 4:
                System.out.println("Please Enter Quantity:");
                b = sg.nextInt();
                System.out.println("You Selected Fish Fry. Pay " + 100 * b + " Rupees");
                price = sg.nextInt();
                if (price == 100 * b) {
                    System.out.println("Order Placed. Kindly Wait.");
                } else {
                    System.out.println("You Entered Wrong Amount");
                }
                break;

            case 5:
                System.out.println("Please Enter Quantity:");
                b = sg.nextInt();
                System.out.println("You Selected Tomato Curry. Pay " + 30 * b + " Rupees");
                price = sg.nextInt();
                if (price == 30 * b) {
                    System.out.println("Order Placed. Kindly Wait.");
                } else {
                    System.out.println("You Entered Wrong Amount");
                }
                break;

            case 6:
                System.out.println("Please Enter Quantity:");
                b = sg.nextInt();
                System.out.println("You Selected Mutton Biryani. Pay " + 150 * b + " Rupees");
                price = sg.nextInt();
                if (price == 150 * b) {
                    System.out.println("Order Placed. Kindly Wait.");
                } else {
                    System.out.println("You Entered Wrong Amount");
                }
                break;

            case 7:
                System.out.println("Please Enter Quantity:");
                b = sg.nextInt();
                System.out.println("You Selected Veg Pulao. Pay " + 80 * b + " Rupees");
                price = sg.nextInt();
                if (price == 80 * b) {
                    System.out.println("Order Placed. Kindly Wait.");
                } else {
                    System.out.println("You Entered Wrong Amount");
                }
                break;

            case 8:
                System.out.println("Please Enter Quantity:");
                b = sg.nextInt();
                System.out.println("You Selected Egg Curry. Pay " + 60 * b + " Rupees");
                price = sg.nextInt();
                if (price == 60 * b) {
                    System.out.println("Order Placed. Kindly Wait.");
                } else {
                    System.out.println("You Entered Wrong Amount");
                }
                break;

            case 9:
                System.out.println("Please Enter Quantity:");
                b = sg.nextInt();
                System.out.println("You Selected Butter Naan. Pay " + 20 * b + " Rupees");
                price = sg.nextInt();
                if (price == 20 * b) {
                    System.out.println("Order Placed. Kindly Wait.");
                } else {
                    System.out.println("You Entered Wrong Amount");
                }
                break;

            case 10:
                System.out.println("Please Enter Quantity:");
                b = sg.nextInt();
                System.out.println("You Selected Gobi Manchurian. Pay " + 90 * b + " Rupees");
                price = sg.nextInt();
                if (price == 90 * b) {
                    System.out.println("Order Placed. Kindly Wait.");
                } else {
                    System.out.println("You Entered Wrong Amount");
                }
                break;

            default:
                System.out.println("Invalid Option!");
        }

        sg.close();
    }
}
