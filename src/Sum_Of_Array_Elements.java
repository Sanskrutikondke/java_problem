import java.util.Arrays;

public class Sum_Of_Array_Elements {
    public static void main(String[] args) {
        //printing an array
        int [] a ={6,3,4,2,7,9,5};
        System.out.println(Arrays.toString(a));

        //sum of array elements
        int sum = 0;
        for (int e : a){
            sum = sum + e;
        }
        System.out.println("sum is : "+sum);
    }
}
