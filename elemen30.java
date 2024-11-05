public class elemen30 {
    public static void main(String[] args) {
        int [] numbers = new int[30];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Elemen ke-" + (i+1) + ": " + numbers[i]);
        }
    }
}