public class TriangleAction extends ActionBase {

    @Override
    public void execute(String[] paramArray){

        String reset = "\u001B[0m";

        try{
            int size = Integer.parseInt(paramArray[0]);
            char sign = paramArray[1].charAt(0);
            String color = paramArray[2];

            switch (color){
                case "red":
                    color = "\u001B[31m";
                    break;
                case "green":
                    color = "\u001B[32m";
                    break;
                case "yellow":
                    color = "\u001B[33m";
                    break;
                case "black":
                    color = "\u001B[30m";
                    break;
                case "gray":
                    color = "\u001B[37m";
                    break;
                case "blue":
                    color = "\u001B[34m";
                    break;
                case "purple":
                    color = "\u001B[35m";
                    break;
                case "cyan":
                    color = "\u001B[36m";
                    break;
                case "white":
                    color = "\u001B[0m";
                    break;
                default:
                    color = "\u001B[47m";
                    System.out.println("You chose incorrect color");
                    break;
            }

            for(int i = 1; i <= size; i++){
                for(int j = 1; j <= size-i; j++){
                    System.out.print(" ");
                }
                for(int k = 1; k<= 2*i-1; k++){
                    System.out.print(color + sign + reset);
                }
                System.out.print("\n");
            }



        }catch (Exception e){
            System.out.println("You need to provide three parameters: number, character, color (list in 'help')");
        }

    }

}
