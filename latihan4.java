import java.util.Scanner;
public class latihan4 {
    public static void main(String[] args) {
        int[] nilai = new int[10];
        int total = 0;
        double rataRata;

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkann 10 nilai bulat:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai ke- " + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }
        rataRata = (double) total / nilai.length;
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}