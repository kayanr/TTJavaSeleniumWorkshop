public class Question4 {
    public static void main(String[] args) {
        int[] numbers = {54, 43, 2, 1, 5};
        arrayTraversalReverse(numbers);
        System.out.println("\n----------------------");
        int[] results = {324, 5,2,2};
        arrayTraversalReverse(results);
    }

    public static void arrayTraversalReverse(int[] a){
        for(int i = a.length -1 ; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }
}
