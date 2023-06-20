import java.util.Scanner;

public class kelipatan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nArr = input.nextInt();

        int[] arr = new int[nArr];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0){
                System.out.println(arr[i] + " adalah kelipatan 5");
            }else{
                System.out.println(arr[i] + " bukan kelipatan 5");
            }
        }
    }
}