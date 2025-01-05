import java.util.Scanner;

public class Searching_Element_Array {
    public static void main(String[] args) {
        int [] a={8,1,5,9,12,33,23,7,4,3};
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number");
        int n = s.nextInt();
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (n ==a[i]){
                found = true;
                System.out.println(n+" is found at the index "+i);
                break;
            }
        }
        if (!found){
            System.out.println(n+" is not found in the array");
        }
        s.close();
    }
}
