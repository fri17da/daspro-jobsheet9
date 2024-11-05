import java.util.Scanner;
public class elemen10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Isi array secara terbalik adalah:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + numbers[i]);
        }
    }
}