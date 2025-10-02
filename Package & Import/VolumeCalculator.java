import java.util.Scanner;

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input panjang sisi kubus
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        // hitung volume kubus = sisi^3
        double volume = Math.pow(sisi, 3);

        // Tampilkan hasil
        System.out.println("Volume kubus adalah: " + volume);

        scanner.close();
    }
}
