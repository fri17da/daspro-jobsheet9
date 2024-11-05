import java.util.Scanner;
public class latihan5 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 19, 7, 3, 8, 15, 7, 22, 7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n =  sc.nextInt();

        boolean ditemukan = false;

        System.out.print("Nilai " + n + "ditemukan di lokasi indeks: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                System.out.print(i + " ");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ditemukan di dalam array.");
        }
    }
}