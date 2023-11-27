public class HelpAction extends ActionBase{
    @Override
    public void execute(String[] paramsArray) {
//        System.out.println("Pomoc - Tu np nie ma zadnych parametrow wiec nie korzystamy z dostarczonych");
        System.out.println("You can write: \n-> help \n-> add \n-> sum \n-> sub (subtraction) \n-> triangle \n->qe (quadratic equation) \n-> quit");
        System.out.println("\nColors: white, black, blue, cyan, red, purple, green, yellow, gray");
    }
}
