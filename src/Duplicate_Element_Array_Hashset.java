import java.util.HashSet;

public class Duplicate_Element_Array_Hashset {
    public static void main(String[] args) {
        int[] a={3,4,5,3,6,4};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if(set.add(a[i])==false){
                System.out.println(a[i]+ " is duplicated");
            }
        }
    }

}
