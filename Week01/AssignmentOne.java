public class AssignmentOne {
    public static void main(String[] args) {


 System.out.println("---------Q1--------------");
int rows = 5;
        for(int i= 5; i > 2 ; i--){
            for(int j = 0; j < i  ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }



 System.out.println("---------Q2--------------");

        for(int i= 0; i < 4 ; i++){
        for(int j = 0; j <= i  ; j++)
        {
        System.out.print("*");
            }
                    System.out.println();
        }


        System.out.println("---------Q3--------------");
        int a = 1, b = 2;
        String calculationType1 = "square";
        System.out.println("Square: "+CalculateCubeOrSquare(a,b, calculationType1));

        int c = 3;
        int d = 5;
        String calculationType2 =  "cube";
        System.out.println("Cube: "+ CalculateCubeOrSquare(c,d, calculationType2));
    }

    public static int CalculateCubeOrSquare(int a, int b, String calculationType){
        int result;
        if(calculationType.equals("square")){
            result = (a*a) + (b*b) + (2*a*b);
        }
        else if(calculationType.equals("cube")){
            result = (a*a*a) + (b*b*b) + (3*a*a*b) + (3*a*b*b);
        }
        else {result = 0;}
        return result;
    }
}