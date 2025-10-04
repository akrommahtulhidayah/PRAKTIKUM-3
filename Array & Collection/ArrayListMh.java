import java.util.ArrayList;

public class ArrayListMh {
    public static void main(String[] args) {
        System.out.println("=== DATA NILAI MAHASISWA ===");
        
        // Membuat ArrayList untuk menyimpan nilai mahasiswa (Integer)
        ArrayList<Integer> nilaiMhs = new ArrayList<>();
        
        // Menambah nilai mahasiswa ke dalam ArrayList
        nilaiMhs.add(85); // Mahasiswa 1
        nilaiMhs.add(70); // Mahasiswa 2
        nilaiMhs.add(78); // Mahasiswa 3
        nilaiMhs.add(95); // Mahasiswa 4
        
        // Menampilkan semua nilai mahasiswa
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < nilaiMhs.size(); i++) {
            System.out.println((i + 1) + ". Nilai: " + nilaiMhs.get(i));
        }
        
        // Studi kasus: mahasiswa ke-2 (nilai 70) mengundurkan diri → datanya dihapus
        nilaiMhs.remove(1); // hanya sekali
        
        // Menampilkan daftar nilai mahasiswa setelah penghapusan
        System.out.println("\nDaftar nilai mahasiswa setelah penghapusan (mahasiswa ke-2 keluar):");
        for (int i = 0; i < nilaiMhs.size(); i++) {
            System.out.println("Mahasiswa " + (i + 1) + ". Nilai: " + nilaiMhs.get(i));
        }
        
        // Menampilkan jumlah mahasiswa sekarang
        System.out.println("\nJumlah mahasiswa sekarang: " + nilaiMhs.size());
    }
}
