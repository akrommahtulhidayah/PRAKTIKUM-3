import java.io.*;
import java.util.*;

public class ExceptionHandlingMahasiswa {

    // === Contoh 'throws' (checked exception) ===
    // Method ini bisa melempar IOException jika file tidak ditemukan
    public static void bacaFile(String namaFile) throws IOException {
        File file = new File(namaFile);

        // Jika file belum ada, buat file baru agar tidak error
        if (!file.exists()) {
            System.out.println("\nFile '" + namaFile + "' belum ada. Membuat file baru...");
            file.createNewFile();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("\n=== Data Mahasiswa dari File ===");
            String line;
            boolean kosong = true;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                kosong = false;
            }

            if (kosong) {
                System.out.println("(File masih kosong — belum ada data mahasiswa yang disimpan)");
            }
        }
    }

    // === Contoh 'throw' (manual exception) ===
    public static void cekUmur(int umur) {
        if (umur < 17) {
            throw new IllegalArgumentException("Umur minimal 17 tahun untuk menjadi mahasiswa!");
        }
        System.out.println("Umur valid, data mahasiswa dapat disimpan.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // === Input data mahasiswa ===
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            // === Jenis Exception: InputMismatchException ===
            System.out.print("Masukkan Umur: ");
            int umur = input.nextInt();
            cekUmur(umur); // bisa lempar IllegalArgumentException

            // === Jenis Exception: ArithmeticException ===
            System.out.print("Masukkan total nilai: ");
            int totalNilai = input.nextInt();

            System.out.print("Masukkan jumlah mata kuliah: ");
            int jumlahMK = input.nextInt();

            // Jika jumlahMK = 0 → akan memicu ArithmeticException
            int rataRata = totalNilai / jumlahMK;
            System.out.println("Rata-rata nilai: " + rataRata);

            // === Jenis Exception: IOException / FileNotFoundException ===
            System.out.print("\nMasukkan nama file data mahasiswa: ");
            input.nextLine(); // bersihkan buffer
            String namaFile = input.nextLine();

            bacaFile(namaFile); // method ini bisa melempar IOException

            // === Tampilkan Data Mahasiswa ===
            System.out.println("\n=== Data Mahasiswa Dimasukkan ===");
            System.out.println("NIM  : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println("Umur : " + umur);
            System.out.println("Rata-rata nilai: " + rataRata);

        } 
        // === Blok catch menangani berbagai jenis exception ===
        catch (InputMismatchException e) {
            System.out.println(" Error: Input harus berupa angka untuk umur/nilai!");
        } 
        catch (ArithmeticException e) {
            System.out.println(" Error: Pembagian dengan nol saat menghitung rata-rata!");
        } 
        catch (FileNotFoundException e) {
            System.out.println(" Error: File data mahasiswa tidak ditemukan!");
        } 
        catch (IOException e) {
            System.out.println(" Error IO: " + e.getMessage());
        } 
        catch (IllegalArgumentException e) {
            System.out.println(" Kesalahan: " + e.getMessage());
        } 
        // === Blok finally ===
        finally {
            System.out.println("\n Finally: Program input mahasiswa selesai dijalankan.");
            input.close();
        }
    }
}