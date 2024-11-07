import java.util.Scanner;
public class NilaiMhs23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        int[] nilai = new int[jmlMhs];
        int totalNilai = 0;
        int nilaiTertinggi = Integer.MIN_VALUE; 
        int nilaiTerendah = Integer.MAX_VALUE;
        
    for (int i = 0; i < jmlMhs; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilai[i] = sc.nextInt();
        totalNilai += nilai[i];
        if (nilai[i] > nilaiTertinggi) {
            nilaiTertinggi = nilai[i];
        }
        if (nilai[i] < nilaiTerendah) {
            nilaiTerendah = nilai[i];
        }
    }
    double rata2 = (double) totalNilai / jmlMhs;
    System.out.println("nilai yang dimasukkan:");
    for (int i = 0; i < jmlMhs; i++) {
        System.out.println("Nilai mahasiswa ke-" + (i+1) +": "+nilai[i]);
    }
    System.out.println("Rata-rata nilai mahasiswa: "+ rata2);
    System.out.println("Nilai tertinggi: " + nilaiTertinggi);
    System.out.println("Nilai terendah: "+ nilaiTerendah);
    } 

}
