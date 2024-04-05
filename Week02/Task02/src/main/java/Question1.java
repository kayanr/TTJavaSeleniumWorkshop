public class Question1 {
    public static void main(String[] args) {
     int a = 1;
     int b = 2;
     int c = 3;
     int result = find_greatest_number(a, b, c);
     System.out.println("The greatest number is: " + result);
     a = 2;
     b = 2;
     c = 5;

     result = find_greatest_number(a, b, c);
     System.out.println("The greatest number is: " + result);

    }

    //Given three numbers a, b, c you need to find which is the greatest of them all
    public static int find_greatest_number(int a, int b, int c){
        int greatestValue = 0;
        greatestValue = a;
        if(b > greatestValue ){
            greatestValue = b;
        }
        if(c> greatestValue){
            greatestValue = c;
        }

        return greatestValue;
    }
}
