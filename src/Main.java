// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Optional;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter command: (type quit to exit)");
        ActionProvider.registerAction("help",new HelpAction());
        ActionProvider.registerAction("add",new AddAnimalAction());
        ActionProvider.registerAction("sum",new SumAction());
        while(true){
            String user_string = input.nextLine();
            System.out.println("User entered string: "+user_string);
            String[] parts = user_string.split(" ", 2);
            String action_cmd = parts[0];
            String[] params_array = {""};
            if(parts.length>1) {
                String params_string = parts[1];
                params_array = params_string.split(" ");
            }
            var action = ActionProvider.get(action_cmd);
            if(action.isPresent()){
                action.get().execute(params_array);
            }
            if(user_string.equals("quit")){
                break;
            }
        }
    }
}