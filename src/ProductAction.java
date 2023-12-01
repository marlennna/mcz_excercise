import java.sql.SQLOutput;
import java.util.Scanner;

public class ProductAction extends ActionBase{

    @Override
    public void execute(String[] paramArray){
        Scanner input = new Scanner(System.in);

        try{
            if(paramArray.length==1) {
                int number = Integer.parseInt(paramArray[0]);
                String name, price;
                String[] names = new String[number];
                String[] prices = new String[number];

                System.out.println("[in input - name, price]");


                for (int i = 0; i < number; i++) {
                    System.out.println("Write name and price of " + (i + 1) + " product: ");
                    String user_string = input.nextLine();

                    String[] parts = user_string.split(", ");
                    name = parts[0];
                    price = parts[1];

                    char pierwszyZnak = price.charAt(0);
                    if (!Character.isDigit(pierwszyZnak)) {
                        System.out.println("An incorrect price has been entered, you need to try again");
                        return;
                    }

                    names[i] = name;
                    prices[i] = price;
                }

                System.out.println("Your products: ");
                for (int i = 0; i < number; i++) {
                    System.out.println((i + 1) + ". " + names[i] + " - " + prices[i]);
                }
            }else{
                System.out.println("You need to provide one parameter - number");
            }

        }catch (Exception e){
            System.out.println("Incorrect data");
        }
    }
}
