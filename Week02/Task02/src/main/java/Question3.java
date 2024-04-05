public class Question3 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorial(n));
    }

    //Given an integer N. Write a program to return the factorial of N
    public static int factorial(int n){
        int result = 0;
        if(n == 0 || n == 1)
            result = 1;
        if (n > 1){
            result = n * factorial(n-1);
        }
        return result;
    }
}
