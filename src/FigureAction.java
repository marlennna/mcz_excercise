import java.security.spec.ECField;

public class FigureAction extends ActionBase{

    @Override
    public void execute(String[] paramArray){

        String shape = paramArray[0];

        try{
            switch (shape) {
                case "triangle":
                    System.out.println("triangle");
                    break;
                case "square":
                    System.out.println("square");
                    break;
                case "rectangle":
                    System.out.println("rectangle");
                    break;
                case "rhombus":
                    System.out.println("Rhombus");
                    break;
                case "trapezoid":
                    System.out.println("Trapezoid");
                    break;
                case "kite":
                    System.out.println("kite");
                    break;
                default:
                    System.out.println("You chose incorrect figure");

            }
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
