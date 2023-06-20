import java.util.Arrays;
import java.util.Scanner;

public class nomor10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nArr = input.nextInt();
        int[] arr = new int[nArr];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Hasil :");
        nomor10 x = new nomor10();
        x.angkaDicari(arr);
    }

    public void angkaDicari(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}