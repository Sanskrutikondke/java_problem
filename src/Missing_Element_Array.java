public class Missing_Element_Array {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,6};
        int sum = 0 ;
        int sum_array = 0;
        for (int i = 1; i <=6 ; i++) {
            sum = sum+i;
        }
        for (int e :a){
            sum_array = sum_array+e;
        }
        int missing_element = sum -sum_array;
        System.out.println("the missing element is : "+missing_element);
    }
}
