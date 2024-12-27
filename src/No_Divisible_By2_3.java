public class No_Divisible_By2_3 {
    public static void main(String[] args) {
        for (int i = 1; i <=25; i++) {
            if(i%2==0 && i%3==0){
                System.out.print(i+ ", ");
            }
        }
    }
}
