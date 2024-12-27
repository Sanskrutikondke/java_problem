import java.util.Arrays;

public class Compairing_Array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4,5};

//        if(Arrays.equals(a,b)){
//            System.out.println("arrays are equal");
//        }
//        else {
//            System.out.println("arrays are not equal");
//        }
        
        //without inbuilt method
        boolean comparison = true;
        if (a.length == b.length){
            for (int i = 0; i < a.length; i++) {
                if(a[i]!=b[i]){
                    comparison = false;
                    break;
                }
            }
        }
        else {
            comparison = false;
        }
        if (comparison){
            System.out.println("both arrays are equal");
        }
        else {
            System.out.println("both arrays are not equal");
        }
    }
}
