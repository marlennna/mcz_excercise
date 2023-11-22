public class ActionBase {
public ActionBase(){

}

    public void execute(String[] paramsArray) {
        System.out.println("Generic action with parameters: ");
        for (String param:
                paramsArray) {
            System.out.println(param);
        }
    }
}
