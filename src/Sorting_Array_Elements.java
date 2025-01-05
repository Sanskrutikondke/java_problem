import java.util.Arrays;

public class Sorting_Array_Elements {
    public static void main(String[] args) {
        int [] a= {8,1,5,9,12,33,23,7,4,3};
        System.out.println("Before sorting the array "+Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("After sorting the array "+Arrays.toString(a));
    }
}
