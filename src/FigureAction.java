public class FigureAction extends ActionBase{

    @Override
    public void execute(String[] paramArray){

        String shape = paramArray[0];
        double area, perimeter, a, b, c, d, h, d1, d2;

        try{
            switch (shape) {
                case "triangle":
                    a = Double.parseDouble(paramArray[1]);
                    b = Double.parseDouble(paramArray[2]);
                    c = Double.parseDouble(paramArray[3]);
                    h = Double.parseDouble(paramArray[4]);
                    area = 0.5*a*h;
                    perimeter = a+b+c;
                    System.out.println("TRIANGLE:\na: "+a+"\nb: "+b+"\nc: "+c+"\nh: "+h);
                    System.out.println("Area: "+area+"\nPerimeter: "+perimeter);
                    break;
                case "square":
                    a = Double.parseDouble(paramArray[1]);
                    System.out.println("SQUARE:\na: "+a);
                    area = a*a;
                    perimeter = 4*a;
                    System.out.println("Area: "+area+"\nPerimeter: "+perimeter);
                    break;
                case "rectangle":
                    a = Double.parseDouble(paramArray[1]);
                    b = Double.parseDouble(paramArray[2]);
                    System.out.println("RECTANGLE:\na: "+a+"\nb: "+b);
                    area = a*b;
                    perimeter = 2*a + 2*b;
                    System.out.println("Area: "+area+"\nPerimeter: "+perimeter);
                    break;
                case "rhombus":
                    a = Double.parseDouble(paramArray[1]);
                    h = Double.parseDouble(paramArray[2]);
                    System.out.println("RHOMBUS:\na: "+a+"\nh: "+h);
                    area = a*h;
                    perimeter = 4+a;
                    System.out.println("Area: "+area+"\nPerimeter: "+perimeter);
                    break;
                case "trapezoid":
                    a = Double.parseDouble(paramArray[1]);
                    b = Double.parseDouble(paramArray[2]);
                    c = Double.parseDouble(paramArray[3]);
                    d = Double.parseDouble(paramArray[4]);
                    h = Double.parseDouble(paramArray[5]);
                    System.out.println("TRAPEZOID: \na: "+a+"\nb: "+b+"\nc: "+c+"\nd: "+d+"\nh: "+h);
                    area = a+b*h/2;
                    perimeter = a+b+c+d;
                    System.out.println("Area: "+area+"\nPerimeter: "+perimeter);
                    break;
                case "kite":
                    a = Double.parseDouble(paramArray[1]);
                    b = Double.parseDouble(paramArray[2]);
                    d1 = Double.parseDouble(paramArray[3]);
                    d2 = Double.parseDouble(paramArray[4]);
                    System.out.println("KITE: \na: "+a+"\nb: "+b+"\nd1: "+d1+"\nd2: "+d2);
                    area = 0.5*d1*d2;
                    perimeter = 2*a+2*b;
                    System.out.println("Area: "+area+"\nPerimeter: "+perimeter);
                    break;
                default:
                    System.out.println("You chose incorrect figure (informations in help)");

            }
        }catch (Exception e){
            System.out.println("You need to provide the appropriate number of parameters - numbers (informations in help)");
        }


    }
}
