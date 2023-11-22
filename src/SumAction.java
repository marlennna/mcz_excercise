public class SumAction extends ActionBase{
    @Override
    public void execute(String[] paramsArray) {
        int sum = 0;
        for (String param:
                paramsArray) {
            try{
                sum+=Integer.parseInt(param);
            }catch(NumberFormatException e){
                System.out.println(e);
            }
        }
        System.out.println("Sum is "+sum);
    }
}
