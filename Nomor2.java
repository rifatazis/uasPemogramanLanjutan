import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String teks = input.nextLine();
        int panjang = teks.length();

        if (panjang == 5){
            System.out.println("panjang teks adalah 5 karakter");
        }else {
            System.out.println("panjang teks bukan 5");
        }
    }
}
