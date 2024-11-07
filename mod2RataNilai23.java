import java.util.Scanner;

public class mod2RataNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa :");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double total = 0;
        double lulus = 0, tdkLulus = 0;
        double totalLulus = 0, totalTdkLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
            totalLulus += nilaiMhs[i];
            lulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                tdkLulus++;
            }
        }
        double rata2Lulus = (lulus > 0) ? (totalLulus / lulus) : 0;
        double rata2TdkLulus = (tdkLulus > 0) ? (totalTdkLulus / tdkLulus) : 0;
        System.out.println("Rata-rata nilai lulus = "+rata2Lulus);
        System.out.println("Rata-rata tidak lulus = "+rata2TdkLulus);
    }
}