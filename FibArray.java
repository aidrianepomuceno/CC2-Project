package FibArray;
public class FibArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        display(array);
    }
    static void display(int [] ar){
        for (int j = 0; j < ar.length; j++){
            System.out.println("f(" + ar[j] + "):\t"+ fibonacci(ar[j]));
            }
        }
    static int fibonacci(int nth){
        if (nth <= 1){
        return nth;
        }
        else{
        return fibonacci(nth - 1) + fibonacci(nth - 2);    
        }
        
    }
}


