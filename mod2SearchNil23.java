import java.util.Scanner;
public class mod2SearchNil23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jmlNilai = input.nextInt();
        int[] arrNilai = new int[jmlNilai];
        
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            arrNilai[i] = input.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();
        int hasil = -1;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i+1;
                break;
            }
        }
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}