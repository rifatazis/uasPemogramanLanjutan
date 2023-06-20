import java.util.Scanner;

public class NomorEmpat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] arr = new String[10];

        int panjang;
        int nPanjang5 = 0;
        for (int i = 0; i <arr.length; i++) {
            arr[i] = input.nextLine();
            panjang = arr[i].length();
            if (panjang == 5){
                nPanjang5++;
            }
        }
        System.out.println(nPanjang5);
    }
}