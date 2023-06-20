import java.util.Scanner;
public class nomor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nArr = input.nextInt();
        input.nextLine();
        String[] arr = new String[nArr];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextLine();
        }
        System.out.println("Masukkan teks apa yang ingin di cari ");
        String find = input.nextLine();

        nomor6 x = new nomor6();
        x.angkaDicari(arr, find);
    }

    public void angkaDicari(String[] arr, String find) {
        int indeks = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(find)){
                System.out.println(find + " ada di indeks ke- " +i);
                indeks = 0;
            }
        }
        if (indeks == -1){
            System.out.println("tidak ada");
        }
    }
}