import java.util.Scanner;
public class Kafe23 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah pesanan: ");
    int jmlPesanan = sc.nextInt();
    sc.nextLine();

    String[] namaPesanan = new String[jmlPesanan];
    double[] hargaPesanan = new double[jmlPesanan];

    for (int i = 0; i < jmlPesanan; i++) {
        System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
        namaPesanan[i] = sc.nextLine();
        if (namaPesanan[i].equalsIgnoreCase("END")){
            jmlPesanan = i;
            break;
        }
        System.out.print("Masukkan harga " + namaPesanan[i] + ": "+ hargaPesanan[i]);
        hargaPesanan[i] = sc.nextDouble();
    }
    double totalBiaya = 0;
    for (double harga : hargaPesanan) {
        totalBiaya += harga;
    }
    System.out.println("Daftar Pesanan:");
    for (int i = 0; i < jmlPesanan; i++) {
        System.out.println(namaPesanan[i] + ": Rp " + hargaPesanan[i]);
    }
    System.out.println("Total biaya : Rp" + totalBiaya);
    }
}