import java.util.function.Function;

public class QuadraticEquation extends ActionBase{

    @Override
    public void execute(String[] paramArray){

        try{
            int a = Integer.parseInt(paramArray[0]);
            int b = Integer.parseInt(paramArray[1]);
            int c = Integer.parseInt(paramArray[2]);

            System.out.println("Your equation: "+a+"x^2 + "+b+"x + "+c);

            int delta = 0;

            if (a == 0) {
                System.out.println("'a' cannot be 0");
                return;
            }else{
                delta = (b*b)-(4*a*c);
            }

            if(delta > 0){
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Two solutions: {"+x1+"; "+x2+"}");
            } else if (delta == 0) {
                double x0 = -b / (2*a);
                System.out.println("One solution: {"+x0+"}");
            }else{
                System.out.println("No solutions");
            }


        }catch (Exception e){
            System.out.println("You need to provide three numbers a, b, c (ax^2 + bx +c)");
        }
    }
}
