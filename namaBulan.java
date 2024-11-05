import java.util.Scanner;

public class namaBulan {
public static void main(String[] args) {
    String[] bulan = {
        "Januari", "Februari", "Maret", "April",
         "Mei", "Juni", "Juli", "Agustus", "September",
         "Oktober", "November", "Desember"
    };
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan angka bulan (1-12): ");
    int bulanInput =sc.nextInt();

    if (bulanInput >= 1 && bulanInput <= 12) {
        System.out.println("Bulan ke-" + bulanInput + " adalah " + bulan[bulanInput - 1] + ".");
    } else {
        System.out.println("Input tidak valid. Harap masukkan angka antara 1 dan 12.");
    }
    }
}