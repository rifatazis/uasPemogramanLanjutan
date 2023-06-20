import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nArr = input.nextInt();

        int[] arr = new int[nArr];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int n =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0){
               n++;
            }
        }
        System.out.println("Banyak kelipatan 5 ada " + n);
    }
}