public class SubAction extends ActionBase{
    @Override
    public void execute(String[] paramsArray) {

        try {
            int sub = Integer.parseInt(paramsArray[0]);
            for (String param : paramsArray) {
                    sub -= Integer.parseInt(param);
            }
            sub += Integer.parseInt(paramsArray[0]);
            System.out.println("Difference is " + sub);
            } catch (NumberFormatException e) {
                System.out.println("You need to provide parametrs (sub numbers)");
            } catch (Exception e) {
                System.out.println(e);
            }
    }

}
