public class Even_Odd_Array {
    public static void main(String[] args) {
        int [] a = {4,3,2,6,7,5,9};
        System.out.println("the below are even numbers available in array");
        for (int e : a){
            if (e%2==0){
                System.out.print(e+ " ");
            }
        }
        System.out.println();
        System.out.println("the below are even numbers available in array");
        for (int e : a){
            if(e%2!=0){
                System.out.print(e+ " ");
            }
        }
    }
}
