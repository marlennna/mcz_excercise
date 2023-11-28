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


                for (int i = 0; i < number; i++) {
                    System.out.println("Write name and price of " + (i + 1) + " product: ");
                    String user_string = input.nextLine();

                    String[] parts = user_string.split(" "); //dzieli parametry
                    name = parts[0]; //przypisuje nazwe do zmiennej
                    price = parts[1]; //przypisuje cene do zmiennej

                    names[i] = name;
                    prices[i] = price;
                }

                System.out.println("Your products: ");
                for (int i = 0; i < number; i++) {
                    System.out.println((i + 1) + ". " + names[i] + " " + prices[i]);
                }
            }else{
                System.out.println("You need to provide one param - number");
            }

        }catch (Exception e){
            System.out.println("You need to provide one param - number");
        }
    }
}
